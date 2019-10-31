package br.edu.unisep.jobsmanager.domain.usecase.job;

import br.edu.unisep.jobsmanager.domain.builder.JobBuilder;
import br.edu.unisep.jobsmanager.domain.dto.job.JobDto;
import br.edu.unisep.jobsmanager.model.repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListAvailableJobsUseCase {

    private JobRepository repository;

    public List<JobDto> execute() {
        var jobs = repository.findAllAvailable(LocalDate.now());

        return jobs.stream()
                .map(JobBuilder::toJobDto)
                .collect(Collectors.toList());
    }

}

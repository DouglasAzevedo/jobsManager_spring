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
public class ListByIndustryUseCase {

    private JobRepository repository;

    public List<JobDto> execute(Integer industry) {
        var jobs = repository.findAllAvailableByIndustry(LocalDate.now(), industry);

        return jobs.stream()
                .map(JobBuilder::toJobDto)
                .collect(Collectors.toList());
    }
}

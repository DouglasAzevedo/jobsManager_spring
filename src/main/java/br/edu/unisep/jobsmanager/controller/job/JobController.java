package br.edu.unisep.jobsmanager.controller.job;

import br.edu.unisep.jobsmanager.domain.dto.job.JobDto;
import br.edu.unisep.jobsmanager.domain.usecase.job.ListAvailableJobsUseCase;
import br.edu.unisep.jobsmanager.domain.usecase.job.ListByIndustryUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/job")
public class JobController {

    private ListAvailableJobsUseCase listAvailableJobsUseCase;
    private ListByIndustryUseCase listByIndustryUseCase;

    @GetMapping
    public List<JobDto> listAvailable() {
        return listAvailableJobsUseCase.execute();
    }

    @GetMapping("/byIndustry/{industry}")
    public List<JobDto> listByIndustry(@PathVariable("industry") Integer industry) {
        return listByIndustryUseCase.execute(industry);
    }
}

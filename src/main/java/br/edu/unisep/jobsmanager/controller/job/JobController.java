package br.edu.unisep.jobsmanager.controller.job;

import br.edu.unisep.jobsmanager.domain.dto.job.JobDto;
import br.edu.unisep.jobsmanager.domain.dto.job.NewJobDto;
import br.edu.unisep.jobsmanager.domain.usecase.job.ListAvailableJobsUseCase;
import br.edu.unisep.jobsmanager.domain.usecase.job.ListByIndustryUseCase;
import br.edu.unisep.jobsmanager.domain.usecase.job.NewJobUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/job")
public class JobController {

    private ListAvailableJobsUseCase listAvailableJobsUseCase;
    private ListByIndustryUseCase listByIndustryUseCase;
    private NewJobUseCase newJobUseCase;

    @GetMapping
    public List<JobDto> listAvailable() {
        return listAvailableJobsUseCase.execute();
    }

    @GetMapping("/byIndustry/{industry}")
    public List<JobDto> listByIndustry(@PathVariable("industry") Integer industry) {
        return listByIndustryUseCase.execute(industry);
    }

    @PostMapping
    public void save(@RequestBody NewJobDto newJob) {
        newJobUseCase.execute(newJob);
    }

}

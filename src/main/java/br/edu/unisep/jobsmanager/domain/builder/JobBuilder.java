package br.edu.unisep.jobsmanager.domain.builder;

import br.edu.unisep.jobsmanager.domain.dto.job.JobDto;
import br.edu.unisep.jobsmanager.model.entity.Job;

public class JobBuilder {

    public static JobDto toJobDto(Job job) {
        return JobDto.builder()
                .id(job.getId())
                .availableFrom(job.getAvailableFrom())
                .availableUntil(job.getAvailableUntil())
                .title(job.getTitle())
                .description(job.getDescription())
                .salary(job.getSalary())
                .vacancies(job.getVacancies())
                .company(job.getCompany().getName())
                .industry(job.getCompany().getIndustry().getName())
                .build();
    }

}

package br.edu.unisep.jobsmanager.domain.builder;

import br.edu.unisep.jobsmanager.domain.dto.job.JobDto;
import br.edu.unisep.jobsmanager.domain.dto.job.NewJobDto;
import br.edu.unisep.jobsmanager.model.entity.Company;
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

    public static Job fromNewJobDto(NewJobDto newJob) {
        var company = Company.builder()
                .id(newJob.getCompanyId())
                .build();

        return Job.builder()
                .title(newJob.getTitle())
                .description(newJob.getDescription())
                .salary(newJob.getSalary())
                .vacancies(newJob.getVacancies())
                .availableFrom(newJob.getAvailableFrom())
                .availableUntil(newJob.getAvailableUntil())
                .company(company)
                .build();
    }

}

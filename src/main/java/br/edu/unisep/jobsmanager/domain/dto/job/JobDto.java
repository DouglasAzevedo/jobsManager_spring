package br.edu.unisep.jobsmanager.domain.dto.job;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class JobDto {

    private Integer id;

    private String title;
    private String description;

    private Double salary;

    private Integer vacancies;

    private LocalDate availableFrom;
    private LocalDate availableUntil;

    private String company;
    private String industry;

}

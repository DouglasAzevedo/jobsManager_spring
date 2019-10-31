package br.edu.unisep.jobsmanager.domain.dto.company;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompanyDto {

    private Integer id;

    private String name;

    private String industry;


}

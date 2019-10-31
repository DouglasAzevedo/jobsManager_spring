package br.edu.unisep.jobsmanager.domain.dto.industry;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IndustryDto {

    private Integer id;

    private String name;

}

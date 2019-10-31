package br.edu.unisep.jobsmanager.domain.builder;

import br.edu.unisep.jobsmanager.domain.dto.industry.IndustryDto;
import br.edu.unisep.jobsmanager.domain.dto.industry.NewIndustryDto;
import br.edu.unisep.jobsmanager.model.entity.Industry;

public class IndustryBuilder {

    public static IndustryDto toIndustryDto(Industry i) {
        return IndustryDto.builder()
                .id(i.getId())
                .name(i.getName())
                .build();
    }

    public static Industry fromNewIndustryDto(NewIndustryDto newIndustry) {
        return Industry.builder()
                .name(newIndustry.getName())
                .build();
    }

}

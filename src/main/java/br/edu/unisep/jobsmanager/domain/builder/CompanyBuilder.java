package br.edu.unisep.jobsmanager.domain.builder;

import br.edu.unisep.jobsmanager.domain.dto.company.CompanyDto;
import br.edu.unisep.jobsmanager.domain.dto.company.NewCompanyDto;
import br.edu.unisep.jobsmanager.model.entity.Company;
import br.edu.unisep.jobsmanager.model.entity.Industry;

public class CompanyBuilder {

    public static CompanyDto toCompanyDto(Company company) {
        return CompanyDto.builder()
                .id(company.getId())
                .name(company.getName())
                .industry(company.getIndustry().getName())
                .build();
    }

    public static Company fromNewCompanyDto(NewCompanyDto newCompany) {
        var industry = Industry.builder()
                .id(newCompany.getIndustryId()).build();

        return Company.builder()
                .name(newCompany.getName())
                .industry(industry)
                .build();
    }

}

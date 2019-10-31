package br.edu.unisep.jobsmanager.domain.usecase.company;

import br.edu.unisep.jobsmanager.domain.builder.CompanyBuilder;
import br.edu.unisep.jobsmanager.domain.dto.company.CompanyDto;
import br.edu.unisep.jobsmanager.model.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ListCompanyUseCase {

    private CompanyRepository companyRepository;

    public List<CompanyDto> execute() {

        var companies = companyRepository.findAll();

        return companies.stream().map(CompanyBuilder::toCompanyDto).collect(Collectors.toList());
    }

}

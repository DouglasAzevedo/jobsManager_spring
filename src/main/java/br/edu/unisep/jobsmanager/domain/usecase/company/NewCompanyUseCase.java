package br.edu.unisep.jobsmanager.domain.usecase.company;

import br.edu.unisep.jobsmanager.domain.builder.CompanyBuilder;
import br.edu.unisep.jobsmanager.domain.dto.company.NewCompanyDto;
import br.edu.unisep.jobsmanager.model.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class NewCompanyUseCase {

    private CompanyRepository companyRepository;

    public void save(NewCompanyDto newCompany) {
        var company = CompanyBuilder.fromNewCompanyDto(newCompany);
        companyRepository.save(company);
    }

}

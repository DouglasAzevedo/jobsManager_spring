package br.edu.unisep.jobsmanager.controller.company;

import br.edu.unisep.jobsmanager.domain.dto.company.CompanyDto;
import br.edu.unisep.jobsmanager.domain.dto.company.NewCompanyDto;
import br.edu.unisep.jobsmanager.domain.usecase.company.ListCompanyUseCase;
import br.edu.unisep.jobsmanager.domain.usecase.company.NewCompanyUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/company")
public class CompanyController {

    private ListCompanyUseCase listCompanyUseCase;
    private NewCompanyUseCase newCompanyUseCase;

    @PostMapping
    public void save(@RequestBody NewCompanyDto newCompany) {
        newCompanyUseCase.save(newCompany);
    }

    @GetMapping
    public List<CompanyDto> list() {
        return listCompanyUseCase.execute();
    }
}

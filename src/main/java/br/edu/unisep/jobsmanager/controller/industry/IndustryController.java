package br.edu.unisep.jobsmanager.controller.industry;

import br.edu.unisep.jobsmanager.domain.dto.industry.IndustryDto;
import br.edu.unisep.jobsmanager.domain.dto.industry.NewIndustryDto;
import br.edu.unisep.jobsmanager.domain.usecase.industry.ListIndustriesUseCase;
import br.edu.unisep.jobsmanager.domain.usecase.industry.NewIndustryUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/industry")
public class IndustryController {

    private NewIndustryUseCase newIndustryUseCase;
    private ListIndustriesUseCase listIndustriesUseCase;

    @PostMapping
    public void save(@RequestBody NewIndustryDto newIndustry) {
        newIndustryUseCase.save(newIndustry);
    }

    @GetMapping
    public List<IndustryDto> listAll() {
        return listIndustriesUseCase.execute();
    }

}
package br.edu.unisep.jobsmanager.domain.usecase.industry;

import br.edu.unisep.jobsmanager.domain.builder.IndustryBuilder;
import br.edu.unisep.jobsmanager.domain.dto.industry.NewIndustryDto;
import br.edu.unisep.jobsmanager.model.repository.IndustryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewIndustryUseCase {

    private IndustryRepository repository;

    public void save(NewIndustryDto newIndustry) {
        var industry = IndustryBuilder.fromNewIndustryDto(newIndustry);
        repository.save(industry);
    }

}

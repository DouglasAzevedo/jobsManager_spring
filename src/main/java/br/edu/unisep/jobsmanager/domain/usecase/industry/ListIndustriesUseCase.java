package br.edu.unisep.jobsmanager.domain.usecase.industry;

import br.edu.unisep.jobsmanager.domain.builder.IndustryBuilder;
import br.edu.unisep.jobsmanager.domain.dto.industry.IndustryDto;
import br.edu.unisep.jobsmanager.model.repository.IndustryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ListIndustriesUseCase {

    private IndustryRepository repository;

    public List<IndustryDto> execute() {
        var industries = repository.findAll();

        return industries.stream()
                .map(IndustryBuilder::toIndustryDto)
                .collect(Collectors.toList());
    }

}

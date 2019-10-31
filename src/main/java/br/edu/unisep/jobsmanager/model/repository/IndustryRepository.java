package br.edu.unisep.jobsmanager.model.repository;

import br.edu.unisep.jobsmanager.model.entity.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndustryRepository extends JpaRepository<Industry, Integer> {

}
package br.edu.unisep.jobsmanager.model.repository;

import br.edu.unisep.jobsmanager.model.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

    @Query("from Job where availableFrom <= :BASE_DATE and availableUntil >= :BASE_DATE")
    List<Job> findAllAvailable(@Param("BASE_DATE") LocalDate baseDate);


    @Query("from Job " +
            "where availableFrom <= :BASE_DATE " +
            "and availableUntil >= :BASE_DATE " +
            "and company.industry.id = :INDUSTRY")
    List<Job> findAllAvailableByIndustry(@Param("BASE_DATE") LocalDate baseDate,
                                         @Param("INDUSTRY") Integer industry);

}
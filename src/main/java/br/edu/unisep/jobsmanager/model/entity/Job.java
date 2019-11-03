package br.edu.unisep.jobsmanager.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_job")
    private Integer id;

    @Column(name="job_title")
    private String title;

    @Column(name="job_description")
    private String description;

    @Column(name="salary")
    private Double salary;

    @Column(name="number_vacancies")
    private Integer vacancies;

    @Column(name="available_from")
    private LocalDate availableFrom;

    @Column(name="available_until")
    private LocalDate availableUntil;

    @OneToOne
    @JoinColumn(name="id_company")
    private Company company;

}

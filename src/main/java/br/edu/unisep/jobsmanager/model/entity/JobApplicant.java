package br.edu.unisep.jobsmanager.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="job_applicant")
public class JobApplicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_job_applicant")
    private Integer id;

    @OneToOne
    @JoinColumn(name="id_job")
    private Job job;

    @OneToOne
    @JoinColumn(name="id_applicant")
    private Applicant applicant;
}

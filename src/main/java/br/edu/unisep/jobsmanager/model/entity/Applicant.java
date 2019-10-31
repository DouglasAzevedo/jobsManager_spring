package br.edu.unisep.jobsmanager.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_applicant")
    private Integer id;

    @Column(name="applicant_name")
    private String name;

    @Column(name="email_address")
    private String email;

}

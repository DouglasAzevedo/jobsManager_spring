package br.edu.unisep.jobsmanager.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_company")
    private Integer id;

    @Column(name="company_name")
    private String name;

    @OneToOne
    @JoinColumn(name="id_industry")
    private Industry industry;

}

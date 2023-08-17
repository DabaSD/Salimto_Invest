package com.salimto.immo.template.entities;

import java.sql.Date;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "locataires")
@Builder
public class Locataire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String cni; 
    private String nom;
    private String prenom;
    private String lieuNaiss;
    private Date dateNaiss;
    private Long tel;
    private String numCompteBanquaire;
    private String profession;
    private String nomEmployeur;
    private Long telEmployeur;
    private String autrePersonne;
    private Long telAutrePers;

}

package com.salimto.immo.template.services.vo;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocataireVO {
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

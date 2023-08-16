package com.salimto.immo.template.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.salimto.immo.template.entities.Locataire;
import com.salimto.immo.template.repositories.LocataireRepository;
import com.salimto.immo.template.services.LocataireService;
import com.salimto.immo.template.services.vo.LocataireVO;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class LocataireServiceImpl implements LocataireService {

    @Autowired
    private LocataireRepository locataireRepository;

    @Override
    // Methode pour recuperer tous les locataires
    public List<LocataireVO> getAllLocataires() {
        List<LocataireVO> res = new ArrayList<>();

        List<Locataire> locataireList = (List<Locataire>) locataireRepository.findAll();

        for (Locataire l : locataireList) {
            LocataireVO newLocataire = new LocataireVO();
            newLocataire.setId(l.getId());
            newLocataire.setAutrePersonne(l.getAutrePersonne());
            newLocataire.setCni(l.getCni());
            newLocataire.setNom(l.getNom());
            newLocataire.setPrenom(l.getPrenom());
            newLocataire.setDateNaiss(l.getDateNaiss());
            newLocataire.setLieuNaiss(l.getLieuNaiss());
            newLocataire.setTel(l.getTel());
            newLocataire.setNumCompteBanquaire(l.getNumCompteBanquaire());
            newLocataire.setProfession(l.getProfession());
            newLocataire.setNomEmployeur(l.getNomEmployeur());
            newLocataire.setTelEmployeur(l.getTelEmployeur());
            newLocataire.setAutrePersonne(l.getAutrePersonne());
            newLocataire.setTelAutrePers(l.getTelAutrePers());

            res.add(newLocataire);
        }
        return res;
    }

}

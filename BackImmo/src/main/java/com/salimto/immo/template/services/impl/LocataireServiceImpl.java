package com.salimto.immo.template.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.salimto.immo.template.entities.Locataire;
import com.salimto.immo.template.repositories.LocataireRepository;
import com.salimto.immo.template.services.LocataireService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class LocataireServiceImpl implements LocataireService {
    private final LocataireRepository locataireRepository;

    @Override
    // Methode pour recuperer tous les locataires
    public List<Locataire> getAllLocataires() {
        return locataireRepository.findAll();
    }

}

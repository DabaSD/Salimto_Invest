package com.salimto.immo.template.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salimto.immo.template.entities.Locataire;

public interface LocataireRepository extends JpaRepository<Locataire, Long> {

}

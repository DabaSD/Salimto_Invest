package com.salimto.immo.template.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salimto.immo.template.services.LocataireService;
import com.salimto.immo.template.services.vo.LocataireVO;

@RestController
@RequestMapping("/locataire")
public class LocataireController {
    @Autowired
    private LocataireService locataireService;

    @GetMapping("/getAllLocataires")
    public List<LocataireVO> getAllLocataires() {
        return locataireService.getAllLocataires();
    }

}

package com.ensa.gi4.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

public class GestionMaterielServiceImpl implements GestionMaterielService {

	List<Materiel> list = new ArrayList<>();	
	
    @Override
    public void init() {
        System.out.println("*********Bienvenue dans notre boutique*********");
    }

    @Override
    public void listerMateriel() {
        for(Materiel m : list)
        {
            System.out.println(m.getName());
        }
    }

    @Override
    public void ajouterNouveauMateriel(Materiel materiel) {
        System.out.println("2.1- pour ajouter un nouveau livre, entrer 1");
        System.out.println("2.2- pour ajouter un nouveau chaise, entrer 2");
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        if ("1".equals(next)) {
        	list.add(materiel);
        } else if ("2".equals(next)) {
        	list.add(materiel);
        }
        else {
            System.out.println("choix invalide");
        }
    }


	
}

package com.example.echateau.androidprojet3chateaue;

import java.util.Date;

/**
 * Created by echateau on 11/03/2015.
 */
public class Patient {
    /*
	 * Données ne pouvant être modifiées
	 */
    private String identifiant;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String telephone;
    private Date dateNaiss;
    /*
     * Données à saisir
     */
    private String commentaireVisite;

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCommentaireVisite() {
        return commentaireVisite;
    }

    public void setCommentaireVisite(String commentaireVisite) {
        this.commentaireVisite = commentaireVisite;
    }

    public Patient() {
    }

    public Patient(String videntifiant, String vnom, String vprenom,
                   String vadresse, String vcp, String vville, String vtl,
                   Date vdateNaiss) {
        identifiant = videntifiant;
        nom = vnom;
        prenom = vprenom;
        adresse = vadresse;
        codePostal = vcp;
        ville = vville;
        telephone = vtl;
        dateNaiss = vdateNaiss;
        commentaireVisite = "";
    }

    public void recopiePatient(Patient patient)
    {
        identifiant= patient.identifiant;
        nom=patient.nom;
        prenom=patient.prenom;
        adresse=patient.adresse;
        codePostal=patient.codePostal;
        ville=patient.ville;
        telephone=patient.telephone;
        dateNaiss=patient.dateNaiss;
        commentaireVisite=patient.commentaireVisite;
    }

}

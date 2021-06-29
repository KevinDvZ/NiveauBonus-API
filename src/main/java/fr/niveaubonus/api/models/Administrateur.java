package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "administrateur")
public class Administrateur {
    @Id
    @Column(name = "administrateur")
    private Integer administrateur;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prénom")
    private String prénom;

    @Column(name = "site_idsite")
    private Integer siteIdsite;

    public Integer getAdministrateur() {
        return this.administrateur;
    }

    public void setAdministrateur(Integer administrateur) {
        this.administrateur = administrateur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return this.prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public Integer getSiteIdsite() {
        return this.siteIdsite;
    }

    public void setSiteIdsite(Integer siteIdsite) {
        this.siteIdsite = siteIdsite;
    }
}

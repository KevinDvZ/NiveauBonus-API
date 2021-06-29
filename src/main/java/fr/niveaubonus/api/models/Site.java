package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "site")
public class Site {
    @Id
    @Column(name = "idsite")
    private Integer idsite;

    @Column(name = "nom")
    private String nom;

    @Column(name = "slug")
    private String slug;

    public Integer getIdsite() {
        return this.idsite;
    }

    public void setIdsite(Integer idsite) {
        this.idsite = idsite;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}

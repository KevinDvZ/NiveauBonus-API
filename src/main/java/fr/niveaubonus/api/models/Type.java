package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "type")
public class Type {
    @Id
    @Column(name = "idtype")
    private Integer idtype;

    @Column(name = "nom")
    private String nom;

    @Column(name = "description")
    private String description;

    public Integer getIdtype() {
        return this.idtype;
    }

    public void setIdtype(Integer idtype) {
        this.idtype = idtype;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

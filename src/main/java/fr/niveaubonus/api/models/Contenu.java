package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "contenu")
public class Contenu {
    @Id
    @Column(name = "idcontenu")
    private Integer idcontenu;

    @Column(name = "texte")
    private String texte;

    @Column(name = "section_idsection")
    private Integer sectionIdsection;

    public Integer getIdcontenu() {
        return this.idcontenu;
    }

    public void setIdcontenu(Integer idcontenu) {
        this.idcontenu = idcontenu;
    }

    public String getTexte() {
        return this.texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public Integer getSectionIdsection() {
        return this.sectionIdsection;
    }

    public void setSectionIdsection(Integer sectionIdsection) {
        this.sectionIdsection = sectionIdsection;
    }
}

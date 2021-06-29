package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "section")
public class Section {
    @Id
    @Column(name = "idsection")
    private Integer idsection;

    @Column(name = "sectioncol")
    private String sectioncol;

    @Column(name = "catégorie_idcatégorie")
    private Integer catégorieIdcatégorie;

    public Integer getIdsection() {
        return this.idsection;
    }

    public void setIdsection(Integer idsection) {
        this.idsection = idsection;
    }

    public String getSectioncol() {
        return this.sectioncol;
    }

    public void setSectioncol(String sectioncol) {
        this.sectioncol = sectioncol;
    }

    public Integer getCatégorieIdcatégorie() {
        return this.catégorieIdcatégorie;
    }

    public void setCatégorieIdcatégorie(Integer catégorieIdcatégorie) {
        this.catégorieIdcatégorie = catégorieIdcatégorie;
    }
}

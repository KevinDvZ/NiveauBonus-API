package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "feuille_style")
public class FeuilleStyle {
    @Id
    @Column(name = "page_idpage")
    private Integer pageIdpage;

    @Column(name = "code")
    private String code;

    public Integer getPageIdpage() {
        return this.pageIdpage;
    }

    public void setPageIdpage(Integer pageIdpage) {
        this.pageIdpage = pageIdpage;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

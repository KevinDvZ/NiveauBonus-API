package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "page")
public class Page {
    @Id
    @Column(name = "idpage")
    private Integer idpage;

    @Column(name = "site_idsite")
    private Integer siteIdsite;

    @Column(name = "slug")
    private String slug;

    public Integer getIdpage() {
        return this.idpage;
    }

    public void setIdpage(Integer idpage) {
        this.idpage = idpage;
    }

    public Integer getSiteIdsite() {
        return this.siteIdsite;
    }

    public void setSiteIdsite(Integer siteIdsite) {
        this.siteIdsite = siteIdsite;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}

package fr.niveaubonus.api.models;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @Column(name = "contenu_idcontenu")
    private Integer contenuIdcontenu;

    @Column(name = "description")
    private String description;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    public Integer getContenuIdcontenu() {
        return this.contenuIdcontenu;
    }

    public void setContenuIdcontenu(Integer contenuIdcontenu) {
        this.contenuIdcontenu = contenuIdcontenu;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}

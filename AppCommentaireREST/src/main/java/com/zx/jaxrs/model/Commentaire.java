package com.zx.jaxrs.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="commentaire")
public class Commentaire {
    protected String auteur;
    protected String dateCreation;
    protected int id;
    protected String titre;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String value) {
        this.dateCreation = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "auteur='" + auteur + '\'' +
                ", dateCreation=" + dateCreation +
                ", id=" + id +
                ", titre='" + titre + '\'' +
                '}';
    }
}

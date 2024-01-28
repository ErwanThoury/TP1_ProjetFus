package sio.tp1projetfus;

import javafx.scene.image.Image;

public class ClassePerso {
    private String nom;
    private String logoURL;
    private String imageURL;
    private String description;
    private String bonus;
    private String malus;
    public ClassePerso(String nom, String logoURL, String description, String bonus, String malus) {
        this.nom = nom;
        this.logoURL = logoURL;
        this.description = description;
        this.bonus = bonus;
        this.malus = malus;

    }

    public String getNom() {
        return nom;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getDescription() {
        return description;
    }

    public String getBonus() {
        return bonus;
    }

    public String getMalus() {
        return malus;
    }
}

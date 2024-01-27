package sio.tp1projetfus;

import javafx.scene.image.Image;

public class ClassePerso {
    private String nom;
    private String logoURL;
    private String imageURL;

    public ClassePerso(String nom, String logoURL) {
        this.nom = nom;
        this.logoURL = logoURL;
        
    }

    public String getNom() {
        return nom;
    }

    public String getLogoURL() {
        return logoURL;
    }
}

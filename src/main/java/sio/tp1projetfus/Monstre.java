package sio.tp1projetfus;

public class Monstre {
    private String nom;
    private String img;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    public Monstre(String unNom, String unImg, int pvMax, int attaque, int defense, int critique){
        this.img = unImg;
        this.nom = unNom;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = critique;
        this.pvMax = pvMax;
        this.pvActuel = pvMax;
    }

    public String getNom() {
        return nom;
    }

    public String getImg() {
        return img;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public int getCoupCritique() {
        return coupCritique;
    }
}

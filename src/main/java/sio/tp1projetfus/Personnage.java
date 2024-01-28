package sio.tp1projetfus;

public class Personnage {
    public String nom;
    private ClassePerso classeDuPerso;
    private int statAir;
    private int statTerre;
    private int statFeu;
    private int statEau;
    private int statVita;
    private int statVitaMax;
    private int nombreKama;
    private int critique;
    private int attaque;
    private int fuite;
    private int esquive;
    private int soin;
    private int defense;
    private int prospection;


    public Personnage(String nom, ClassePerso classeDuPerso) {
        this.nom = nom;
        this.classeDuPerso = classeDuPerso;
        this.statAir = 5;
        this.statTerre = 5;
        this.statFeu = 5;
        this.statEau = 5;
        this.statVita = 30;
        this.nombreKama = 500;
        this.statVitaMax = 50;
        this.critique = 20;
        this.fuite = 20;
        this.esquive = 5;
        this.prospection = 100;
        this.attaque = 0;
        this.defense = 0;
        this.soin = 5;


        if ("Iop".equals(classeDuPerso.getNom()) )
        {
            this.statTerre += 4;
            this.statFeu -= 4;
        } else if ("Ecaflip".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statAir -= 4;
        } else if ("Cra".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statEau -= 4;
        } else if ("Eniripsa".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Feca".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statTerre -= 4;
        } else if ("Sadida".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statTerre -= 4;
        } else if ("Pandawa".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statAir -= 4;
        } else if ("Osamodas".equals(classeDuPerso.getNom()) ) {
            this.statFeu += 4;
            this.statEau -= 4;
        } else if ("Xelor".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Sram".equals(classeDuPerso.getNom()) ) {
            this.statAir += 4;
            this.statFeu -= 4;
        } else if ("Enutrof".equals(classeDuPerso.getNom()) ) {
            this.statEau += 4;
            this.statAir -= 4;
        } else if ("Sacrieur".equals(classeDuPerso.getNom()) ) {
            this.statTerre += 4;
            this.statEau -= 4;
        }
        majStat();
        this.statVita = statVitaMax;
    }

    public int getCritique() {
        return critique;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getFuite() {
        return fuite;
    }

    public int getEsquive() {
        return esquive;
    }

    public int getSoin() {
        return soin;
    }

    public int getDefense() {
        return defense;
    }

    public int getProspection() {
        return prospection;
    }

    public String getNom() {
        return nom;
    }

    public ClassePerso getClasseDuPerso() {
        return classeDuPerso;
    }

    public int getStatAir() {
        return statAir;
    }

    public int getStatTerre() {
        return statTerre;
    }

    public int getStatFeu() {
        return statFeu;
    }

    public int getStatEau() {
        return statEau;
    }

    public int getStatVita() {
        return statVita;
    }

    public int getStatVitaMax() {
        return statVitaMax;
    }

    public int getNombreKama() {
        return nombreKama;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setClasseDuPerso(ClassePerso classeDuPerso) {
        this.classeDuPerso = classeDuPerso;
    }

    public void setStatAir(int statAir) {
        this.statAir = statAir;
    }

    public void setStatTerre(int statTerre) {
        this.statTerre = statTerre;
    }

    public void setStatFeu(int statFeu) {
        this.statFeu = statFeu;
    }

    public void setStatEau(int statEau) {
        this.statEau = statEau;
    }

    public void setStatVita(int statVita) {
        this.statVita = statVita;
    }

    public void setStatVitaMax(int statVitaMax) {
        this.statVitaMax = statVitaMax;
    }

    public void setNombreKama(int nombreKama) {
        this.nombreKama = nombreKama;
    }

    public void setCritique(int critique) {
        this.critique = critique;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setFuite(int fuite) {
        this.fuite = fuite;
    }

    public void setEsquive(int esquive) {
        this.esquive = esquive;
    }

    public void setSoin(int soin) {
        this.soin = soin;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setProspection(int prospection) {
        this.prospection = prospection;
    }

    public void majStat()
    {
        this.statVitaMax += this.statFeu * 2 + this.statAir * 0.5 + this.statTerre * 0.5 + this.statEau * 0.5;
        this.fuite += this.statAir * 1.5 + this.statFeu * 0.5 + this.statTerre * 0.5 + this.statEau * 0.5;
        this.esquive += this.statAir * 0.5;
        this.soin += this.statFeu * 1.5;
        this.prospection += this.statEau * 2;
        this.attaque += this.statTerre * 1.5 + this.statAir * 0.5 + this.statEau * 0.5 + this.statFeu * 0.5;
        this.defense += this.statEau * 1.2 + this.statAir * 0.2 + this.statTerre * 0.2 + this.statFeu * 0.2;
    }
}

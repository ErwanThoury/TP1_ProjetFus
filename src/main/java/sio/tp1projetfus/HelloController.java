package sio.tp1projetfus;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    @FXML
    private HBox hbSorts;
    @FXML
    private AnchorPane apCraqueleur;
    @FXML
    private AnchorPane apTofu;
    @FXML
    private AnchorPane apBouftou;
    @FXML
    private AnchorPane apAstrub;
    @FXML
    private AnchorPane apZoneMonstre;

    int intNumberZone = 0;
    /*
    0 = Astrub
    1 = Tofu
    2 = Bouftou
    3 = Craqueleur
     */
    //---------------------------------------------------------------------------------
    // Tofu
    //---------------------------------------------------------------------------------
    Monstre monstreTofuMineur = new Monstre("Tofu furtif"
            , "monstreTofuMineur.png"
            , 5
            , 10
            , 0
            , 30
            , 12
            , 20);
    Monstre monstreTofu = new Monstre("Tofukaz agile"
            , "monstreTofu.png"
            , 10
            , 10
            , 5
            , 30
            , 20
            , 30);
    Monstre monstreTofuMajeur = new Monstre("Grofu heureux"
            , "monstreTofuMajeur.png"
            , 20
            , 5
            , 20
            , 15
            , 25
            , 35);
    Monstre monstreTofuRoyal = new Monstre("Tofu Royal"
            , "monstreTofuRoyal.png"
            , 50
            , 20
            , 10
            , 50
            , 500
            , 1000);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Bouftou
    //---------------------------------------------------------------------------------
    Monstre monstreBouftouMineur = new Monstre("Boufton intimidé"
            , "monstreBouftouMineur.png"
            , 50
            , 10
            , 10
            , 20
            , 50
            , 100);
    Monstre monstreBouftou = new Monstre("Bouftou affamé"
            , "monstreBouftou.png"
            , 75
            , 10
            , 15
            , 20
            , 80
            , 120);
    Monstre monstreBouftouMajeur = new Monstre("Boufcroute énervé"
            , "monstreBouftouMajeur.png"
            , 100
            , 15
            , 20
            , 20
            , 100
            , 140);
    Monstre monstreBouftouRoyal = new Monstre("Bouftou Royal"
            , "monstreBouftouRoyal.png"
            , 250
            , 25
            , 30
            , 20
            , 1000
            , 1500);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // Craqueleur
    //---------------------------------------------------------------------------------
    Monstre monstreCraqueleurMineur = new Monstre("Craqueboule téméraire"
            , "monstreCraqueleurMineur.png"
            , 80
            , 20
            , 15
            , 30
            , 80
            , 130);
    Monstre monstreCraqueleur = new Monstre("Craqueleur terrible"
            , "monstreCraqueleur.png"
            , 110
            , 25
            , 22
            , 35
            , 130
            , 200);
    Monstre monstreCraqueleurMajeur = new Monstre("Craqueterre monstrueux"
            , "monstreCraqueleurMajeur.png"
            , 150
            , 30
            , 35
            , 40
            , 170
            , 240);
    Monstre monstreCraqueleurRoyal = new Monstre("Craqueleur Majestueux"
            , "monstreCraqueleurRoyal.png"
            , 350
            , 50
            , 55
            , 45
            , 1500
            , 2000);
    //---------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------
    // CLASSES
    //---------------------------------------------------------------------------------
    ClassePerso iop = new ClassePerso("Iop", "iop.png");
    ClassePerso eniripsa = new ClassePerso("Eniripsa", "eniripsa.png");
    ClassePerso osamodas = new ClassePerso("Osamodas", "osamodas.png");
    ClassePerso feca = new ClassePerso("Feca", "feca.png");
    ClassePerso sacrieur = new ClassePerso("Sacrieur", "sacrieur.png");
    ClassePerso cra = new ClassePerso("Cra", "cra.png");
    ClassePerso sadida = new ClassePerso("Sadida", "sadida.png");
    ClassePerso enutrof = new ClassePerso("Enutrof", "enutrof.png");
    ClassePerso sram = new ClassePerso("Sram", "sram.png");
    ClassePerso xelor = new ClassePerso("Xelor", "xelor.png");
    ClassePerso ecaflip = new ClassePerso("Ecaflip", "ecaflip.png");
    ClassePerso pandawa = new ClassePerso("Pandawa", "pandawa.png");
    //---------------------------------------------------------------------------------
    @FXML
    private AnchorPane apMaison;
    @FXML
    private AnchorPane apChoixAction;
    @FXML
    private AnchorPane apBarreBasse;
    @FXML
    private Label lblVitaMax;
    @FXML
    private Label lblAir;
    @FXML
    private Label lblEau;
    @FXML
    private Label lblFeu;
    @FXML
    private Label lblTerre;
    @FXML
    private ImageView imgPersonnage;

    Personnage p;
    Image imagePerso;
    @FXML
    private Label lblPVPerso;
    @FXML
    private Label lblPVMaxPerso;
    @FXML
    private Label lblPVAdv;
    @FXML
    private Label lblPVMaxAdv;
    @FXML
    private ImageView imgVitaPerso;
    @FXML
    private ImageView imgVitaAdv;
    @FXML
    private Label lblSlash;

    @FXML
    private Label lblSlashBis;
    @FXML
    private AnchorPane apCombatPersonnages;
    @FXML
    private ImageView imgAdversaire;
    @FXML
    private ImageView imgPersonnageCbt;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        apChoixAction.setVisible(true);
         p = new Personnage("Bison", sacrieur);
         //String cheminVersClasse = getClass().getResource("/Images/Classe/"+p.getClasseDuPerso().getLogoURL()).toExternalForm();
         imagePerso = new Image(getClass().getResource("/Images/Classe/"+p.getClasseDuPerso().getLogoURL()).toExternalForm());
    }
    public void clearAll(){
        apBouftou.setVisible(false);
        apTofu.setVisible(false);
        apCraqueleur.setVisible(false);
        hbSorts.setVisible(false);
        apAstrub.setVisible(false);
        apZoneMonstre.setVisible(false);
        apChoixAction.setVisible(false);
        apMaison.setVisible(false);
        apBarreBasse.setVisible(true);
        combatClear();

    }
    public void combatClear()
    {
        lblPVAdv.setVisible(false);
        lblPVMaxAdv.setVisible(false);
        lblPVPerso.setVisible(false);
        lblPVMaxPerso.setVisible(false);
        lblSlash.setVisible(false);
        lblSlashBis.setVisible(false);
        imgVitaAdv.setVisible(false);
        imgVitaPerso.setVisible(false);
        hbSorts.setVisible(false);
        apCombatPersonnages.setVisible(false);
    }
    public void combatAff()
    {
        lblPVAdv.setVisible(true);
        lblPVMaxAdv.setVisible(true);
        lblPVPerso.setVisible(true);
        lblPVMaxPerso.setVisible(true);
        lblSlash.setVisible(true);
        lblSlashBis.setVisible(true);
        imgVitaAdv.setVisible(true);
        imgVitaPerso.setVisible(true);
        hbSorts.setVisible(true);
        apCombatPersonnages.setVisible(true);
    }
    public void clickFuite(MouseEvent mouseEvent) {
        clearAll();
        apChoixAction.setVisible(true);
    }

    public void clickGoToBouftou(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 2;
        apBouftou.setVisible(true);
        apZoneMonstre.setVisible(true);


    }

    public void clickGoToTofu(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 1;
        apTofu.setVisible(true);
        apZoneMonstre.setVisible(true);

    }

    public void clickGoToCraqueleur(MouseEvent mouseEvent) {
        clearAll();
        intNumberZone = 3;
        apCraqueleur.setVisible(true);
        apZoneMonstre.setVisible(true);

    }

    public void clickGoToAstrub(MouseEvent mouseEvent) {
        clearAll();
        apChoixAction.setVisible(true);
    }
    public int alea()
    {
        return (int)(Math.random() * 101);  // 0 to 100
    }
    public Monstre aleatoireMonstre(Monstre m1, Monstre m2, Monstre m3)
    {
        Monstre m;
        int randomNumber = alea();

        if (randomNumber < 30)
            m = m1;
        else if(randomNumber < 60)
            m = m2;
        else
            m = m3;

        return m;
    }
    public void writeRapideInt(Label lblTexte, int intTexte)
    {
        lblTexte.setText(Integer.toString(intTexte));
    }
    public void clickGoToAlea(MouseEvent mouseEvent) {
        //Event croiser un monstre ou trouver un coffre
        Monstre m;
        Image imageAdversaire;
        if (true) {
            clearAll();
            combatAff();
            imgPersonnageCbt.setImage(imagePerso);
            if (intNumberZone == 1) {
                apTofu.setVisible(true);
                m = aleatoireMonstre(monstreTofuMineur, monstreTofu, monstreTofuMajeur);
            } else if (intNumberZone == 2) {
                apBouftou.setVisible(true);
                m = aleatoireMonstre(monstreBouftouMineur, monstreBouftou, monstreBouftouMajeur);
            } else if (intNumberZone == 3) {
                apCraqueleur.setVisible(true);
                m = aleatoireMonstre(monstreCraqueleurMineur, monstreCraqueleur, monstreCraqueleurMajeur);
            } else {
                m = aleatoireMonstre(monstreCraqueleurRoyal, monstreBouftouRoyal, monstreTofuRoyal);
            }
            imageAdversaire = new Image(getClass().getResource("/Images/"+m.getImg()).toExternalForm());
            imgAdversaire.setImage(imageAdversaire);
            int intPvRestantHero = p.getStatVita();
            int intPvRestantAdvs = m.getPvMax();
            writeRapideInt(lblPVPerso, intPvRestantHero);
            writeRapideInt(lblPVMaxPerso, p.getStatVitaMax());
            writeRapideInt(lblPVAdv, intPvRestantAdvs);
            writeRapideInt(lblPVMaxAdv, intPvRestantAdvs);
        }
        else
        {
            System.out.println("Trouver le coffre");
        }
    }

    public void clickGoToBoss(MouseEvent mouseEvent) {
    }

    public void clickGoToMarchand(MouseEvent mouseEvent) {
    }

    public void clickGoToPerso(MouseEvent mouseEvent) {
        clearAll();
        apMaison.setVisible(true);
        apBarreBasse.setVisible(false);
        lblAir.setText(Integer.toString((p.getStatAir())));
        lblTerre.setText(Integer.toString((p.getStatTerre())));
        lblFeu.setText(Integer.toString((p.getStatFeu())));
        lblEau.setText(Integer.toString((p.getStatEau())));
        lblVitaMax.setText(Integer.toString((p.getStatVitaMax())));
        imgPersonnage.setImage(imagePerso);
    }

    public void clickGoToZaap(MouseEvent mouseEvent) {
        clearAll();
        apAstrub.setVisible(true);
    }

    public void fight(){

    }
}
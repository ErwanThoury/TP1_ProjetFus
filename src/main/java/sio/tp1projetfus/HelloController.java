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
    @FXML
    private AnchorPane apMaison;
    @FXML
    private AnchorPane apChoixAction;
    @FXML
    private AnchorPane apBarreBasse;
    @FXML
    private Label lblVitaMax;
    @FXML
    private Label lblSagesse;
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clearAll();
        apChoixAction.setVisible(true);
         p = new Personnage("Bison", sacrieur);
         String cheminVersClasse = getClass().getResource("/Images/Classe/"+p.getClasseDuPerso().getLogoURL()).toExternalForm();

         imagePerso = new Image(cheminVersClasse);
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

    public void clickGoToAlea(MouseEvent mouseEvent) {
        //Event croiser un monstre ou trouver un coffre
        if (true) {
            clearAll();
            if (intNumberZone == 1) {
                apTofu.setVisible(true);
                hbSorts.setVisible(true);

            } else if (intNumberZone == 2) {
                apBouftou.setVisible(true);
                hbSorts.setVisible(true);

            } else if (intNumberZone == 3) {
                apCraqueleur.setVisible(true);
                hbSorts.setVisible(true);

            } else {
                System.out.println("Error");
            }
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
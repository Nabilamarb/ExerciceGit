package AvitoApp.Pages;

import AvitoApp.Utils.BaseTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageInscrire extends BaseTools {
    @FindBy(name="signup-name")
    private WebElement champsName ;
    @FindBy(name = "signup-email")
    private WebElement champsEmail ;
    @FindBy(name = "signup-phone")
    private WebElement champsTel ;
    @FindBy(name = "signup-pass")
    private WebElement champsPassword ;
    @FindBy(name="signup-pass-confirm")
    private WebElement ChampsPasswordConfirm ;
    @FindBy(name = "signup-city")
    private WebElement champsVille ;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement champsCheck ;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement BoutonCreerCompte ;
    @FindBy(xpath = "//span[contains(text(),'Veuillez Sélectionner une ville')]")
    private WebElement messageErreur;
    private int default_time=30;

    WebDriver driver;

    public PageInscrire(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void remplirleChampsFormulaire(String nom, String email, String telephone, String motDePasse, String confirmationMotDePasse) {
        System.out.println("Remplissage de formulaire");
        waitAndSendKeys(champsName,nom,default_time);

        waitAndSendKeys(champsEmail,email,default_time);

        waitAndSendKeys(champsTel,telephone,default_time);

        waitAndSendKeys(champsPassword,motDePasse,default_time);

        waitAndSendKeys(ChampsPasswordConfirm,confirmationMotDePasse,default_time);

    }
    // 6. Vérifier que le bouton «Créer un compte» est désactivé
    public boolean isBoutonCreerCompteDesactive() {
        System.out.println("le bouton «Créer un compte» est désactivé");
        WebElement boutonCreerCompte = waitElementToBeVisible(BoutonCreerCompte,default_time);
        return boutonCreerCompte.isEnabled();

    }
    public String isNomAffiche() {
        System.out.println("Le Nom Afficher");
        return waitAndGetTextFromInput(champsName,default_time);
    }
    //10.Vérifiezl’affichage du message d’erreur Veuillez
    public String getMessageErreurAffiche() {
        System.out.println("l’affichage du message d’erreur Veuillez");
        return waitAndGetText(messageErreur,default_time);
    }
    public WebElement isMessageErreur(){
        System.out.println("Message Erreur");
        return waitElementToBeVisible(messageErreur,default_time);
    }
    //11.Vérifiez que checkbox est toujours coché
    public void CocheeCheckbox() {
        System.out.println("checkbox est toujours coché");
        waitAndClick(champsCheck,default_time);
    }
    public void ClickBoutonCreerCompte(){
        System.out.println("Clicker sur le bouton Creer Compte");
        waitAndClick(BoutonCreerCompte,default_time);
    }
   //12.Vérifiez que le bouton «Créer un compte» est activé
    public boolean isBoutonCreerCompteActive() {
        System.out.println("le bouton «Créer un compte» est activé");
        WebElement boutonCreerCompte = waitElementToBeVisible(BoutonCreerCompte,default_time);
        return boutonCreerCompte.isEnabled();
    }
    public Boolean isCheckboxCochee(){
        System.out.println("le Checkbox est Cochee");
        WebElement checkbox = waitElementToBeVisible(champsCheck,default_time);
        return checkbox.isSelected();
    }

}

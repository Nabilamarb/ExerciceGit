package AvitoApp.Suites;

import AvitoApp.Configuration.SetUpTearDown;
import AvitoApp.DataSet.Constante;
import AvitoApp.Pages.PageAvito;
import AvitoApp.Pages.PageInscrire;
import AvitoApp.Pages.PageLogin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuiteInscrire extends SetUpTearDown {
    @Test
    public void Test02(){
        PageAvito pageAvito= new PageAvito(driver);
        pageAvito.SeConnecter();
        PageLogin pageLogin=new PageLogin(driver);
        pageLogin.InscrireGratuitement();
        PageInscrire pageInscrire=new PageInscrire(driver);
        pageInscrire.remplirleChampsFormulaire(Constante.Name,Constante.Email,Constante.password,Constante.passwordConfi,Constante.Tel);
        Assert.assertFalse(pageInscrire.isBoutonCreerCompteDesactive());
        pageInscrire.CocheeCheckbox();
        pageInscrire.ClickBoutonCreerCompte();
        Assert.assertEquals(pageInscrire.isNomAffiche(),Constante.nomAttendu);
        Assert.assertEquals(pageInscrire.getMessageErreurAffiche(),Constante.messageattendu2);
        //Assert.assertTrue(pageInscrire.isMessageErreur().getCssValue("color").contains("rgb(209, 54, 73)"));
        Assert.assertTrue(pageInscrire.isCheckboxCochee());
        Assert.assertTrue(pageInscrire.isBoutonCreerCompteActive());



    }
}

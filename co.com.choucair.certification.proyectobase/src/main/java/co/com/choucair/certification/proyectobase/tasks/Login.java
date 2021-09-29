package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPage;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import cucumber.api.java.af.En;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;

public class Login implements Task {
    public Login(String strUser,String strPassword) {
        this.strUser = strUser;
        this.strPassword= strPassword;
    }

    public static Performable onThePage(String strUser, String strPassword) {
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    public String getStrPassword() {
        return StrPassword;
    }

    public void setStrPassword(String strPassword) {
        StrPassword = strPassword;
    }

    private static String strUser;
    private static String StrPassword;
    public static Login onThePage() {
        return Tasks.instrumented(Login.class, strUser, StrPassword);
               }

        @Override
        public <T extends Actor > void performAs (T actor){
            actor.attemptsTo(Click.on((WebElementFacade) ChoucairLoginPage.LOGIN_BUTTON)),
            Enter.theValue(strUser).into(ChoucairLoginPage.USER),
                    Enter.theValue().into((StrPassword)).into(ChoucairLoginPage.PASSWORD),
                    Click.on((By) ChoucairLoginPage.ENTER_BUTTON);
        }
    }
}


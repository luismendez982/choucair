package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.AcademyChoucairData;
import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Login;
import co.com.choucair.certification.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    private Search Buscar;

    @Before
    public void setStage() {
        OnStage.setTheStage((new OnlineCast()));
    }

    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairDataList)    throws Exception{
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage(), Login.onThePage(
                AcademyChoucairData.get(0).getStrUser(),AcademyChoucairData.get(0).getStrPassword()));
        ));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
   public void heSearchForTheCourseRecursosAutomatizaciónBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairDataList) throws Exception {
    OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(AcademyChoucairData.get(0).getStrCourse());
    }

    @Then("^he finds the course called resources(.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizaciónBancolombia(List<AcademyChoucairData> academyChoucairDataList)  throws Exception) {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(AcademyChoucairData.get(0).getStrPassword()));
    }
    }

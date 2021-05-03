package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
//tüm feature filelları test etmek istediğmz için bu classı oluştrduk.
@CucumberOptions(
        features = {"src/test/java"}, //"src/test/java/contact.feature"yazarsak sadece belirli bir feature file run ederiz
        glue = {"stepDefinition"},
        dryRun = false
     /* ,  plugin = {"pretty",
                "html:target/site/cucumber-pretty",
                "json:target/cucumber.json","html:target/cucumber-html-report","usage:target/cucumber-usage.json","" +
                "junit:target/cucumber-results.xml"}
          bu plugini yazarsak test detaylarını veriyor  */
)

public class _1_RunnerGenel extends AbstractTestNGCucumberTests { //pom.xml deki dependcy den extend ettik







}

package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")
public class Runner {
    /*
        Runner class'i TestNG'deki .xml dosyalari gibidir
        ama bize daha dinamik bir configuration imkani verir

        Runner class'i bos bir class olmasina ragmen
        kullanilan notasyonlar sayesinde
        islevsel hale gelir

        ozetlersek
        Runner class'lari dosya yolu verilen stepdefinitions class'larindaki Java kodlarini kullanarak
        dosya yolu verilen features klasorundeki feature dosyalarindan
        @belirlenentag'a sahip olan Feature ve/veya Scenario'lari calistirir

     */

}
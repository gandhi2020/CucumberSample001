# CucumberSample001
A sample project to test web application using Cucumber framework.

**Update 01**
1. Create a Cucumber feature file
2. Create StepDefinitions file
3. Create a Junit Runner class to run this feature.
4. Instead of WebDriver, use WebDriverManager, so that selenium automatically manages the Webdriver based on the browser type and browser version.

**Update 02**
1. Update the runner class to create cucumber reports with cucumber plugins
below code is added for cucumber reports
plugin = {"pretty", "summary", "json:target/cucumber-reports.json", "html:target/cucumber-reports.html"}

**Update 03**
1. Create a new runner class copying the previous one. Update it for using extent reports
2. Update the pom for Extent report depencies with two artifacts
    a) AventStack's extentreport
    b) Grasshopper extentreport6 adapter.
3. Add the plugin details to the cucumber runner options
    a) "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
4. Create extent.properties file in src/test/resources folder
5. For report settings create spark-config.xml file in src/test/resources folder
    The xml details copied from https://www.extentreports.com/docs/versions/4/java/v3-html-reporter.html
6. Update the extent.properties file based on
     https://ghchirp.online/2098/
     https://www.youtube.com/watch?v=IuEO9AUbwwc&ab_channel=JahmalRichard
7. Run the runner class to generate the html and pdf reports.
8. The extent reports are overwritten for every execution. This can be changed by include basefolder.name and basefolder.datetimepattern properties in extent.properties file

**Update 04**
1. Changed the websites and added one more test case with a scenario to login to OrangeHRM webpage
2. Introduced Page Object model. Currently one page for every website. 
3. If there are multiple testcases created for a single website, then for each webpage a Page class will be created.
4. Added PicoContainer for dependency injection.
5. Updated the version of cucumber packages to 7.10.0 and also the extent report adapter to version 7.

 
   

  

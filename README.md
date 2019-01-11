# Gauge example in Java

[![Build Status](https://travis-ci.org/getgauge-examples/java-maven-selenium.svg?branch=master)](https://travis-ci.org/getgauge-examples/java-maven-selenium)

This is an example project for doing web automation testing with [Gauge](http://getgauge.io). This project tests some of the functionalities of the [active admin demo](https://github.com/getgauge/activeadmin-demo) app. This app is hosted as a Java WAR (with embedded Jetty).

## Running this example
The tests are run on Chrome by default.

### Prerequisites

This example requires the following softwares to run.
  * [Java 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) or above
    * Note that Gauge works with Java 1.6 and above. But this particular example uses Java 1.7
  * [Gauge](http://getgauge.io/get-started/index.html)
  * Gauge Java plugin
    * can be installed using `gauge install java`
  * Chrome

### Setting up the System Under Test (SUT)

* Download [activeadmin-demo.war](https://bintray.com/artifact/download/gauge/activeadmin-demo/activeadmin-demo.war)
* Bring up the SUT by executing the below command
```
java -jar activeadmin-demo.war
```
* The SUT should now be available at [http://localhost:8080/](http://localhost:8080)

### Setting up Maven

* [Maven installation instructions](http://maven.apache.org/install.html)

## Run specs

If you already have Maven installed, you can execute specs as `mvn test`
This runs Gauge specs with [Maven](http://maven.apache.org/index.html).

This uses Chrome as default browser for specs execution. Make sure Chrome is installed in your machine and [chromedriver](https://sites.google.com/a/chromium.org/chromedriver/) is in PATH.

If you want to use Firefox/IE as browser, pass the corresponding argument to set browser environment as follows:

```
mvn gauge:execute -DspecsDir=specs -Denv="firefox"
or
mvn gauge:execute -DspecsDir=specs -Denv="ie"
```

Note:
  * Gauge can also be used with other [build tools](https://docs.gauge.org/latest/configuration.html#build-tools).
  * You can use Gauge even without a build script!

## Topics covered in the example

* Use [Webdriver](http://docs.seleniumhq.org/projects/webdriver/) as base of implementation
* [Concepts](https://docs.gauge.org/latest/writing-specifications.html#concept)
* [Specification](https://docs.gauge.org/latest/writing-specifications.html#specifications-spec), [Scenario](https://docs.gauge.org/latest/writing-specifications.html#longstart-scenarios) & [Step](https://docs.gauge.org/latest/writing-specifications.html#longstart-steps) usage
* [Table driven execution](https://docs.gauge.org/latest/execution.html#data-driven-execution)
* [External datasource (special param)](https://docs.gauge.org/latest/execution.html#external-csv-for-data-table)
* Using Gauge with [Selenium Webdriver](http://docs.seleniumhq.org/projects/webdriver/)
* Running Gauge specs with [Maven](https://maven.apache.org/)

# Copyright
Copyright 2016, ThoughtWorks Inc.

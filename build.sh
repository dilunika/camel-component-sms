#!/bin/bash

mvn clean install

mvn install:install-file  -Dfile=target/camel-sms-1.0.jar -DgroupId=jkd.lrn.camel -DartifactId=camel-sms -Dversion=1.0 -Dpackaging=jar -DlocalRepositoryPath=/data/maven/repository

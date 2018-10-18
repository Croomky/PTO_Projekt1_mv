#!/bin/bash

projectName="PTO_Projekt1_mv"
repoUrl="https://github.com/PulPee/$projectName"
junitConsole="junit-platform-console-standalone-1.3.1.jar"

#clone repo
git clone $repoUrl

#compile classes
mkdir out
javac -d out PTO_Projekt1_mv/src/main/java/Calculator.java

#compile tests
javac -d out -cp out:$junitConsole $projectName/src/test/java/CalculatorTest.java

#run tests
java -jar $junitConsole --class-path out --scan-class-path
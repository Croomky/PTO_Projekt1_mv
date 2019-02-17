SET repoUrl=https://github.com/PulPee/PTO_Projekt1_mv
SET junitConsole=junit-platform-console-standalone-1.4.0.jar

git clone %repoUrl%

mkdir out

javac -d out -cp %junitConsole% PTO_Projekt1_mv/src/main/java/Calculator.java PTO_Projekt1_mv/src/test/java/CalculatorTest.java

FOR /F "tokens=* USEBACKQ" %%F IN (`java -jar %junitConsole% --class-path out --scan-class-path`) DO (
SET var=%%F
)
ECHO %var%

SET HH=%time:~0,2%
SET MM=%time:~3,2%
SET SS=%time:~6,2%
SET fileName=app_%HH%_%MM%_%SS%.txt

IF "%var%" == "[         0 tests failed          ]" (
    echo TEST PASSED >> %fileName%
) ELSE (
    echo TEST FAILED >> %fileName%
)
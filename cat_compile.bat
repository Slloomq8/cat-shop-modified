call cat_defs.bat

echo Compile the CatShop system

javac  %FLAGS% -cp "%CP_JUNIT5%" src\catalogue\*.java src\middle\*.java src\dbAccess\*.java src\orders\*.java src\clients\*.java src\remote\*.java src\debug\*.java src\clients\backdoor\*.java src\clients\cashier\*.java src\clients\collection\*.java src\clients\customer\*.java src\clients\shopDisplay\*.java src\clients\warehousePick\*.java

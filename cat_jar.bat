call cat_defs.bat

echo Create jar files

jar cfm  catshop.jar Manifest.MF src\catalogue\*.class src\middle\*.class src\dbAccess\*.class src\orders\*.class src\clients\*.class src\remote\*.class src\debug\*.class src\clients\backDoor\*.class src\clients\cashier\*.class src\clients\collection\*.class src\clients\customer\*.class src\clients\shopDisplay\*.class src\clients\warehousePick\*.class DataBase.txt

jar cfm  setup.jar Manifest2.MF src\catalogue\*.class src\middle\*.class src\dbAccess\*.class src\orders\*.class src\clients\*.class src\remote\*.class src\debug\*.class src\clients\backDoor\*.class src\clients\cashier\*.class src\clients\collection\*.class src\clients\customer\*.class src\clients\shopDisplay\*.class src\clients\warehousePick\*.class DataBase.txt

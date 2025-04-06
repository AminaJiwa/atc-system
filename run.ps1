$JAVA_HOME = "C:\Program Files\Eclipse Adoptium\jdk-21.0.3.9-hotspot"
$JAVAFX_PATH = "C:\Users\amina\javafx-sdk-21.0.6\lib"

# Compile
& "$JAVA_HOME\bin\javac" --module-path $JAVAFX_PATH --add-modules javafx.controls,javafx.fxml -d target/classes src/main/java/com/atcsystem/App.java

# Run
& "$JAVA_HOME\bin\java" --module-path $JAVAFX_PATH --add-modules javafx.controls,javafx.fxml -cp "target/classes" com.atcsystem.App
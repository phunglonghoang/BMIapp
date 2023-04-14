module com.plh.mavenproject2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.plh.mavenproject2 to javafx.fxml;
    exports com.plh.mavenproject2;
}

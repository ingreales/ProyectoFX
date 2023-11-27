module com.example.proyectdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.proyectdemo to javafx.fxml;
    exports com.example.proyectdemo;
}
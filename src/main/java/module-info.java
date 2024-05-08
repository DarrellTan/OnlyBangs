module com.example.onlybangs {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.onlybangs to javafx.fxml;
    exports com.example.onlybangs;
}
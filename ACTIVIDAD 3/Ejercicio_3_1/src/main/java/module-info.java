module com.joctan.ejercicio_3_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.joctan.ejercicio_3_1 to javafx.fxml;
    exports com.joctan.ejercicio_3_1;
}

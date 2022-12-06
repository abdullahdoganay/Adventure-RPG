module com.example.yazmalar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.yazmalar to javafx.fxml;
    exports com.example.yazmalar;
}
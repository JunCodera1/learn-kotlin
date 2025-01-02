module com.example.learnkotlin {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.learnkotlin to javafx.fxml;
    exports com.example.learnkotlin;
}
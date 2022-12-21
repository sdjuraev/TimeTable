module com.example.timetable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.timetable to javafx.fxml;
    exports com.example.timetable;
}
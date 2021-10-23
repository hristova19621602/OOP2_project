module bg.tu_varna.sit.group_18.project1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens bg.tu_varna.sit.group_18.project1 to javafx.fxml;
    //opens bg.tu_varna.sit.group_18.project1 to javafx.graphics;
    exports bg.tu_varna.sit.group_18.project1;




}

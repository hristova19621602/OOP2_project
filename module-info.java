module bg.tu_varna.sit.group18.oop2project1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires log4j;
    requires org.hibernate.orm.core;
    requires java.persistence;
    requires java.naming;

    requires java.sql;

    opens bg.tu_varna.sit.group18.oop2project1.data.entities to org.hibernate.orm.core;
    exports bg.tu_varna.sit.group18.oop2project1.data.entities;

    opens bg.tu_varna.sit.group18.oop2project1.data.access to org.hibernate.orm.core;
    exports bg.tu_varna.sit.group18.oop2project1.data.access;




    exports bg.tu_varna.sit.group18.oop2project1.applcation;
    opens bg.tu_varna.sit.group18.oop2project1.applcation to javafx.fxml;

    exports bg.tu_varna.sit.group18.oop2project1.presentation.controllers;
    opens bg.tu_varna.sit.group18.oop2project1.presentation.controllers to javafx.fxml;
}
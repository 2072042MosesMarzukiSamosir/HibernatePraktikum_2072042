module com.example.hibernatepraktikum {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires jasperreports;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;
    requires javafx.graphics;

    opens com.example.hibernatepraktikum to javafx.fxml;
    opens com.example.hibernatepraktikum.model_entity;
    opens com.example.hibernatepraktikum.controller;
    exports com.example.hibernatepraktikum;

}
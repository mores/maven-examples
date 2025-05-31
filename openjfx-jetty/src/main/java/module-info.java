module hellofx {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.slf4j;
    requires org.apache.logging.log4j;
    requires org.apache.logging.log4j.core;
    requires org.apache.logging.log4j.slf4j2.impl;

    requires org.eclipse.jetty.server;
    requires org.eclipse.jetty.servlet;

    exports org.openjfx;

    opens org.openjfx;
}

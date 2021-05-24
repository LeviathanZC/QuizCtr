package com.ecorp.application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowEditorController {

    private static final Logger log = LoggerFactory.getLogger(WindowEditorController.class);

    @FXML
    public MenuItem toMainButton;

    @FXML
    public void moveToMain(ActionEvent actionEvent) {
        QuizApp.getMainStage().setScene(QuizApp.getMainScene());
        QuizApp.centerIt();
    }
}

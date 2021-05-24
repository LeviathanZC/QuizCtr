package com.ecorp.application.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class WindowMainController {

    private static final Logger log = LoggerFactory.getLogger(WindowMainController.class);

    @FXML
    public Button editorButton;
    private Scene editorScene;

    @FXML
    public Button journalButton;
    private Scene journalScene;

    @FXML
    public Button quizButton;
    private Scene quizScene;


}

package com.ecorp.application.controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.control.*;

import java.io.IOException;

public class WindowMainController {

    private static final Logger log = LoggerFactory.getLogger(WindowMainController.class);

    @FXML
    public Button editorButton;

    @FXML
    public Button journalButton;

    @FXML
    public Button quizButton;


    private Scene editorScene;
    private Scene journalScene;
    private Scene quizScene;

    public WindowMainController() throws IOException {
        editorScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.EDITOR));
        journalScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.JOURNAL));
        quizScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.QUIZ));
    }

    private void move(Scene to) {
        QuizApp.getMainStage().setScene(to);
    }

    @FXML
    public void moveToEditor(MouseEvent mouseEvent) {
        move(editorScene);
    }

    @FXML
    public void moveToJournal(MouseEvent mouseEvent) {
        move(journalScene);
    }

    @FXML
    public void moveToQuiz(MouseEvent mouseEvent) {
        move(quizScene);
    }
}

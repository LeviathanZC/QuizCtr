package com.ecorp.application.controller.fxml;

import com.ecorp.application.controller.FXMLPath;
import com.ecorp.application.controller.QuizApp;
import com.ecorp.application.controller.SceneLoader;
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


    private final Scene editorScene;
    private final Scene journalScene;
    private final Scene quizScene;

    //These items are dimensions of each scene
    private static final int EDITOR_WIDTH = 1000;
    private static final int EDITOR_HEIGHT = 600;

    private static final int JOURNAL_WIDTH = 0;
    private static final int JOURNAL_HEIGHT = 0;

    private static final int QUIZ_WIDTH = 0;
    private static final int QUIZ_HEIGHT = 0;


    public WindowMainController() throws IOException {
        editorScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.EDITOR), EDITOR_WIDTH, EDITOR_HEIGHT);
        journalScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.JOURNAL), JOURNAL_WIDTH, JOURNAL_HEIGHT);
        quizScene = new Scene(SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.QUIZ), QUIZ_WIDTH, QUIZ_HEIGHT);
    }

    private void move(Scene to) {
        QuizApp.getMainStage().setScene(to);
        QuizApp.centerIt();
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

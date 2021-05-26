package com.ecorp.application.controller;

import com.ecorp.application.model.entity.Test;
import com.ecorp.application.model.service.TestHandler;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.io.IOException;

public class QuizApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(QuizApp.class);

    public static void main(String[] args) throws Exception {
        log.info("launching entry point...");
        launch(args);
    }

    private static Stage mainStage;
    private static Scene mainScene;

    private final int MAIN_WIDTH = 300;
    private final int MAIN_HEIGHT = 400;

    public static Stage getMainStage() {
        return mainStage;
    }

    public static Scene getMainScene() {
        return mainScene;
    }

    private static Rectangle2D screenBounds;

    public static void centerIt() {
        mainStage.setX((screenBounds.getWidth() - mainStage.getWidth()) / 2);
        mainStage.setY((screenBounds.getHeight() - mainStage.getHeight()) / 2);
        log.info("stage successfully centered!");
    }

    @Override
    public void init() throws IOException {
        Parent rootNode = SceneLoader.getInstance().loadScene(getClass(), FXMLPath.MAIN);
        mainScene = new Scene(rootNode, MAIN_WIDTH, MAIN_HEIGHT);
        log.debug("initializing application");
        testHandler = TestHandler.getInstance();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        screenBounds = Screen.getPrimary().getVisualBounds();
        mainStage = primaryStage;
        primaryStage.setTitle("Quiz Constructor a_1.0");
        mainStage.setScene(mainScene);
        primaryStage.show();
        centerIt();
    }



    private static TestHandler testHandler;

    public static void setTest(Test test) {
        testHandler.setCurrent(test);
    }

    public static TestHandler getTestHandler() {
        return testHandler;
    }


}

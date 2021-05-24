package com.ecorp.application.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
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

    public void changeScene(String fxml) {
        try {
            mainStage.getScene().setRoot(FXMLLoader.load(getClass().getResource(fxml)));
        } catch (IOException e) {
            log.error("Can`t change scene : ", e);
        }
    }

    private static Rectangle2D screenBounds;

    public static void centerIt() {
        mainStage.setX((screenBounds.getWidth() - mainStage.getWidth()) / 2);
        mainStage.setY((screenBounds.getHeight() - mainStage.getHeight()) / 2);
    }

    @Override
    public void init() throws IOException {
        Parent rootNode = SceneLoader.getInstance().loadScene(this.getClass(), FXMLPath.MAIN);
//        Parent rootNode = new FXMLLoader().load(getClass().getResourceAsStream(FXMLPath.MAIN));
        mainScene = new Scene(rootNode, MAIN_WIDTH, MAIN_HEIGHT);
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
}

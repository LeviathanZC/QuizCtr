package com.ecorp.application.controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class QuizApp extends Application {

    private static final Logger log = LoggerFactory.getLogger(QuizApp.class);

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    private static Stage mainStage;
    private static Scene mainScene;

    private final int MAIN_WIDTH = 400;

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



    @Override
    public void init() throws IOException {
        Parent rootNode = new FXMLLoader().load(getClass().getResourceAsStream(FXMLPath.MAIN));
        mainScene = new Scene(rootNode, MAIN_WIDTH, MAIN_WIDTH);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        primaryStage.setTitle("Quiz Constructor a_1.0");
        mainStage.setScene(mainScene);
        primaryStage.show();
    }
}

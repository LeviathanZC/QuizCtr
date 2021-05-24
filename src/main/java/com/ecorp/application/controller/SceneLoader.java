package com.ecorp.application.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class SceneLoader {

    private static class SceneLoaderHolder {
        private static final SceneLoader INSTANCE = new SceneLoader();
    }

    public static SceneLoader getInstance() {
        return SceneLoaderHolder.INSTANCE;
    }

    private static final Logger log = LoggerFactory.getLogger(SceneLoader.class);

    public Parent loadScene(Class clazz, String path) {
        try {
            return (Parent) new FXMLLoader().load(clazz.getResourceAsStream(path));
        } catch (IOException e) {
            log.error("Can't load scene for '" + path + "' with " + clazz.getCanonicalName(), e);
        }
        return null;
    }

}

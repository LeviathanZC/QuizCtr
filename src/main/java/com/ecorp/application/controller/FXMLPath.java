package com.ecorp.application.controller;

public final class FXMLPath {

    private static final String FXML_DIR = "/fxml/";
    private static final String FXML_EXT = ".fxml";

    /*COMMON*/
    public static final String MAIN = FXML_DIR + "WindowMain" + FXML_EXT;
    public static final String EDITOR = FXML_DIR + "WindowEditor" + FXML_EXT;
    public static final String JOURNAL = FXML_DIR + "WindowJournal" + FXML_EXT;
    public static final String QUIZ = FXML_DIR + "WindowQuiz" + FXML_EXT;

    private static final String DIALOG_DIR = "dialog/";

    /*MODAL*/
    public static final String CREATE_TEST = FXML_DIR + DIALOG_DIR + "CreateTest" + FXML_EXT;

}

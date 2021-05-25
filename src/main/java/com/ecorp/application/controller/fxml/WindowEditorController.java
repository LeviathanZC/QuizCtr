package com.ecorp.application.controller.fxml;

import com.ecorp.application.controller.FXMLPath;
import com.ecorp.application.controller.QuizApp;
import com.ecorp.application.controller.SceneLoader;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Spinner;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowEditorController {

    private static final Logger log = LoggerFactory.getLogger(WindowEditorController.class);
    private static final int CREATE_DIALOG_WIDTH = 300;
    private static final int CREATE_DIALOG_HEIGHT = 200;
    public Button createButton;

    private Stage dialogTest;

    public WindowEditorController() {
        Platform.runLater(() -> {
                    try {
                        dialogTest = new Stage();
                        dialogTest.setTitle("Создание теста");
                        dialogTest.setScene(new Scene(SceneLoader.getInstance().loadScene(
                                this.getClass(), FXMLPath.CREATE_TEST),
                                CREATE_DIALOG_WIDTH, CREATE_DIALOG_HEIGHT));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
        );
    }

    @FXML
    public void createTest(MouseEvent actionEvent) {

    }

    @FXML
    public void invokeCreateDialog(ActionEvent actionEvent) {
        //Configure the spinner with values 1-60
        /*SpinnerValueFactory<Integer> spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 50);
        this.moduleSpinner.setValueFactory(spinnerValueFactory);*/

        dialogTest.initModality(Modality.WINDOW_MODAL);
        dialogTest.initOwner(QuizApp.getMainStage());
        dialogTest.setResizable(false);
        dialogTest.show();
    }

    @FXML
    public MenuItem toMainButton;

    @FXML
    public MenuItem menuCreateTest;


    @FXML
    public void moveToMain(ActionEvent actionEvent) {
        QuizApp.getMainStage().setScene(QuizApp.getMainScene());
        QuizApp.centerIt();
    }

    @FXML
    private Spinner<Integer> moduleSpinner;
}

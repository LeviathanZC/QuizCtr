package com.ecorp.application.controller.fxml.dialog;

import com.ecorp.application.controller.QuizApp;
import com.ecorp.application.controller.fxml.WindowEditorController;
import com.ecorp.application.model.entity.Test;
import com.ecorp.application.model.entity.TestModule;
import com.ecorp.application.model.entity.testImpl.MultipleChoiceModule;
import com.ecorp.application.model.entity.testImpl.SingleSelectionModule;
import com.ecorp.application.model.factory.Factory;
import com.ecorp.application.model.service.TestHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

public class TestCreateDialogController implements Initializable {
    @FXML
    public Spinner<Integer> moduleSpinner;
    @FXML
    public TextField topicField;

    private Stage dialogStage;

    public Stage getDialogStage() {
        return dialogStage;
    }

    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    public void handleCreate(ActionEvent actionEvent) {
        Test test = new Test();
        test.setGeneralTopic(topicField.getText());
        QuizApp.setTest(test);
        QuizApp.getTestHandler().setMax(moduleSpinner.getValue());
        System.out.println("Test created - " + test);
        dialogStage.close();
    }

    public void handleCancel(ActionEvent actionEvent) {
        dialogStage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        moduleSpinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 50));
    }
}

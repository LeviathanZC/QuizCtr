package com.ecorp.application.controller.fxml;

import com.ecorp.application.controller.FXMLPath;
import com.ecorp.application.controller.QuizApp;
import com.ecorp.application.controller.SceneLoader;
import com.ecorp.application.controller.fxml.dialog.TestCreateDialogController;
import com.ecorp.application.model.entity.Test;
import com.ecorp.application.model.entity.TestModule;
import com.ecorp.application.model.service.TestHandler;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WindowEditorController {

    private static final Logger log = LoggerFactory.getLogger(WindowEditorController.class);
    private static final int CREATE_DIALOG_WIDTH = 300;
    private static final int CREATE_DIALOG_HEIGHT = 200;
    private Stage dialogTest;

    private TestHandler quizHandler;

    public Button createButton;
    public TreeView<String> testTree;

    public WindowEditorController() {
        quizHandler = TestHandler.getInstance();
    }



    @FXML
    public void createTest(MouseEvent actionEvent) {

    }

    @FXML
    public void invokeCreateDialog(ActionEvent actionEvent) {
        //Configure the spinner with values 1-60
        /*SpinnerValueFactory<Integer> spinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 50);
        this.moduleSpinner.setValueFactory(spinnerValueFactory);*/
        Platform.runLater(() -> {
                    try {
                        FXMLLoader loader = new FXMLLoader();
                        loader.setLocation(QuizApp.class.getResource("/fxml/dialog/CreateTest.fxml"));
                        dialogTest = new Stage();
                        dialogTest.setTitle("Создание теста");
                        dialogTest.setScene(new Scene(loader.load(),
                                CREATE_DIALOG_WIDTH, CREATE_DIALOG_HEIGHT));

                        dialogTest.initModality(Modality.WINDOW_MODAL);
                        dialogTest.initOwner(QuizApp.getMainStage());
                        dialogTest.setResizable(false);

                        TestCreateDialogController controller = loader.getController();
                        controller.setDialogStage(dialogTest);
                        dialogTest.showAndWait();
                        if(!quizHandler.isCurrentEmpty()) {
                            TreeItem<String> testRoot = new TreeItem<>(quizHandler.getCurrent().getGeneralTopic());
                            testRoot.setExpanded(false);
                            for (TestModule item : quizHandler.getCurrent().getModules()) {
                                updateTree(item.getName() + " | " + item.getType().toRus());
                            }
                            testTree.setRoot(testRoot);
                        }
                    } catch (Exception e) {
                        log.error("Platform.runLater() -> ", e);
                    }
                }
        );

    }

    private void updateTree(String data){
        testTree.getRoot().getChildren().add(new TreeItem<>(data));
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

    public void addSingleModule(ActionEvent actionEvent) {
        
    }

    public void addMultiModule(ActionEvent actionEvent) {
    }

    public void addMappingModule(ActionEvent actionEvent) {
    }

    public void addGraphicModule(ActionEvent actionEvent) {
    }
}

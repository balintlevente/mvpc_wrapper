package org.mvpcwrppr.presenter;

import javafx.application.Application;
import javafx.stage.Stage;
import org.mvpcwrppr.controller.ControllerBase;
import org.mvpcwrppr.model.PresentationModel;
import sample.Controller;
import sample.Model;

public class PresenterBase extends Application{
    ControllerBase controller;
    PresentationModel model;

    public PresenterBase(Model model, Controller controller) {
        this.model = model;
        this.controller = controller;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public void setController(ControllerBase controller) {
        this.controller = controller;
    }

    public void setModel(PresentationModel model) {
        this.model = model;
    }
}

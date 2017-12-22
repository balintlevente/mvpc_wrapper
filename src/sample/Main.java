package sample;

import javafx.application.Application;

public class Main{
    private final Model model;
    private final Controller controller;
    private final Presenter presenter;

    public Main() {
        model = new Model();
        controller = new Controller();
        presenter = new Presenter(model, controller);
    }

    public static void main(String[] args) {
        new Main();
        Application.launch(args);
    }
}

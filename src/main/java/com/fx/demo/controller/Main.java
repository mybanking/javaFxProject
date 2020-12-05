package com.fx.demo.controller;

import com.fx.demo.resources.filesHandling;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import static com.fx.demo.controller.MainViewController.findTh;
import java.net.URL;
import java.util.Optional;

/**
 * @DESCRIPTION:
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  18:44 2020/12/5
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL url=getClass().getResource("");
        System.out.println(url.toString());
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/MainView.fxml"));
        filesHandling.stage=stage;

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Text Editor by Red Ayoub");
        stage.show();
        stage.setOnCloseRequest((event)->{
            if (filesHandling.textChanged==false) {
                return;
            }
            Alert alert=new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Saving file");
            alert.setContentText("Save changes to document before closing?");
            ButtonType bt1=new ButtonType("Yes", ButtonBar.ButtonData.YES);
            ButtonType bt2=new ButtonType("No",ButtonBar.ButtonData.NO);
            ButtonType bt3=new ButtonType("Cancel",ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(bt1,bt2,bt3);
            Optional<ButtonType> res=alert.showAndWait();
            if (res.get().equals(bt1)){
                System.out.println("Yes");
                filesHandling.save();
            }else{
                if (res.get().equals(bt2)){
                    System.out.println("No");
                    if (findTh!=null) {

                    }
                }else{
                    if (res.get().equals(bt3)){
                        System.out.println("Cancel");
                        event.consume();
                    }
                }
            }
        });


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

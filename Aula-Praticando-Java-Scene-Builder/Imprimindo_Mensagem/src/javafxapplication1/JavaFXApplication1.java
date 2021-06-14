/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Carlos
 */
public class JavaFXApplication1 extends Application {

    // CHAMADA DE METODO PARA INICIAR O PALCO
    /**
     * @param stage
     * @Override public void start(Stage stage) throws Exception { Parent root =
     * FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
     *
     * Scene scene = new Scene(root);
     *
     * stage.setScene(scene); stage.show(); }
     */
    @Override
    public void start(Stage stage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
            Scene scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}

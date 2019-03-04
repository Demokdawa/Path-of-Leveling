/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe.level.fx.overlay;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import poe.level.fx.Preferences_Controller;

/**
 *
 * @author Christos
 */
public class Settings_Stage extends Stage{

    private Preferences_Controller controller;
    
     public Settings_Stage(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/poe/level/fx/preferences.fxml"));
        AnchorPane ap = null;
        try {
            ap = loader.load();
        } catch (IOException ex) {
            Logger.getLogger(ZoneOverlay_Stage.class.getName()).log(Level.SEVERE, null, ex);
        }
        controller = loader.<Preferences_Controller>getController();
        
        Scene scene = new Scene(ap);
        scene.getStylesheets().add(getClass().getResource("/styles/style.css").toExternalForm());
        
        this.setScene(scene);
        //this.setAlwaysOnTop(true);
        this.setOnCloseRequest(event -> {
            this.hide();
        });
        
        this.show();
    }
    
}

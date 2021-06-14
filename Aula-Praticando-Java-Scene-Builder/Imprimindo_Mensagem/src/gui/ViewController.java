/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Carlos
 */
public class ViewController {
    @FXML
    private Button btImprimeMensagem;
   
    
    
   public void onBtImprimeAction(){
       
       System.out.println("Click");
   }
}

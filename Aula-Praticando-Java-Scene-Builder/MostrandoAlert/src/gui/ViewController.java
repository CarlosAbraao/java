/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
       
      Alerts.showAlert("Mensagem motivacional", "Mensagem do dia!", " O impossível é desculpa para o desistente e desafio para o vencedor.", Alert.AlertType.INFORMATION);
   }
}

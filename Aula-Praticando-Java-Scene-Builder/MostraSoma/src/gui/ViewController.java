/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Carlos
 */
public class ViewController {
    @FXML
    private Button btResolveConta;
    @FXML
    private Label labelMostraResultado;
    @FXML
    private TextField txtValor1;
    @FXML
    private TextField txtValor2;
   
    
    
   public void onBtImprimeResultado(){
       
       double valor1 = Double.parseDouble(txtValor1.getText());
       double valor2 = Double.parseDouble(txtValor2.getText());
       
       double soma = valor1 + valor2;
       
       labelMostraResultado.setText(String.format("%.2f", soma));
   }
}

package com.mycompany.pruebagrafica;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class FXMLController implements Initializable {
    
    @FXML
    private Canvas canvas;
    
    private GraphicsContext lienzo;
    
    private double w;
    private double h;
    
    
    @FXML
    private void TringuloEject(ActionEvent event) {
       double[] x = {20, 30, 10};
       double[] y = {20, 40, 40};
       lienzo.strokePolygon(x, y, 3);
       lienzo.setFill(new Color(0, 1, 0, 1));
       lienzo.fillPolygon(x, y, 3);
    }
    
     @FXML
    private void RomboEject(ActionEvent event) {
       double[] x = {40,45,40,35};
       double[] y = {40,45,50, 45};
       lienzo.strokePolygon(x, y, 4);
       lienzo.setFill(new Color(0, 1, 0, 1));
       lienzo.fillPolygon(x, y, 4);
    }
    
    @FXML
    private void Rectangulo1Eject(ActionEvent event) {
       lienzo.strokeRect(200,50, 50, 100);
       lienzo.setStroke(Color.GREEN);
    }
    
     @FXML
    private void Rectangulo2Eject(ActionEvent event) {
       lienzo.strokeRect(100, 40, 40, 100);
       lienzo.setStroke(new Color(1, 0, 0, 1));
       lienzo.setFill(new Color(0, 0, 1, 1));
       lienzo.fillRect(100, 40, 40, 100);
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lienzo = canvas.getGraphicsContext2D();
        w = canvas.getWidth();
        h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(new Color(.15, .15, .15, .95));
        lienzo.setLineWidth(2);
        lienzo.strokeRect(0, 0, w, h); 
    }  
    
    
     @FXML
    private void ClearAll(ActionEvent event) {
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(new Color(0, 0, 0, 1));
        lienzo.setLineWidth(2);
        lienzo.strokeRect(0, 0, w, h);
       
    }
}

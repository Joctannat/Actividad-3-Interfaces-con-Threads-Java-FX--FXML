package com.joctan.ejercicio_3_1;

import java.io.IOException;
import javafx.application.Platform; /////////////////
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox; /// importar vbox

public class PrimaryController {

    
    
    @FXML Button bCONTAR;
    @FXML TextField caja;
    @FXML ProgressBar barra;
    
    /* vincular el vbox con el controlador java*/
    @FXML 
    private VBox contenedor;
    /* EN EL FXML SE LE TIENE QUE PONER EL ID AL VBOX PARA VINCULARLO AQUI*/
    
    
    @FXML Button botonESPERAR; // asociar el boton a eliminar
    
    
    int contador = 0;
    
    @FXML
    private void contar() throws IOException {
        contador = contador + 1;
        
        
        caja.setText(String.format("%d", contador));
        
    }
    
    
    
    
    
    
    
    @FXML
    private void progreso() throws IOException {
        
        contenedor.getChildren().remove(botonESPERAR);
    
        
        Thread hilo = new Thread(()->{
        try{
        for(int i = 0; i<=100; i++){
            final double progresoB = i /100.0;
            
            Platform.runLater(()->{
                barra.setProgress(progresoB);
            });
            
            Thread.sleep(100);    

            
        }// Llave del for
        
    } catch (InterruptedException e){    // Llave del try e inicio del catch
        e.printStackTrace();
    }
 
 }); // cierra el hilo
        
    hilo.start(); // iniciar el hilo
        
        
        
        
    } // termina el metodo
    
    
    
} // llave de la clase Primaryccccc

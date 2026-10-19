package com.joctan.ejercicio_3_2;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController {
    
    @FXML ProgressBar liebre;
    @FXML ProgressBar tortuga;
    
    @FXML Label EqLiebre;
    
    
    @FXML
    private void iniciar() throws IOException {
        
        /* Liebre */
        Thread Liebre = new Thread(()->{
            try{
                for(int i = 0; i<100; i++){
                    final double progresoL = i/100.0;
                    
                    Platform.runLater(()->{
                        liebre.setProgress(progresoL); 
                    });
                Thread.sleep(100);           
                
                    /* HACER QUE SE DETENGA CUANDO EL PROGRESO LLEGUE AL 50% */
                     if(progresoL==0.5){
                        Platform.runLater(()->{
                            EqLiebre.setText("¡La liebre se durmió!");  // usar run later para cambiar la etq porque no se puede cambiar desde el hilo de afuera.
                        }); 

                        Thread.sleep(10000);
                        i = i +1;
                        Platform.runLater(()->{
                            EqLiebre.setText("¡La liebre Despertó!");
                        }); 
                     } // Lave if
                     /* HACER QUE SE DETENGA CUANDO EL PROGRESO LLEGUE AL 50%   */
 
                } // Lave for
     
            }catch(InterruptedException e){
                e.printStackTrace();
            }    
        }); // TERMINA EL HILO
        Liebre.start(); 
        
        
        
        
       
        
        
        
        
        /* Tortuga */
        Thread Tortuga = new Thread(()->{
            try{
                for(int i = 0; i<100; i++){
                    final double progresoL = i/100.0;
                    
                    Platform.runLater(()->{
                        tortuga.setProgress(progresoL); 
                    });
                Thread.sleep(190);   
                    
                }
     
            }catch(InterruptedException e){
                e.printStackTrace();
            }
               
        });
        Tortuga.start();
        
        
        
        
        
    }
}

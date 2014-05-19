/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author rony
 */
public class hilo_para_simulacion extends Thread {
    
    /*************datos para la simulacion ********************/
    Coloca_imagen pista;
    int pos_x = 10;
    int aceleracion;
    int distancia;

    /***boleano para cuando llege a la distancia se termine el bucle************/
    boolean meta=false;
    
    
    public hilo_para_simulacion(Coloca_imagen pista,int aceleracion,int distancia){
    this.pista= pista;
    this.distancia = distancia;
    this.aceleracion = aceleracion;
    }
    
    
    @Override
    public void run(){
             
             while(!meta){
                 pos_x+=5;  /*suma dias a la posicion**/
                 //aceleracion += aceleracion; //hay que furmarse uba formala para ver como cambia
                 try {
                   
                 this.sleep(aceleracion); // duermo el hilo con la celeracion (creo que hay que ver como se hace que para queda iteracion dismunuya)
                 } catch (InterruptedException ex) {
                 Logger.getLogger(hilo_para_simulacion.class.getName()).log(Level.SEVERE, null, ex);
                 }
              if(pos_x >= distancia){
               meta = true;   
              }
              else{
               pista.pone_posicion(pos_x);
               pista.repaint();
             }
    
             }
             detener_hilo();
              
    }
    
    
    ///funcion para romper el hilo
    void detener_hilo(){
     this.stop();
    }
    void parar_hilo(){
    this.suspend();
    }
}

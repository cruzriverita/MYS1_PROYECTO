/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author rony
 */
public class hilo_para_simulacion extends Thread {
    
    /*************datos para la simulacion ********************/
    Coloca_imagen pista; // puntero para manejar el panel que funciona como la pista de la simulacion
    int pos_x = 10; // puntero para la posicion x. ya que solo se va a mover en horizontal
    
    int aceleracion;
    int distancia;

    /***boleano para cuando llege a la distancia se termine el bucle************/
    boolean meta=false;
    
    /************* funcion ya se llama cuando se crea una instancia del hilo ***************************/
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
               meta = true;  //*** cuando llega a la distancia acordada rompo el ciclo para que no siga caminado
              }
              else{
               pista.pone_posicion(pos_x); // pone la nueva posicion en x del carro.
               pista.repaint(); // repinto el panel pista para que se vea el cambio de posicion 
             }
    
             }
             detener_hilo(); // cuando termina rompe el hilo para .. para no dejarlo correr mas
              
    }
    
    
    ///funcion para romper el hilo
    public void detener_hilo(){
     pista.pone_posicion(distancia); // pone al carro en el fin de la distancia
     pista.repaint(); // repinto el panel pista para que se vea el cambio de posicion 
     meta = true;
     this.stop();
    }
    
    //fucion para detener el hilo de la simulacion
    public void parar_hilo(){
    this.suspend();
    }
    
    public void reanudar_hilo(){
    this.resume();
    }
}

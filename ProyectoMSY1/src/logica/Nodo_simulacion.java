/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;


import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author rony
 */
public class Nodo_simulacion {
   /*va a contener los datos para las simulaciones*/
   //Variables  para calculos
    
    int distancia=0;
    int velocidad;
    int aceleracion;
    int tiempo;
    
    //variables para simulacion 
    ImageIcon Nombre_imgen;
    Coloca_imagen pista;
    int pos_x =10;
    int pos_y =40;
    
    int tipo_carro; // es para saver que tipo de carro se escogio  0->lambo 1->mcla 2->VW  3-> Ford
    //variables para el momento de la simulaion
    JLabel datos ;
    /***************puntero para el hilo /******************/
    hilo_para_simulacion hilo;
    
    //metodo para colocar los valores predeterminados
    public Nodo_simulacion(ImageIcon imagen,Coloca_imagen pista,JLabel datos,int tipo,int distancia,int velocidad,int aceleracion,int tiempo){
    this.Nombre_imgen = imagen;
    this.pista =pista;
    this.distancia =distancia;
    this.velocidad = velocidad;
    this.aceleracion=aceleracion;
    this.tiempo = tiempo;
    this.datos = datos;
    this.tipo_carro = tipo;
    hilo = new hilo_para_simulacion(pista,500,distancia);
   
    }
    
    //metodo para poner solo velocidad
    public void pone_velocidad(int cantidad){
    this.velocidad = cantidad;
    }
    
     //metodo para poner solo aceleracion
    public void pone_aceleraccion(int cantidad){
    this.velocidad = cantidad;
    }
    
     //metodo para poner solo tiempo
    public void pone_tiempo(int cantidad){
    this.tiempo = cantidad;
    }
     //metodo para poner solo posicion x
    public void pone_posx(int cantidad){
    this.pos_x = cantidad;
    }
    //metodo para poner solo posicion y
    public void pone_posy(int cantidad){
    this.pos_y = cantidad;
    }
    
    
    //Metodos para obtener las variables las cules se utilizadan para la simulacion
    public int obten_velocidad(){
    return velocidad;
    }
    
    public int obten_aceleraacion(){
    return aceleracion;
    }
    
    public int obten_tiempo(){
    return tiempo;
    }
    
    public int obten_distancia(){
    return distancia;
    }
    
    public int obten_posx(){
    return pos_x;
    }
    
    
   public  int obten_posy(){
    return pos_y;
    }
    
    public Coloca_imagen obten_pista(){
    return this.pista;
    }
    
    public ImageIcon obten_imagen(){
    return this.Nombre_imgen;
    }
    
    public hilo_para_simulacion obten_hilo(){
     return hilo;
    }
   
    public JLabel obten_etiq(){
    return datos;
    }
    
    
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public void iniciar_simulacion(){
    hilo = new hilo_para_simulacion(pista,500,distancia); //creo el hilo que va a manejar la simulacion y seteo los valores que boy a utilizar
    hilo.start(); // inicio el hilo para que empieze a correr el  carro
    }
    
    /****************** funciones para manejar la Jlabel***************/
     public void pone_datos(String reales){
      this.datos.setText("Carro: "+reales);
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

/**
 *
 * @author gustavoreyeshdez
 */
public class FormulaVelocidad {
    private float velocidad;
    private float tiempo;
    private float distancia;
    
    //Constructor de la clase
    public FormulaVelocidad(){
        velocidad = 0;
        tiempo = 0;
        distancia = 0;
    }
 /**
     * Este método calcula la velocidad usando la formula
     * velocidad = distancia / tiempo
     */
    public void calculaVelocidad(){
        velocidad = distancia/tiempo;
    }
    
    /**
     * Este método calcula la velocidad usando la formula
     * tiempo = distancia / velocidad
     */
    public void calculaTiempo(){
        tiempo = distancia / velocidad;
    }
    
    /**
     * Este método calcula la velocidad usando la formula
     * distancia = velocidad * tiempo
     */
    public void calculaDistancia(){
        distancia = velocidad * tiempo;
    }
    /**
     * @return the velocidad
     */
    public float getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the tiempo
     */
    public float getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the distancia
     */
    public float getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
   
}

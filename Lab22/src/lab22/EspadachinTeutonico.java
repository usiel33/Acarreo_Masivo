/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class EspadachinTeutonico extends Soldado implements HabilidadEspecial {
    private int jabalinas;
    private boolean modoTortuga;
    private int nivelEvolucion; 
    public EspadachinTeutonico(String nombre, int fila, int columna) {
        super(nombre, fila, columna, 10, 12, 13, "Sacro Imperio Romano Germánico");
        this.jabalinas = 5; 
        this.modoTortuga = false;  
        this.nivelEvolucion = 1;  
    }
    public void evolucionar() {
        if(nivelEvolucion<4){ 
            nivelEvolucion++;
            jabalinas += 5;  
            System.out.println(getNombre()+" ha evolucionado al nivel "+nivelEvolucion);
        } else {
            System.out.println(getNombre()+" ya está en el nivel maximo.");
        }
    }
    public void habilidadEspecial() {
        if (jabalinas>0){
            System.out.println(getNombre()+" lanza una jabalina");
            jabalinas--;
        } else {
            System.out.println(getNombre()+" no tiene jabalinas disponibles");
        }
    }
    public void activarModoTortuga(){
        this.modoTortuga = true;
        System.out.println(getNombre()+" ha activado el modo tortuga, aumentando su defensa");
        aumentoNivelDefensa(5);
    }
    public void desactivarModoTortuga() {
        this.modoTortuga = false;
        System.out.println(getNombre()+" ha desactivado el modo tortuga");
        aumentoNivelDefensa(-5); 
    }
    public String toString() {
        return super.toString()+" | Nivel de Evolucion: "+nivelEvolucion+" | Jabalinas restantes: "+jabalinas+
                " | Modo Tortuga: "+(modoTortuga ? "Activado" : "Desactivado");
    }
}

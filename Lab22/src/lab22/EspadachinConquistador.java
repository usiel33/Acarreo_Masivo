/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class EspadachinConquistador extends Soldado implements HabilidadEspecial {
    private int hachas;
    private int nivelEvolucion;
    public EspadachinConquistador(String nombre, int fila, int columna) {
        super(nombre, fila, columna, 11, 9, 14, "Aragon - Castilla");
        this.hachas = 5;
        this.nivelEvolucion = 1;
    }
    public void evolucionar() {
        if(nivelEvolucion<4){  
            nivelEvolucion++;
            hachas += 5; 
            System.out.println(getNombre()+" ha evolucionado al nivel "+nivelEvolucion);
        } else {
            System.out.println(getNombre()+" ya esta en el nivel maximo");
        }
    }
    public void habilidadEspecial() {
        if(hachas>0){
            System.out.println(getNombre()+" lanza un hacha");
            hachas--;
        } else {
            System.out.println(getNombre()+" no tiene hachas disponibles");
        }
    }
    public String toString() {
        return super.toString()+" | Nivel de Evolucion: "+nivelEvolucion+" | Hachas restantes: "+hachas;
    }
}



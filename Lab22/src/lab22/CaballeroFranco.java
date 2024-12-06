/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 **
 * @author FABRIZIO
 */
public class CaballeroFranco extends Soldado implements HabilidadEspecial {
    private int lanzas;
    private int nivelEvolucion;  
    public CaballeroFranco(String nombre, int fila, int columna) {
        super(nombre, fila, columna, 12, 10, 15, "Francia");
        this.nivelEvolucion = 1; 
        this.lanzas = 5; 
    }
    public void evolucionar(){
        if(nivelEvolucion<4){
            nivelEvolucion++;
            lanzas += 5; 
            System.out.println(getNombre()+" ha evolucionado al nivel "+nivelEvolucion);
        }else{
            System.out.println(getNombre()+" ya está en el nivel maximo");
        }
    }
    public void habilidadEspecial() {
        if(lanzas>0){
            System.out.println(getNombre()+" lanza una lanza");
            lanzas--;
        }else{
            System.out.println(getNombre()+" no tiene lanzas disponibles");
        }
    }
    public String toString() {
        return super.toString()+" | Nivel de Evolucion: "+nivelEvolucion+" | Lanzas restantes: "+lanzas;
    }
}

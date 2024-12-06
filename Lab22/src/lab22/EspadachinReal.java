/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class EspadachinReal extends Soldado implements HabilidadEspecial {
    private int cuchillos;
    private int nivelEvolucion;  
    public EspadachinReal(String nombre, int fila, int columna) {
        super(nombre, fila, columna, 10, 8, 12, "Inglaterra");
        this.nivelEvolucion = 1; 
        this.cuchillos = 5; 
    }
    public void evolucionar() {
        if(nivelEvolucion<4){ 
            nivelEvolucion++;
            cuchillos+=5; 
            System.out.println(getNombre()+" ha evolucionado al nivel "+nivelEvolucion);
        }else{
            System.out.println(getNombre()+" ya esta en el nivel maximo");
        }
    }
    public void habilidadEspecial() {
        if(cuchillos>0){
            System.out.println(getNombre()+" lanza un cuchillo");
            cuchillos--;
        }else{
            System.out.println(getNombre()+" no tiene cuchillos disponibles");
        }
    }
    public String toString(){
        return super.toString()+" | Nivel de Evolucion: "+nivelEvolucion+" | Cuchillos restantes: "+cuchillos;
    }
}
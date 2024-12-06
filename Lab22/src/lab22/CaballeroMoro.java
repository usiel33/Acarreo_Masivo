/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class CaballeroMoro extends Soldado implements HabilidadEspecial {
    private int flechas;
    private int poderEmbestida;
    private int nivelEvolucion;  
    public CaballeroMoro(String nombre, int fila, int columna) {
        super(nombre, fila, columna, 14, 10, 13, "Moros");
        this.flechas = 5;  
        this.poderEmbestida = 10;  
        this.nivelEvolucion = 1;  
    }
    public void evolucionar() {
        if(nivelEvolucion<4){
            nivelEvolucion++;
            flechas += 3;
            poderEmbestida += 5;  
            System.out.println(getNombre()+" ha evolucionado al nivel "+nivelEvolucion);
        }else{
            System.out.println(getNombre()+" ya está en el nivel maximo");
        }
    }
    public void habilidadEspecial(){
        if(flechas>0){
            System.out.println(getNombre()+" lanza una flecha");
            flechas--;
        }else {
            System.out.println(getNombre()+" no tiene flechas disponibles");
        }
    }
    public void embestir() {
        System.out.println(getNombre()+" embiste con poder de "+poderEmbestida);
    }
    public String toString() {
        return super.toString()+" | Nivel de Evolucion: "+nivelEvolucion+" | Flechas restantes: "+
                flechas+" | Poder de embestida: "+poderEmbestida;
    }
}



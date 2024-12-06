/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class Arquero extends Soldado {
    private int numFlechas;
    public Arquero(String nombre, int fila, int columna, int numFlechas, String ejercito) {
        super(nombre, fila, columna, 7, 3, (int) (Math.random() * 3) + 3, ejercito);
        this.numFlechas = numFlechas;
    }
    public int getNumFlechas() {
        return numFlechas;
    }
    public void habilidadEspecial() {
        if(numFlechas>0){
            numFlechas--;
            System.out.println(getNombre()+" dispara una flecha y lo quedan : "+numFlechas);
        }else{
            System.out.println(getNombre()+" se ha quedado sin flechas.");
        }
    }
}

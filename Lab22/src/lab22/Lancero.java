/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class Lancero extends Soldado {
    private double longitudLanza;
    public Lancero(String nombre, int fila, int columna, double longitudLanza, String ejercito) {
        super(nombre, fila, columna, 5, 10, (int) (Math.random() * 4) + 5, ejercito);
        this.longitudLanza = longitudLanza;
    }
    public double getLongitudLanza() {
        return longitudLanza;
    }
    public void habilidadEspecial() {
        aumentoNivelDefensa(2);
        System.out.println(getNombre()+" adopta una formacion defensiva, aumentando su nivel de defensa.");
    }
}



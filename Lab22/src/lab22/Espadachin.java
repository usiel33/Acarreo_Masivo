/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class Espadachin extends Soldado {
    private double longitudEspada;
    public Espadachin(String nombre, int fila, int columna, double longitudEspada, String ejercito) {
        super(nombre, fila, columna, 10, 8, (int) (Math.random() * 3) + 8, ejercito);
        this.longitudEspada = longitudEspada;
    }
    public double getLongitudEspada() {
        return longitudEspada;
    }
    public void habilidadEspecial() {
        System.out.println(getNombre()+" crea un muro de escudos para proteger a su ejercito");
    }
}

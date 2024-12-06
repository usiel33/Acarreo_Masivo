/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public class Caballero extends Soldado {
    private String arma;
    private boolean montado;
    public Caballero(String nombre, int fila, int columna, String ejercito) {
        super(nombre, fila, columna, 13, 7, (int)(Math.random()*3)+10, ejercito);
        this.arma = "espada";
        this.montado = false;
    }
    public String getArma() {
        return arma;
    }
    public boolean isMontado() {
        return montado;
    }
    public void montar() {
        if(!montado){
            montado=true;
            arma="lanza";
            System.out.println(getNombre()+" ha montado su caballo, cambia de arma a "+arma);
        } else {
            System.out.println(getNombre()+" ya esta montado");
        }
    }
    public void desmontar() {
        if(montado){
            montado= false;
            arma = "espada";
            System.out.println(getNombre()+" desmonta su caballo y cambia de arma a "+arma);
        }else{
            System.out.println(getNombre()+" ya esta desmontado");
        }
    }
    public void habilidadEspecial() {
        System.out.println(getNombre()+" realiza una carga montada y enviste");
    }
}


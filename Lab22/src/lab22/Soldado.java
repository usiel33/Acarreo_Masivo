/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
public abstract class Soldado {
    private String nombre;
    private int nivelAtaque;
    private int nivelDefensa;
    private int nivelVida;
    private int vidaActual;
    private double velocidad;
    private String actitud;
    private int fila;
    private int columna;
    private String ejercito;
    public Soldado(String nombre, int fila, int columna, int nivelAtaque, int nivelDefensa, int nivelVida, String ejercito) {
        this.nombre = nombre;
        this.fila = fila;
        this.columna = columna;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
        this.nivelVida = nivelVida;
        this.vidaActual = nivelVida;
        this.ejercito = ejercito;
        this.velocidad = (int) (Math.random() * 5) + 1;
        String[] actitudes = {"atacar", "defender", "huir"};
        this.actitud = actitudes[(int) (Math.random() * actitudes.length)];
    }
    public String getNombre() {
        return nombre;
    }
    public String getEjercito() {
        return ejercito;
    }
    public int getNivelAtaque() {
        return nivelAtaque;
    }
    public int getNivelDefensa() {
        return nivelDefensa;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public int getVidaActual() {
        return vidaActual;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public String getActitud() {
        return actitud;
    }
    public int getFila() {
        return fila;
    }
    public int getColumna() {
        return columna;
    }
    public void mover(int nuevaFila, int nuevaColumna) {
        this.fila = nuevaFila;
        this.columna = nuevaColumna;
    }
    public void aumentarNivelVida() {
        this.nivelVida += 1;
        this.vidaActual = this.nivelVida;
    }
    public void aumentoNivelDefensa(int bonus) {
        this.nivelDefensa += bonus;
    }
    public abstract void habilidadEspecial();
    public String toString() {
        return nombre + "(Nivel de ataque: " + nivelAtaque + " | Nivel de defensa: " + nivelDefensa +
                " | Vida actual: " + vidaActual + " | Velocidad: " + velocidad + " | Actitud: " + actitud + ")";
    }
}

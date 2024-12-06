/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
import java.util.*;

public class Ejercito {

    private ArrayList<Soldado> soldados;
    private String nombreEjercito;
    private int vidaTotal;
    private String nombreReino;
    private boolean eliminado;
        int espadachines = 0;
        int arqueros = 0;
        int caballeros = 0;
        int lanceros = 0;
        int caballerosMoro = 0;
        int espadachinReal = 0;
        int caballeroFranco = 0;
        int espadachinTeutonico = 0;
        int espadachinConquistador = 0;

    public Ejercito(int cantidadSoldados, String nombreEjercito, String nombreReino) {
        this.soldados = new ArrayList<>();
        this.nombreEjercito = nombreEjercito;
        this.nombreReino = nombreReino;
        this.vidaTotal = 0;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void generarEjercito(int cantidadS, Soldado[][] tablero, String tipoE) {
        for (int i = 0; i < cantidadS; i++) {
            String tipoSoldado = "";
            if (this.nombreReino.equals("Inglat") && Math.random() < 0.2) {
                tipoSoldado = "EspadachinReal";
            } else if (this.nombreReino.equals("Francia") && Math.random() < 0.2) {
                tipoSoldado = "CaballeroFranco";
            } else if (this.nombreReino.equals("SacroIm") && Math.random() < 0.2) {
                tipoSoldado = "EspadachinTeutonico";
            } else if (this.nombreReino.equals("Castilla") && Math.random() < 0.2) {
                tipoSoldado = "EspadachinConquistador";
            } else if (this.nombreReino.equals("Moros") && Math.random() < 0.2) {
                tipoSoldado = "CaballeroMoro";
            } else {
                switch ((int) (Math.random() * 4)) {
                    case 0:
                        tipoSoldado = "Espadachin";
                        break;
                    case 1:
                        tipoSoldado = "Caballero";
                        break;
                    case 2:
                        tipoSoldado = "Arquero";
                        break;
                    default:
                        tipoSoldado = "Lancero";
                        break;
                }
            }
            String nombre = tipoSoldado + i + "X" + tipoE;
            int fila, columna;
            while (true) {
                fila = (int) (Math.random() * 10);
                columna = (int) (Math.random() * 10);
                if (tablero[fila][columna] == null) {
                    Soldado soldado;
                    if ("EspadachinReal".equals(tipoSoldado)) {
                        soldado = new EspadachinReal(nombre, fila, columna);
                    } else if ("CaballeroFranco".equals(tipoSoldado)) {
                        soldado = new CaballeroFranco(nombre, fila, columna);
                    } else if ("EspadachinTeutonico".equals(tipoSoldado)) {
                        soldado = new EspadachinTeutonico(nombre, fila, columna);
                    } else if ("EspadachinConquistador".equals(tipoSoldado)) {
                        soldado = new EspadachinConquistador(nombre, fila, columna);
                    } else if ("CaballeroMoro".equals(tipoSoldado)) {
                        soldado = new CaballeroMoro(nombre, fila, columna);
                    } else if ("Espadachin".equals(tipoSoldado)) {
                        soldado = new Espadachin(nombre, fila, columna, 12, tipoSoldado);
                    } else if ("Caballero".equals(tipoSoldado)) {
                        soldado = new Caballero(nombre, fila, columna, tipoSoldado);
                    } else if ("Arquero".equals(tipoSoldado)) {
                        soldado = new Arquero(nombre, fila, columna, 8, tipoSoldado);
                    } else {
                        soldado = new Lancero(nombre, fila, columna, 12, tipoSoldado);
                    }
                    soldados.add(soldado);
                    tablero[fila][columna] = soldado;
                    break;
                }
            }
        }
    }

    public String getNombreEjercito() {
        return nombreEjercito;
    }

    public int vidaTotal() {
        int totalVida = 0;
        for (Soldado soldado : soldados) {
            totalVida += soldado.getNivelVida();
        }
        return totalVida;
    }

    public void eliminarEjercito() {
        soldados.clear();
        this.vidaTotal = 0;
    }

    public String getNombreReino() {
        return nombreReino;
    }
    public String getCantidadSoldados(){
        return ""+ (espadachines + arqueros + caballeros + lanceros
                + caballerosMoro + espadachinReal + espadachinTeutonico + espadachinConquistador + caballeroFranco);
    }

    public void aumentarVidaSoldados() {
        for (Soldado soldado : soldados) {
            soldado.aumentarNivelVida();
        }
        actualizarVidaTotal();
    }

    public int totalSoldados() {
        return soldados.size();
    }

    public void mostrarSoldadosActualizados() {
        System.out.println(nombreEjercito + " despues del bonus:");
        for (Soldado soldado : soldados) {
            System.out.println("  " + soldado);
        }
    }

    private void actualizarVidaTotal() {
        int vidaTotalCalculada = 0;
        for (Soldado soldado : soldados) {
            vidaTotalCalculada += soldado.getNivelVida();
        }
        this.vidaTotal = vidaTotalCalculada;
    }

    public void mostrarSoldados() {
        System.out.println("Ejercito " + nombreEjercito + ":");
        for (Soldado soldado : soldados) {
            System.out.println("  " + soldado);
        }
    }

    public String contarSoldados(List<Ejercito> ejercito) {
        String datos = "";
        
        for (Ejercito ej : ejercito) {
            for (Soldado soldado : ej.getSoldados()) {
                if (soldado instanceof EspadachinReal) {
                    espadachinReal++;
                } else if (soldado instanceof EspadachinTeutonico) {
                    espadachinTeutonico++;
                } else if (soldado instanceof EspadachinConquistador) {
                    espadachinConquistador++;
                } else if (soldado instanceof CaballeroMoro) {
                    caballerosMoro++;
                } else if (soldado instanceof CaballeroFranco) {
                    caballeroFranco++;
                } else if (soldado instanceof Espadachin) {
                    espadachines++;
                } else if (soldado instanceof Arquero) {
                    arqueros++;
                } else if (soldado instanceof Caballero) {
                    caballeros++;
                } else if (soldado instanceof Lancero) {
                    lanceros++;
                }
            }
        }
        if (!ejercito.isEmpty()) {
            System.out.println("Ejercito: " + ejercito.get(0).getNombreEjercito());
        } else {
            System.out.println("No hay ejercitos disponibles.");
        }
        datos += "Cantidad total de soldados: " + (espadachines + arqueros + caballeros + lanceros
                + caballerosMoro + espadachinReal + espadachinTeutonico + espadachinConquistador + caballeroFranco);
        datos += "\nEspadachines: " + espadachines;
        datos += "\nArqueros: " + arqueros;
        datos += "\nCaballeros: " + caballeros;
        datos += "\nLanceros: " + lanceros;
        datos += "\nCaballeros Moro: " + caballerosMoro;
        datos += "\nEspadachin Real: " + espadachinReal;
        datos += "\nCaballero Franco: " + caballeroFranco;
        datos += "\nEspadachin Teutonico: " + espadachinTeutonico;
        datos += "\nEspadachin Conquistador: " + espadachinConquistador;
        return datos;
    }
}

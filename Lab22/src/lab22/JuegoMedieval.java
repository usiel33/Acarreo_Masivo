package lab22;

import java.util.ArrayList;
import java.util.List;

public class JuegoMedieval {
    PantallaSeleccionReinos seleccionReino= new PantallaSeleccionReinos();
    
    String reino1=seleccionReino.getReino1();
    String reino2=seleccionReino.getReino2();
    ArrayList<Ejercito> ejercitosReino1;
    ArrayList<Ejercito> ejercitosReino2;
    Mapa tablero;

    public JuegoMedieval() {

        ejercitosReino1=crearEjercitos(reino1);
        ejercitosReino2=crearEjercitos(reino2);
        
    }
    public String getCantSoldadosR1(){
       return ejercitosReino1.get(0).getCantidadSoldados();
        
    }
      public String getCantSoldadosR2(){
       return ejercitosReino2.get(0).getCantidadSoldados();
        
    }
    
    

    public String getEjercito1() {
        return ejercitosReino1.get(0).getNombreEjercito();

    }

    public String getEjercito2() {
        return ejercitosReino2.get(0).getNombreEjercito();

    }

    public void crearSoldados() {
        this.ejercitosReino1 = crearEjercitos(reino1);
        this.ejercitosReino2 = crearEjercitos(reino2);
        contarSoldados(this.ejercitosReino1);
        contarSoldados(this.ejercitosReino2);
        this.tablero = new Mapa(ejercitosReino1, ejercitosReino2);
        this.tablero.bonusTerritorio();

    }

    public static ArrayList<Ejercito> crearEjercitos(String identificadorReino) {
        int cantidadEjercitos = 1;  // O ajusta según tus necesidades
        System.out.println("El número de ejércitos en el Reino " + identificadorReino + " es: " + cantidadEjercitos);
        ArrayList<Ejercito> ejercitos = new ArrayList<>();
        for (int i = 0; i < cantidadEjercitos; i++) {
            int cantidadSoldados = (int) (Math.random() * 10) + 1;
            Ejercito ejercito = new Ejercito(cantidadSoldados, "Ej" + i + identificadorReino, identificadorReino);
            ejercitos.add(ejercito);
            System.out.println("Detalles del " + ejercito.getNombreEjercito() + ":");
            ejercito.generarEjercito(cantidadSoldados, new Soldado[10][10], identificadorReino);
            ejercito.mostrarSoldados();
            System.out.println();
        }
        return ejercitos;
    }

    private void contarSoldados(ArrayList<Ejercito> ejercitos) {
        for (Ejercito ejercito : ejercitos) {
            ejercito.contarSoldados(ejercitos);
        }
    }

    public void iniciarJuego() {
        // Lógica del juego aquí
    }

    // Métodos adicionales para la lógica del juego
}

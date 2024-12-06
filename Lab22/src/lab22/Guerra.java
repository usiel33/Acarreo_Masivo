package lab22;

import java.util.*;

public class Guerra {
    PantallaSeleccionReinos seleccionReino = new PantallaSeleccionReinos();
     String reino1=seleccionReino.getReino1();
    String reino2=seleccionReino.getReino2();
     ArrayList<Ejercito> ejercitosReino1;
     ArrayList<Ejercito> ejercitosReino2;
     Mapa tablero;

    public Guerra() {
   

   

        // Inicializar ejércitos
        this.ejercitosReino1 = crearEjercitos(this.reino1);
        this.ejercitosReino2 = crearEjercitos(this.reino2);

        // Inicializar el mapa
        this.tablero = new Mapa(ejercitosReino1, ejercitosReino2);
        inicializarEjercitos();
       
    }
    public String obtenerTablero(){
        return tablero.mostrarTablero();
    }
    
    
    public String getTerritorio(){
        return tablero.getTerritorio();
    }

    public String getReino1() {
        return reino1;
    }

    public String getReino2() {
        return reino2;
    }

      public String getCantSoldadosR1(){
       return ejercitosReino1.get(0).getCantidadSoldados();
        
    }
      public String getCantSoldadosR2(){
       return ejercitosReino2.get(0).getCantidadSoldados();
        
    }

    private void verificarReinos(String reino1, String reino2) {
        if (reino2.equals(reino1)) {
            throw new IllegalArgumentException("No puede elegir el mismo Reino, intente otra vez");
        }
    }

    public void inicializarEjercitos() {
        tablero.bonusTerritorio();

        boolean continuar = true;
        int turno = 1;
        while (continuar) {
            if (turno == 1 && ejercitosReino1.isEmpty()) {
                System.out.println("No hay ejercitos en el Reino " + reino1 + ", el ganador es " + reino2);
                continuar = false;
            } else if (turno == 2 && ejercitosReino2.isEmpty()) {
                System.out.println("No hay ejercitos en el Reino " + reino2 + ", el ganador es " + reino1);
                continuar = false;
            } else {
                System.out.println("=== TURNO DEL EJERCITO DEL REINO " + (turno == 1 ? reino1 : reino2) + " ===");
                System.out.println("Estado actual del tablero:");
                tablero.mostrarTablero();
                boolean huboBatalla = tablero.movimiento(turno == 1 ? ejercitosReino1 : ejercitosReino2, turno == 1 ? ejercitosReino2 : ejercitosReino1);
                if (ejercitosReino1.isEmpty()) {
                    System.out.println("El " + reino2 + " ha ganado, el " + reino1 + " no tiene ejercitos");
                    continuar = false;
                } else if (ejercitosReino2.isEmpty()) {
                    System.out.println("El " + reino1 + " ha ganado, el " + reino2 + " no tiene ejercitos");
                    continuar = false;
                }
                turno = (turno == 1 && !ejercitosReino2.isEmpty()) ? 2 : 1;
            }
        }
    }

 
    

    public static ArrayList<Ejercito> crearEjercitos(String identificadorReino) {
        int cantidadEjercitos = 1;
        System.out.println("El numero de ejercitos en el Reino " + identificadorReino + " es: " + cantidadEjercitos);
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
}

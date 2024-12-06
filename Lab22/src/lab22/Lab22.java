/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab22;

/**
 *
 * @author FABRIZIO
 */
import java.util.*;
public class Lab22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Elija el primer Reino:");
        String reino1=elegirReino();
        String reino2="";
        do{
            System.out.println("Elija el segundo Reino:");
            reino2=elegirReino();
            if(reino2.equals(reino1)){
                System.out.println("No puede elegir el mismo Reino, intente otra vez");
            }
        }while(reino2.equals(reino1));
        System.out.println("========================");
        System.out.println("Los Reinos escogidos son:");
        System.out.println("PRIMER REINO: "+reino(reino1)+"("+reino1+")");
        System.out.println("SEGUNDO REINO: "+reino(reino2)+"("+reino2+")");
        System.out.println("========================");
        List<Ejercito> ejercitosReino1=crearEjercitos(reino1);
        List<Ejercito> ejercitosReino2=crearEjercitos(reino2);
        System.out.println("------------------------------------");
        for(Ejercito ejercito : ejercitosReino1){
            ejercito.contarSoldados(ejercitosReino1);
        }
        System.out.println("------------------------------------");
        for(Ejercito ejercito : ejercitosReino2){
            ejercito.contarSoldados(ejercitosReino2);
        }
        System.out.println("------------------------------------");
        Mapa tablero=new Mapa(ejercitosReino1, ejercitosReino2);
        tablero.bonusTerritorio();
        boolean continuar=true;
        int turno=1;
        while(continuar){
            if(turno==1 && ejercitosReino1.isEmpty()){
                System.out.println("No hay ejercitos en el Reino "+reino1+", el ganador es "+reino2);
                continuar=false;
                break;
            }else if(turno==2 && ejercitosReino2.isEmpty()){
                System.out.println("No hay ejercitos en el Reino "+reino2+", el ganador es "+reino1);
                continuar=false;
                break;
            }
            System.out.println("=== TURNO DEL EJERCITO DEL REINO "+(turno==1 ? reino1:reino2)+" ===");
            System.out.println("Estado actual del tablero:");
            tablero.mostrarTablero();
            boolean huboBatalla=tablero.movimiento(turno==1 ? ejercitosReino1:ejercitosReino2,turno==1 ? ejercitosReino2:ejercitosReino1);
            String reinoC1=reino(reino1);
            String reinoC2=reino(reino2);
            if(ejercitosReino1.isEmpty()){
                System.out.println("El "+reinoC2+" ha ganado, el "+reinoC1+" no tiene ejercitos");
                continuar=false;
                break;
            }else if(ejercitosReino2.isEmpty()){
                System.out.println("El "+reinoC1+" ha ganado, el "+reinoC2+" no tiene ejercitos");
                continuar=false;
                break;
            }
            System.out.println("== Desea continuar con el juego? (S/N) ==");
            String decision=scan.next().toLowerCase();
            if("n".equals(decision)){
                continuar=false;
            }
            if(turno==1 && !ejercitosReino2.isEmpty()){
                turno=2;
            }else if(turno==2 && !ejercitosReino1.isEmpty()){
                turno=1;
            }
        }
        System.out.println("FIN DEL JUEGO...");
    }
    public static String elegirReino() {
        Scanner scan=new Scanner(System.in);
        int opcion;
        String reino="";
        while(true){
            System.out.println("===== MENU DE ELECCION =====");
            System.out.println("1. Inglaterra");
            System.out.println("2. Francia");
            System.out.println("3. Castilla-Aragon");
            System.out.println("4. Moros");
            System.out.println("5. Sacro Imperio Romano-Germanico");
            System.out.println("Seleccione el numero del Reino que desea: ");
            opcion=scan.nextInt();          
            switch(opcion){
                case 1: 
                    reino="Inglat";
                    break;
                case 2: 
                    reino="Francia";
                    break;
                case 3:
                    reino="Castilla";
                    break;
                case 4:
                    reino="Moros";
                    break;
                case 5: 
                    reino="SacroIm"; 
                    break;
                default: 
                    System.out.println("La opcion ingresada no es valida, intente otra vez");
                    continue;
            }
            break;
        }
        return reino;
    }
    public static String reino(String inicial) {
        String reino="";
        switch(inicial){
            case "I": 
                reino="Inglaterra"; 
                break;
            case "F":
                reino="Francia";
            break;
            case "C":
                reino="Castilla-Aragon";
                break;
            case "M": 
                reino="Moros"; 
                break;
            case "S": 
                reino="Sacro Impero Romano-Germanico"; 
                break;
            default: 
                break;
        }
        return reino;
    }
    public static List<Ejercito> crearEjercitos(String identificadorReino) {
        int cantidadEjercitos=1;
        System.out.println("El numero de ejercitos en el Reino "+identificadorReino+" es: "+cantidadEjercitos);
        List<Ejercito> ejercitos=new ArrayList<>();
        for(int i=0;i<cantidadEjercitos;i++){
            int cantidadSoldados=(int)(Math.random()*10)+1;
            Ejercito ejercito=new Ejercito(cantidadSoldados, "Ej"+i+identificadorReino, identificadorReino);
            ejercitos.add(ejercito);
            System.out.println("Detalles del "+ejercito.getNombreEjercito()+":");
            ejercito.generarEjercito(cantidadSoldados, new Soldado[10][10], identificadorReino); 
            ejercito.mostrarSoldados();  
            System.out.println();
        }
        return ejercitos;
    }
}

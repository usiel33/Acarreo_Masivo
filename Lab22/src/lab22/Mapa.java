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
public class Mapa {
    private String[][] tablero;
    private List<Ejercito> ejercitosReino1;
    private List<Ejercito> ejercitosReino2;
    private String territorio;

    public Mapa(List<Ejercito> ejercitosReino1, List<Ejercito> ejercitosReino2) {
        this.ejercitosReino1 = ejercitosReino1;
        this.ejercitosReino2 = ejercitosReino2;
        tablero = new String[10][10];
        this.territorio = territorio();
        llenarTablero();
    }

    private String territorio() {
        String[] territorios={"bosque", "campo abierto", "montania", "desierto", "playa"};
        return territorios[new Random().nextInt(territorios.length)];
    }
    public void llenarTablero() {
        Random random=new Random();
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                tablero[i][j]=null;
            }
        }
        for(Ejercito ejercito : ejercitosReino1){
            for(Soldado soldado : ejercito.getSoldados()){
                int fila, columna;
                do {
                    fila=random.nextInt(10);
                    columna=random.nextInt(10);
                } while (tablero[fila][columna]!=null);
                tablero[fila][columna]=soldado.getNombre()+"-"+soldado.getNivelVida();
            }
        }
        for(Ejercito ejercito : ejercitosReino2){
            for(Soldado soldado : ejercito.getSoldados()){
                int fila, columna;
                do{
                    fila=random.nextInt(10);
                    columna=random.nextInt(10);
                } while (tablero[fila][columna]!=null);
                tablero[fila][columna]=soldado.getNombre()+"-"+soldado.getNivelVida();
            }
        }
    }
    public String getTerritorio(){
        return territorio;
        
    }

    public void bonusTerritorio() {

        System.out.println("Aplicando bonus de territorio...");
        for(Ejercito ejercito : ejercitosReino1){
            System.out.println("Verificando beneficio para el reino: "+ejercito.getNombreReino());
            if(beneficiadoTerritorio(ejercito.getNombreReino())) {
                ejercito.aumentarVidaSoldados();
                System.out.println("El reino "+ejercito.getNombreReino()+" ha recibido un bonus de vida.");
            }else{
                System.out.println("No hay beneficio para el reino: "+ejercito.getNombreReino());
            }
            ejercito.mostrarSoldadosActualizados();
            for (Soldado soldado : ejercito.getSoldados()) {
                actualizarTablero(ejercito, soldado);
            }
        }
        for(Ejercito ejercito : ejercitosReino2) {
            System.out.println("Verificando beneficio para el reino: "+ejercito.getNombreReino());
            if(beneficiadoTerritorio(ejercito.getNombreReino())) {
                ejercito.aumentarVidaSoldados();
                System.out.println("El reino " + ejercito.getNombreReino()+" ha recibido un bonus de vida.");
            }else{
                System.out.println("No hay beneficio para el reino: "+ejercito.getNombreReino());
            }
            ejercito.mostrarSoldadosActualizados();
            for (Soldado soldado : ejercito.getSoldados()) {
                actualizarTablero(ejercito, soldado); 
            }
        }
        System.out.println("Estado del tablero despues del bonus:");
        mostrarTablero();
    }

    private boolean beneficiadoTerritorio(String nombreReino) {
        switch (nombreReino) {
            case "Inglat":
                return "bosque".equals(territorio);
            case "Francia":
                return "campo abierto".equals(territorio);
            case "Castilla":
                return "montania".equals(territorio);
            case "Moros":
                return "desierto".equals(territorio);
            case "SacroIm":
                return "bosque".equals(territorio) || "playa".equals(territorio) || "campo abierto".equals(territorio);
            default:
                return false;
        }
    }

    public void actualizarTablero(Ejercito ejercito, Soldado soldado) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++) {
                if(tablero[i][j]!=null) {
                    String[] partes=tablero[i][j].split("-");
                    if(partes.length>0 && partes[0].equals(soldado.getNombre())){
                        tablero[i][j]=soldado.getNombre()+"-"+soldado.getNivelVida();
                        return; 
                    }
                }
            }
        }
    }
    public String mostrarTablero() {
    String tabla = "";
    tabla += "    ";
    String letrasCol = "             A                           B                        C                "
            + "        D                          E             "
            + "           F                        G                         H                        I       "
            + "                    J";
    tabla += letrasCol;
    tabla += "\n    ";
    
    for (int j = 0; j < 10; j++) {
        tabla += "--------------------------";
    }
    tabla += "-\n";
    
    for (int i = 0; i < 10; i++) {
        tabla += String.format(" %2d |", i + 1);
        for (int j = 0; j < 10; j++) {
            String contenidoCelda = (tablero[i][j] == null) ? "" : tablero[i][j];
            tabla += String.format("%-25s|", contenidoCelda);
        }
        tabla += "\n    ";
        for (int j = 0; j < 10; j++) {
            tabla += "--------------------------";
        }
        tabla += "-\n";
    }

    return tabla;
}

    public boolean movimiento(List<Ejercito> ejercitoActivo, List<Ejercito> ejercitoOponente) {
        Scanner scan=new Scanner(System.in);
        boolean movValido=false;
        while(!movValido){
            String info="Ingrese la posicion del soldado a mover:";
            System.out.println("Ingrese la posicion del soldado a mover:");
            System.out.print("Fila: ");
            int fila=scan.nextInt()-1;
            System.out.print("Columna: ");
            int columna=scan.nextInt()-1;
            if(fila<0 || fila>=10 || columna<0 || columna>=10){
                System.out.println("Posicion fuera del rango, intente otra vez.");
                continue;
            }
            String soldadoInfo=tablero[fila][columna];
            if(soldadoInfo==null){
                System.out.println("No hay ningun soldado en esta posicion, intente otra vez");
                continue;
            }
            String nombreSoldado=soldadoInfo.split("-")[0];
            if(!perteneceAEjercitoActivo(nombreSoldado, ejercitoActivo)) {
                System.out.println("El soldado no pertenece a su ejercito, intente otra vez");
                continue;
            }
            System.out.println("Ingrese la direccion a la que desea mover al soldado (arriba, abajo, izquierda, derecha):");
            String mover=scan.next().toLowerCase();
            int nuevaFila=fila;
            int nuevaColumna=columna;
            switch (mover) {
                case "arriba":
                    nuevaFila--;
                    break;
                case "abajo":
                    nuevaFila++;
                    break;
                case "izquierda":
                    nuevaColumna--;
                    break;
                case "derecha":
                    nuevaColumna++;
                    break;
                default:
                    System.out.println("Movimiento invalido, intente otra vez.");
                    continue;
            }
            if(nuevaFila<0 || nuevaFila>=10 || nuevaColumna<0 || nuevaColumna>=10) {
                System.out.println("Movimiento fuera del rango, intente otra vez");
                continue;
            }
            String soldadoRival=tablero[nuevaFila][nuevaColumna];
            if(soldadoRival!=null && !perteneceAEjercitoActivo(soldadoRival.split("-")[0], ejercitoActivo)) {
                System.out.println("Los soldados de ejercitos rivales se encuentran en la misma casilla");
                batalla(fila, columna, nuevaFila, nuevaColumna, ejercitoActivo, ejercitoOponente);
            }else{
                tablero[nuevaFila][nuevaColumna]=tablero[fila][columna];
                tablero[fila][columna]=null;
            }
            movValido=true;
        }
        return true;
    }
    private boolean perteneceAEjercitoActivo(String nombreSoldado, List<Ejercito> ejercitoActivo) {
        for (Ejercito ejercito : ejercitoActivo) {
            for (Soldado soldado : ejercito.getSoldados()) {
                if (soldado.getNombre().equals(nombreSoldado)) {
                    return true;
                }
            }
        }
        return false;
    }
    private void batalla(int fila1, int col1, int fila2, int col2, List<Ejercito> ejercitoActivo, List<Ejercito> ejercitoOponente) {
        String soldado1Info=tablero[fila1][col1];
        String soldado2Info=tablero[fila2][col2];
        String nombre1=soldado1Info.split("-")[0];
        String nombre2=soldado2Info.split("-")[0];
        int vida1=Integer.parseInt(soldado1Info.split("-")[1]);
        int vida2=Integer.parseInt(soldado2Info.split("-")[1]);
        String clase1=obtenerClase(nombre1);
        String clase2=obtenerClase(nombre2);
        if(clase1.equals("Caballero") && clase2.equals("Arquero")) {
            vida1+=esCaballeroEspecial(nombre1) ? 2 : 1;
        }else if(clase1.equals("Caballero") && clase2.equals("Lancero")) {
            vida2++;
        }else if(clase1.equals("Arquero") && clase2.equals("Lancero")) {
            vida1++;
        }else if(clase1.equals("Caballero") && clase2.equals("Espadachin")) {
            vida1++;
        }else if(clase1.equals("Espadachin") && clase2.equals("Lancero")) {
            vida1+=esEspadachinEspecial(nombre1) ? 3 : 1;
        }else if(clase1.equals("Espadachin") && clase2.equals("Espadachin Especial")) {
            vida2++;
        }else if (clase1.equals("Caballero") && clase2.equals("Caballero Especial")) {
            vida2++;
        }
        double totalVida=vida1+vida2;
        double probabilidad1=(vida1/totalVida)*100;
        double probabilidad2=(vida2/totalVida)*100;
        System.out.println("Probabilidades de victoria:");
        System.out.println(nombre1+": "+String.format("%.2f", probabilidad1)+"%");
        System.out.println(nombre2+": "+String.format("%.2f", probabilidad2)+"%");
        Random random=new Random();
        double resultado=random.nextDouble()*100;
        String ganador=(resultado<probabilidad1) ? nombre1 : nombre2;
        System.out.println(ganador+" ha ganado la batalla");
        if(ganador.equals(nombre1)){
            tablero[fila2][col2]=nombre1+"-"+(vida1+1);
        }else{
            tablero[fila2][col2]=nombre2+"-"+(vida2+1); 
        }
        tablero[fila1][col1]=null; 
    }
    private String obtenerClase(String nombre) {
        if(nombre.contains("Caballero Especial")) {
            return "Caballero Especial";
        }else if(nombre.contains("Caballero")) {
            return "Caballero";
        }else if(nombre.contains("Arquero")) {
            return "Arquero";
        }else if(nombre.contains("Lancero")) {
            return "Lancero";
        }else if(nombre.contains("Espadachin Especial")) {
            return "Espadachin Especial";
        }else if(nombre.contains("Espadachin")) {
            return "Espadachin";
        }
        return "";
    }
    private boolean esEspadachinEspecial(String nombre){
        return nombre.contains("Espadachin Especial");
    }
    private boolean esCaballeroEspecial(String nombre){
        return nombre.contains("Caballero Especial");
    }
}





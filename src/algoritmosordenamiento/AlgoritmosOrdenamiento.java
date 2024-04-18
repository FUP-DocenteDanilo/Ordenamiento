package algoritmosordenamiento;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgoritmosOrdenamiento {
    
    private static ArrayList<Atleta> atletas = new ArrayList();
    static Scanner lec= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribir el numero de tiempos a Ingresa :");
        int input=lec.nextInt();
        for(int i=0; i< input;i++){
            System.out.println("Digite el Tiempo del Atleta numero: "+i+1);
            double tiempoAtleta=lec.nextDouble();
            registrarTiempos(tiempoAtleta);  
        }
        System.out.println("Listado de los Tiempos");
        mostrarTiempos();
        
        int option=0;
        do {
            System.out.println("1. Ordenar por Selección");
            System.out.println("2. Ordenar por Inserción");
            System.out.println("3. Ordenar Burbuja");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opción");
            option=lec.nextInt();
            switch (option) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción No Valida");
                    break;
            }
            
        } while (option!=4);
        
    }
    
    public static void registrarTiempos(double tiempo){
        Atleta nuevoTiempo = new Atleta(tiempo);
        atletas.add(nuevoTiempo);
    
    }
    
    public static void mostrarTiempos(){
        for(Atleta a: atletas){
            System.out.println(a.getTiempo());
        }
        
    
    }
    
    
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;
import java.util.Scanner; // Importa la libreria Scanner
/**
 *
 * @author anyelo
 */
public class ExamenFinal {
    static void problema1(){
            Scanner Scn = new Scanner(System.in);
            System.out.println("Comparación de dos números.");
            System.out.print("Ingrese el primer número: ");
            int numero1 = Scn.nextInt();
            System.out.println("Ingrese el segundo número: ");
            int numero2 = Scn.nextInt();
            if(numero1 < numero2){
                System.out.println("Número mayor: "+ numero2 
                        +"\nNúmero menor: "+numero1);
            }else{
                System.out.println("Número mayor: "+ numero1 
                        +"\nNúmero menor: "+numero2);
            }
        }
    
    static void problema2(){
            System.out.println("Funciona? 2");
            
            Scanner Scn = new Scanner(System.in);
            System.out.println("Creación de piramides");
            while(true){
                System.out.println("Ingrese un número impar: ");
                int numero = Scn.nextInt();
//              Validación si es par o impar
                if(numero % 2 == 0){
                    System.out.println("El número ingresado no es impar.");
                }else{
                    int columnas = numero;
                    int filas = 0;
//                  Cuenta las filas requeridas
                    while(numero >= 1){
                        numero = numero - 2;
                        filas++;
                    }
                    // Empieza desde arriba
                    for(int i = filas;i >= 1; i--){
                        // LLena los espacios por cada fila completa
                        for(int espacio = 1; espacio <= filas - i; espacio++){
                            System.out.print(" ");
                        }
                        // Imprime un asterisco en la parte izquierda
                        for(int j = i; j <= 2 * i - 1; ++j){
                            System.out.print("*");
                        }
                        // La parte de la derecha de la piramide
                        for(int k = 0; k < i - 1; k++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    break;
                }
            }
            
        }
    static void problema3(){
            System.out.println("Funciona? 3");
        }

    public static void main(String[] args) {
        System.out.println("1. Problema 1\n"
                + "2. Problema 2\n"
                + "3. Problema 3\n"
                + "4. Salir");
        Scanner Scn = new Scanner(System.in);
        int menu = Scn.nextInt();
        
//      Menu
        switch(menu){
        case 1:
            System.out.println("Se ingresó al problema 1");
            problema1();
            break;
        case 2:
            System.out.println("Se ingresó al problema 2");
            problema2();
            break;
        case 3:
            System.out.println("Se ingresó al problema 3");
            problema3();
            break;
        case 4:
            System.out.println("Se salio del programa");
            System.exit(0);
        default:
            System.out.println("Seleccione una opcion válida");
    }
    }
    
}

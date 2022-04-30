
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
            System.out.println("Funciona?");
        }
    static void problema2(){
            System.out.println("Funciona? 2");
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

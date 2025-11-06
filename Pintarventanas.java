
package pintarventanas;

import java.util.Scanner;

public class Pintarventanas {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean si = false;
        int opc = 0;
        char relleno = ' ';
        
        do {
            pintarMenu();
            do {
                opc = sc.nextInt();
            } while (opc < 1 || opc > 5);
            switch (opc) {
                case 1: ventanaVacia();
                break;
                case 2: 
                    relleno = 'o';
                    izquierda(relleno);
                    break;
                case 3:
                    relleno = '-';
                    izquierda(relleno);
                    break;
                case 4:
                    relleno = 'o';
                    derecha(relleno);
                    break;
                case 5:
                    relleno = '-';
                    derecha(relleno);
                    
            }
            si = seguirJugando();
        } while (si);
    }
        
    public static void pintarMenu(){
            System.out.println(" PINTAR VENTANAS");
            System.out.println("=======================");
            System.out.println("1. Pintar ventana vacia.");
            System.out.println("2. Pintar ventana izquierda con 'o'");
            System.out.println("3. Pintar ventana izquierda con '-'");
            System.out.println("4. Pintar ventana derecha con 'o'");
            System.out.println("5. Pintar ventana derecha con '-'");
            System.out.println("Elija una opción (1, 2, 3, 4 o 5)");
    }
    
    public static boolean seguirJugando(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres seguir jugando? (1. si / 2. no)");
        boolean si = false;
        int seguir = 0;
        do{
          seguir = sc.nextInt();
        } while (seguir != 1 && seguir != 2);
        if (seguir == 1){
            si = true;
        }
        else {
            si = false;
        }
        return si;
    }
    
    public static void ventana(char relleno, int lado){
        for (int i = 0; i<9; i++){
            for (int j = 0; j<22; j++){
                if (i == 0 || i == 8){
                    System.out.print("*");
                }
                else if (j == 0 || j == 7 || j == 14 || j == 21){
                    System.out.print("*");
                }
                else{
                    if(lado == 0){
                        if(j>0 && j<7){
                            System.out.print(relleno);
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    else{
                        if (j>14 && j<21){
                            System.out.print(relleno);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                
            }
            System.out.println("");
        }
    }
    
    public static void ventanaVacia(){
      ventana(' ', 0);  
    }
    
    public static void izquierda(char relleno){
      ventana(relleno, 0);
    }
    
    public static void derecha(char relleno){
        ventana(relleno, 1);
    }
}

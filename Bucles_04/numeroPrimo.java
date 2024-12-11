package ED_04.Bucles_04;
import java.util.Scanner;
/*
 * Pide al usuario un numero y determina si es primo o no. Usa un 
 * bucle for para verificar si tiene divisiones
 */
public class numeroPrimo {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in); 

        int num=0; 
        boolean esPrimo=true; 

        System.out.println("Dime un numero: ");
        num=Scanner.nextInt(); 
        
        
        // Si el número es menor o igual a 1, no es primo
        if (num<=1) {
            esPrimo=false;
        }else{
            // Comprobamos si hay divisores entre 2 y num-1
            for(int i=2; i<num; i++){
                if (num% i==0) {
                    esPrimo=false;
                }
            }
        }


        // Imprimimos el resultado
        if (esPrimo) {
            System.out.println("El número " + num + " es primo.");
        } else {
            System.out.println("El número " + num + " no es primo.");
        }

        Scanner.close();
    }
}

package ED_04.Bucles_04;
import java.util.Scanner;
/*
 * Pide al usuario un numero y genera su tabla de multiplicar del 
 * 1 al 10 usando un bucle
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 

        int num; 
        int resultado; 

        System.out.println("Dime un numero y te muestro la tabla de multiplicar: ");
        num=Scanner.nextInt(); 

        for(int i=1; i<=10; i++){
            resultado=(num*i); 
            System.out.println(num+"x "+i+" ="+resultado);
        }
        Scanner.close();
    }
}

package ED_04.Bucles_04;
import java.util.Scanner;
/*
 * Solicita un numero entero al usario y calcula la suma de sus digitos usando un 
 * bucle while
 */

public class sumarDigitos {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in); 

        int num; 
        int suma=0; 

        System.out.println("Dime un numero y te los voy a ir sumando: ");
        num=Scanner.nextInt(); 

        while (num>0) {
            System.out.println("Dime otro numero: ");
            num=Scanner.nextInt(); 
            suma+=num;
            System.out.println("La suma de los numeros es: "+suma);
            
        }
        Scanner.close();
    }
}

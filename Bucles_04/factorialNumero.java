package ED_04.Bucles_04;
import java.util.Scanner;
/*
 * Implementa un programa que calcule el factorial de un numero entero positivo
 * dado por el usuario. Utiliza un bucle for
 */
public class factorialNumero {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);

        int num; 
        int resultado=0; 

        System.out.println("Dime un numero: ");
        num=Scanner.nextInt(); 

        for(int i=0; i<=num; i++){
            resultado+=i; 
        }
        
        System.out.println("El factorial de "+num+ "es: "+resultado);

        Scanner.close();
    }
}

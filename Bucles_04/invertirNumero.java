package ED_04.Bucles_04;
import java.util.Scanner;
/*
 * Escribe un programa que invierta un numero dado por el usuario 
 * utilizando un bucle
 */
public class invertirNumero {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner (System.in); 

        int num; 
        int numeroInvertido=0; 

        System.out.println("Dime un numero: ");
        num=Scanner.nextInt();

        while (num!=0) {
            int digito=num%10; //obtine el ultimo digito
            numeroInvertido=numeroInvertido*10+digito;//añade el digito invertido
            num/=10;//elimina el ultimo digito
        }
        System.out.println("El numero invertido es: "+numeroInvertido);
        Scanner.close();
        
    }
}

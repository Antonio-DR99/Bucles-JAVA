package ED_04.Bucles_04;
/*
 * Crea un programa que imprima todos los numeros pares entre el 
 * 1 y 20 usando bucles while
 */
public class numerosPares {
    public static void main(String[] args) {

        int num=0; 

        while (num<=20) {
            num++; 
            if (num%2==0) {
                System.out.println("El numero "+num+" es par");
                
            }else{
                System.out.println("El numero "+num+" es impar");
            }
        }
    }
}

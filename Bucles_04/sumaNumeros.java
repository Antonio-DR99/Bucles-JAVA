package ED_04.Bucles_04;
/*
 * Escribe un programa que calcule e imprima la suma de todos los nuemeros
 * del 1 al 100 utilizadno un bucle
 */
public class sumaNumeros {
    public static void main(String[] args) {
        
        int suma=0; 

        for (int i=0; i<101; i++){
            suma+=i; 
        }
        System.out.println("La suma total es: "+suma);
    }
}

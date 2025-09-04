package arreglo;
import java.util.Scanner;
 
public class Arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Pedir al usuario que ingrese los números
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe un numero: ");
            numeros[i] = sc.nextInt();
        }
            // Imprimir una sola separación después de ingresar todos los números
            System.out.println();

        // Encontrar y mostrar los números duplicados
        for (int i = 0; i < numeros.length; i++) {
            // Si el número ya ha sido contado, continuar con el siguiente
            if (numeros[i] == Integer.MIN_VALUE) {
                continue;
            }
            int repeticion = 1;

            // Buscar duplicados en el resto del array

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    repeticion++;
                    // Marcar el número como contado para evitar contar duplicados
                    numeros[j] = Integer.MIN_VALUE;
                }
            }
            
            // Mostrar el número y la cantidad de veces que se repite
            if (repeticion > 1) {
                System.out.println("El numero " + numeros[i] + " se repite " + repeticion + " veces.");
            }
        }
    }
}
import java.util.Scanner;

public class NumerosMayoresQuePromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int suma = 0;
        int contador = 0;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
            suma += arreglo[i];
        }
        
        double promedio = (double) suma / n;
        
        for (int i = 0; i < n; i++) {
            if (arreglo[i] > promedio) {
                contador++;
            }
        }
        
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
        System.out.println("La cantidad de números mayores que el promedio es: " + contador);
    }
}

import java.util.Scanner;

public class PromedioArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double suma = 0, promedio;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
            suma += arreglo[i];
        }
        
        promedio = suma / n;
        
        System.out.println("El promedio de los elementos del arreglo es: " + promedio);
    }
}

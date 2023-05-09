import java.util.Scanner;

public class MaximoMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int maximo, minimo;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }
        
        maximo = arreglo[0];
        minimo = arreglo[0];
        
        for (int i = 1; i < n; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        
        System.out.println("El valor máximo del arreglo es: " + maximo);
        System.out.println("El valor mínimo del arreglo es: " + minimo);
    }
}

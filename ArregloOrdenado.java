import java.util.Scanner;

public class ArregloOrdenado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean ordenado = true;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n - 1; i++) {
            if (arreglo[i] > arreglo[i + 1]) {
                ordenado = false;
                break;
            }
        }
        
        if (ordenado) {
            System.out.println("El arreglo está ordenado en orden ascendente");
        } else {
            System.out.println("El arreglo no está ordenado en orden ascendente");
        }
    }
}

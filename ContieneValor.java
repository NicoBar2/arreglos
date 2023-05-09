import java.util.Scanner;

public class ContieneValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean contiene = false;
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        n = sc.nextInt();
        
        int[] arreglo = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = sc.nextInt();
        }
        
        System.out.print("Ingrese el valor que desea buscar en el arreglo: ");
        int valor = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (arreglo[i] == valor) {
                contiene = true;
                break;
            }
        }
        
        if (contiene) {
            System.out.println("El arreglo contiene el valor " + valor);
        } else {
            System.out.println("El arreglo no contiene el valor " + valor);
        }
    }
}


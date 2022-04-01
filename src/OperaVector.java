import java.util.Random;
import java.util.Scanner;

/**
 * Clase que opera con vectores, crea su contenido a través de números aleatórios los imprime
 * calcula el promedio y calcula su máximo y mínimo
 */

public class OperaVector {
    public static void main(String[] args) {
        int[] numeros = generaNumeros();
        imprimeNumeros("Numeros del sorteo ", numeros);
        //Promedio
        System.out.println("Promedio: "+ promedio(numeros));
        //Maximo
        System.out.println("Máximo: "+ maximo(numeros));
        //Minimo
        System.out.println("Mínimo: "+ minimo(numeros));

    }

    /**
     * Método que crea el vector completa los datos con numeros aleatórios entre 0 y 100
     * @return vector creado
     */

    public static int[] generaNumeros() {
        Random alea = new Random();
        Scanner tec = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números: ");
        int n = tec.nextInt();
        int[] num = new int[n];
        for (int i=0; i< num.length; i++) {
            num[i] = alea.nextInt(100);
        }
        return num;
    }

    /**
     * <h1>Método que imprime los número contenidos en el vector</h1>
     * @param mesg mensaje
     * @param nume vector
     */

    public static void imprimeNumeros(String mesg, int[] nume) {
        System.out.println(mesg);
        for(int i=0; i<nume.length; i++) {
            System.out.print(nume[i] + " ");
        }
        System.out.println();
    }

    /**
     * <h1>Método que calcula el promedio de los números que están dentro del vector</h1>
     * @param nums vector
     * @return el promedio
     */

    public static int promedio(int[] nums) {
        int acumula = 0;
        for (int i=0; i<nums.length; i++) {
            acumula +=  nums[i];
        }
        int promedio = acumula / nums.length;
        return promedio;
    }

    /**
     * Método que cálcula el máximo valor que tiene el vector
     * @param nums vector
     * @return máximo
     */

    public static int maximo(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i< nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    /**
     * <h1>Método que cálcula el valor mínimo del vector pasado</h1>
     * @param nums vector donde vamos a buscar el valor mínimo
     * @return el valor mínimo que contiene el vector
     */

    public static int minimo(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i=0; i< nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }
}

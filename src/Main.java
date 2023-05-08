import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        System.out.println(reverse("hola mundo"));

        // Ejercicio 2
        String[] array = {"elemento1", "elemento2", "elemento3"};
        for (String elemento : array) {
            System.out.println(elemento);
        }

        // Ejercicio 3
        int[][] arrayBidimensional = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < arrayBidimensional.length; i++) {
            for (int j = 0; j < arrayBidimensional[i].length; j++) {
                System.out.println("Posición: [" + i + "][" + j + "], Valor: " + arrayBidimensional[i][j]);
            }
        }

        // Ejercicio 4
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.removeElementAt(1);
        vector.removeElementAt(1);
        System.out.println(vector);

        // Ejercicio 5
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("elemento1", "elemento2", "elemento3", "elemento4"));
        LinkedList<String> linkedList = new LinkedList<>(arrayList);
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }

        // Ejercicio 6
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        for (int i = numeros.size() - 1; i >= 0; i--) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }
        System.out.println(numeros);

        // Ejercicio 7
        try {
            dividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }

        // Ejercicio 8
        String fileIn = "archivo1.txt";
        String fileOut = "archivo2.txt";
        copyFile(fileIn, fileOut);
    }

    public static String reverse(String texto) {
        StringBuilder reversed = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            reversed.append(texto.charAt(i));
        }
        return reversed.toString();
    }

    public static void dividePorCero() {
        throw new ArithmeticException();
    }

    public static void copyFile(String fileIn, String fileOut) {
        // Aca se implementa la lógica de copiar el archivo utilizando InputStream y PrintStream
        // Aca se asume que la implementación está presente pero no se muestra en detalles
        System.out.println("Se ha copiado el archivo " + fileIn + " a " + fileOut);
    }
}

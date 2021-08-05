import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 
 * @author Estefanía
 * 
 */

public class Main2 {
    public static void main(String[] args) throws IOException {
        
        //Ejercicio: tomo 1 número y veo si es par o impar.
        
        System.out.println("Ingrese el número: ");
        Double numero = Double.valueOf(cargarNumero());
        Boolean esPar = (numero % 2) == 0;
        if (esPar) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        
        // Preguntar por tres números y ver cuál de todos es el mayor.
        
        System.out.println("Ingrese el primer número:");
        Integer numero1 = cargarNumero(); 
        
        System.out.println("Ingrese el segundo número:");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer número:");
        Integer numero3 = cargarNumero();
        
        calcularNumeroMayor(numero1, numero2, numero3); 
        promedio(numero1, numero2, numero3);
        //llamo a la función de abajo que cree con el private static void
    }
    
    private static Integer cargarNumero() throws IOException {
        // me devuelve un numero que se ingresa con el input
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    
    /**
     * Esta función sirve para mostrar el cálculo de un número mayor.
     * @param numero1 Es el primer número.
     * @param numero2 Es el segundo número.
     * @param numero3 Es el tercer número.
     * 
     * Si paso con Ctrl por la función, me muestra la descripción de los parámetros y la fucnción
     */
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
        // void en el private significa que no devuelve nada
        Integer numeroMayor = numero1;
        
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El número mayor es " + numeroMayor);
    }
    
    //Ejercicio: tomo 3 números y saco el promedio de ellos.
    
    private static void promedio(Integer numero1, Integer numero2, Integer numero3) {
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El número promedio es: " + numeroPromedio);
    }
    
}

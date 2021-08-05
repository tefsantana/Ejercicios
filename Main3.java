/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estefanía
 */
public class Main3 {
    
    public static void main(String[] args) throws IOException {
        String resultado = ""; //resultado final que muestra todos los números primos.
        
        int contador = 0;
        int numero = 1;
        while(contador < 100) {
            if (esPrimo(numero)) {
                resultado += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println("Los primeros 100 números primos son: " + resultado);
    }
    
    private static Boolean esPrimo(Integer numero) {
        // Mostrar todos los números primos del 1 al 100.
        Boolean esUnNumeroPrimo = true;
        
        for(int i = 2; i < numero; i++) {
            //empieza en 2 porque 2 es número primo, entonces no pasa la condición (i < numero)
            if (numero % i == 0) {
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
      
    }
}

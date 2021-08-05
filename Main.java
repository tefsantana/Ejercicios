
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        String nombre = "Estefanía";
        Integer followersInstagram = 2000;
        Integer followersYoutube = 1000;
        String frase = "Hola, mi nombre es " + nombre + ". Tengo " + followersInstagram + followersYoutube + " followers.";
        System.out.println(frase);
        String frase2 = "Hola, mi nombre es " + nombre + ". Tengo " + (followersInstagram + followersYoutube) + " followers.";
        System.out.println(frase2);
        
        // Integer edad = 18;
        // Boolean esMayorDeEdad = edad >= 18;
        
        // if(esMayorDeEdad) {
           // System.out.println("Es mayor de edad");
        // } else {
           // System.out.println("Es menor de edad");
        // }
        
        // Para hacer un input, hago lo siguiente:
        // InputStreamReader capturarTeclado = new InputStreamReader(System.in); 
            //pongo el nombre de variable "capturarTeclado porque se puede capturar datos con micrófono, cámara, etc
        // BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        // System.out.println("Ingrese su nombre:");
        // String nombre2 = buffer.readLine(); // pongo nombre2 porque ya use nombre
        // System.out.println("Hola " + nombre2);
        
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        
        System.out.println("Ingrese su edad:");
        String strEdad = buffer.readLine();
        Integer edad = Integer.parseInt(strEdad); 
        //convierte texto a número
        
        if(edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estefanía Santana
 */
public class Calificaciones {
    public static void main(String[] args) {
        /* Debes pedirle 3 calificaciones al usuario. 
        Sacarás el promedio de las calificaciones y verificaremos si el promedio es mayor a 6. 
        En caso de ser así, el programa deberá lanzar un mensaje explicando nuestro status académico.
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la primera calificación: ");
        float calificacion1 = sc.nextInt();
        
        System.out.println("Escribe la segunda calificación: ");
        float calificacion2 = sc.nextInt();
        
        System.out.println("Escribe la tercera calificación: ");
        float calificacion3 = sc.nextInt();
        
        float promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
                
        if (promedio >= 6) {
            System.out.println("Condición del alumno: APROBADO.");
        } else {
            System.out.println("Condición del alumno: DESAPROBADO.");
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Seba
 */

import java.util.Scanner;

/**
 *
 * @author Seba
 */
public class Main5 {
	// procedimientos
	public static void saludar() {
		System.out.println("Holaaaaaaa");
	}

	public static void bailar(String nombre) {
		System.out.println("Estoy bailando con " + nombre);
	}

	public static void informar(String apellido, int edad) {
		System.out.println("Tu apellido es " + apellido + " y tienes " + edad + " años de edad");
	}

	// funciones
	public static String cantar() {
		String cancion = """
                                 Que el mundo fue y ser\u00e1 una porquer\u00eda,\r
                                 ya lo s\u00e9\u2026\r
                                 \u00a1En el quinientos seis\r
                                 y en el dos mil tambi\u00e9n!\r
                                 Que siempre ha habido chorros""";
		return cancion;
	}

	public static int sumar(int a, int b) {
		System.out.println("La suma es");
		return a + b;
	}

	public static Scanner teclado = new Scanner(System.in);

	public static String solicitarUsuario() {
		System.out.println("Escribe tu usuario");
		String usuario = teclado.next();
		return usuario;
	}

	public static String solicitarClave() {
		System.out.println("Escribe tu clave");
		String clave = teclado.next();
		return clave;
	}

	public static void acceder(String usuario, String clave) {
		if (usuario.equals("admin") && clave.equals("a123"))
			System.out.println("Bienvenidos al sistema");
		else
			System.out.println("Datos incorrectos");
	}

	public static void main(String[] args) {
		String u = solicitarUsuario();
		String c = solicitarClave();
		acceder(u,c);
		
		saludar();
		bailar("Martin");
		String apellido = "Cabrera";
		informar(apellido, 16);
		System.out.println(cantar());
		System.out.println(sumar(50, 120));
        }
}

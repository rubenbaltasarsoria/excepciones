/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author widemos
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Excepción en tiempo de compilación
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
        } catch (IOException ex) {
            //Logger.getLogger(EjemploExcepciones.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }

        // Excepción en tiempo de ejecución: NumberFormatException.
        String texto = "A113";
        try {
            int numero = Integer.parseInt(texto);

            System.out.println("El número es: " + numero);
        } catch (NumberFormatException ex) {
            System.out.println("Introduce un numero");
        }

        // Excepción en tiempo de ejecución ArrayIndexOutOfBounds.
        try {
            double[] valores = {1.0, 2.0, 3.0};
            System.out.println("El valor que buscas es: " + valores[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: el acceso al array es incorrecto");
        }

        // Excepción en tiempo de ejecución NullPointerException.
        try {
            Random r = null;
            int aleatorio = r.nextInt(100);
            System.out.println("El valor aleatorio es: " + aleatorio);
        } catch (NullPointerException e) {
            System.out.println("El generador de numeros aleatorios no funciona.");
        }
        /*

         // Excepción "lanzada" por nuestro programa.
         throw new Exception("Ha habido un error y no podemos continuar...");
         */
    }

}

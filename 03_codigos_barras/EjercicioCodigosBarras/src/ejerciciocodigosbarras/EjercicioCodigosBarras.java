/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodigosbarras;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author widemos
 */
public class EjercicioCodigosBarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("INFO: Iniciando...");

        LectorCodigosBarras l = new LectorCodigosBarras();

        try {
            l.conectar();
            l.lectura();
            System.out.println(l.verCodigo());
            
        } catch (IOException  e) {
            System.err.println("Ha pasado algo...");
            System.err.println(e.getMessage());
        } catch (CodigoNoValido e) {
            System.err.println("El codigo leido no es correcto");
            System.err.println(e.getMessage());
        }finally {
            l.desconectar();
        }
         
        System.out.println("INFO: Terminando...");
    }

}

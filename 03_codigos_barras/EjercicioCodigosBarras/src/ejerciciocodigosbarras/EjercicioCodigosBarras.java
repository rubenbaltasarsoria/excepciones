/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodigosbarras;

import java.io.IOException;

/**
 *
 * @author widemos
 */
public class EjercicioCodigosBarras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, CodigoNoValido {

        System.out.println("INFO: Iniciando...");

        LectorCodigosBarras l = new LectorCodigosBarras();

        l.conectar();
        l.lectura();
        System.out.println(l.verCodigo());
        l.desconectar();

        System.out.println("INFO: Terminando...");
    }

}

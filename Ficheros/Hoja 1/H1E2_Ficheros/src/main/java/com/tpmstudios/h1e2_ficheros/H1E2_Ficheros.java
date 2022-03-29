package com.tpmstudios.h1e2_ficheros;

import java.io.File;

/**
 *
 * @author usuario
 */
public class H1E2_Ficheros{
    public static void main(String[] Args){
        File f=new File("pom.xml");
        System.out.println("Nombre: "+f.getName());
        System.out.println("Ruta: "+f.getPath());
        System.out.println("Ruta Absoluta: "+f.getAbsolutePath());
        System.out.println("Lectura: "+f.canRead());
        System.out.println("Escritura: "+f.canWrite());
    }
}

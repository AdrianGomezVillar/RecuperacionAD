package com.tpmstudios.h1e1_ficheros;

import java.io.File;

/**
 *
 * @author usuario
 */
public class H1E1_Ficheros{
    public static void main(String[] Args){
        File f=new File(Args[0]);
        if (f.isDirectory())
        {
            String[] files=f.list();
            for (int i = 0; i < files.length; i++)
            {
                System.out.println("- "+files[i]);
            }
        }
    }
}

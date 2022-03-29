package com.tpmstudios.futbolistas;

import java.time.LocalDate;
import java.util.Locale;

/**
 *
 * @author usuario
 */
public class Futbolista {
    private int id;
    private String nombre;
    private String apellidos;
    private String alias;
    private String puesto;
    private float altura;
    private LocalDate fechaNacimiento;
    private String equipo;

    public Futbolista(int id, String nombre, String apellidos, String alias, String puesto, float altura, LocalDate fechaNacimiento, String equipo)
    {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
        this.puesto = puesto;
        this.altura = altura;
        this.fechaNacimiento = fechaNacimiento;
        this.equipo = equipo;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public void setApellidos(String apellidos)
    {
        this.apellidos = apellidos;
    }

    public String getAlias()
    {
        return alias;
    }

    public void setAlias(String alias)
    {
        this.alias = alias;
    }

    public String getPuesto()
    {
        return puesto;
    }

    public void setPuesto(String puesto)
    {
        this.puesto = puesto;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public LocalDate getFechaNacimiento()
    {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento)
    {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEquipo()
    {
        return equipo;
    }

    public void setEquipo(String equipo)
    {
        this.equipo = equipo;
    }

    
    
    public String toCSV()
    {
        return String.format(Locale.ROOT, %d, %s, %s, %s, %s, %3.2f, %s, %s, %s,
                id, nombre, apellidos, alias, puesto, altura, fechaNacimiento, equipo);
    }
    
    
    
}

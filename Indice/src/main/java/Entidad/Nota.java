/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Acer
 */
public class Nota {
    
    private int count;
    private String nombre;
    private Double nota;
    private Double credito;

    public Nota() {
    }

    public Nota(int count, String nombre, Double nota, Double credito) {
        this.count = count;
        this.nombre = nombre;
        this.nota = nota;
        this.credito = credito;
    }
    

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }
    
    
    
}

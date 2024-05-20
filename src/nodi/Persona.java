/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodi;

import java.util.ArrayList;

/**
 *
 * @author iacop
 */
/**
 * La classe Persona rappresenta una persona con nome, cognome e codice fiscale.
 */
public class Persona 
{
    private String nome;

    /**
     * Costruisce un oggetto Persona con il nome, cognome e codice fiscale specificati.
     * 
     * @param nome Il nome della persona.
     */
    public Persona(String nome) {
        this.nome = nome;
    }
    
    public Persona(){
    }

    /**
     * Restituisce il nome della persona.
     * 
     * @return Il nome della persona.
     */
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome=nome;
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto Persona.
     * 
     * @return Una stringa che contiene il nome, cognome e codice fiscale della persona.
     */
    @Override
    public String toString()
    {
        String s="\nNome: "+this.getNome();
        return s;
    }
}

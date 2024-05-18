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
    private String cognome;
    private String cf;

    /**
     * Costruisce un oggetto Persona con il nome, cognome e codice fiscale specificati.
     * 
     * @param nome Il nome della persona.
     * @param cognome Il cognome della persona.
     * @param cf Il codice fiscale della persona.
     */
    public Persona(String nome, String cognome, String cf) {
        this.nome = nome;
        this.cognome = cognome;
        this.cf = cf;
    }

    /**
     * Restituisce il nome della persona.
     * 
     * @return Il nome della persona.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Restituisce il cognome della persona.
     * 
     * @return Il cognome della persona.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Restituisce il codice fiscale della persona.
     * 
     * @return Il codice fiscale della persona.
     */
    public String getCf() {
        return cf;
    }
    
    /**
     * Restituisce una stringa che rappresenta l'oggetto Persona.
     * 
     * @return Una stringa che contiene il nome, cognome e codice fiscale della persona.
     */
    @Override
    public String toString()
    {
        String s="\nNome: "+this.getNome()+" Cognome: "+this.getCognome()+" CF: "+this.getCf();
        return s;
    }
}

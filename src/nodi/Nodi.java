/*
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt per cambiare questa licenza
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java per modificare questo modello
 */
package nodi;

/**
 * Questa è la classe principale del programma.
 */
public class Nodi {

    /**
     * Il metodo main è il punto di ingresso del programma.
     * @param args gli argomenti passati da linea di comando
     */
    public static void main(String[] args) 
    {
        // Creazione di alcuni nodi con valori interi
        Nodo<Integer> n = new Nodo<Integer>(9);
        Nodo<Integer> n2 = new Nodo<Integer>(2);
        Nodo<Integer> n3 = new Nodo<Integer>(4);
        Nodo<Integer> n4 = new Nodo<Integer>(3);
        
        // Creazione di una lista e aggiunta dei nodi
        Lista<Integer> lista = new Lista<Integer>();
        lista.add(n);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        
        // Stampa del numero di nodi nella lista
        System.out.println("\nNumero di nodi: " + lista.size());
        
        // Verifica se la lista è vuota
        System.out.println("\nVuota? " + lista.isEmpty());
        
        // Iterazione sulla lista e stampa dei valori dei nodi
        System.out.println("\nvalori lista:\n");
        Nodo<Integer> punt = lista.getTesta();
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("\n" + punt.getValore());
            punt = punt.getNext();
        }
        System.out.println("\nrimuoviamo il nodo 2");
        // Rimozione di un nodo dalla lista
        System.out.println(lista.remove(2));

        System.out.println("\nvalori lista:\n");
        // Iterazione sulla lista dopo la rimozione
        punt = lista.getTesta();
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("\n" + punt.getValore());
            punt = punt.getNext();
        }
        
        System.out.println("\ninseriamo un nuovo nodo all'inizio della lista");
        // Creazione di un nuovo nodo e inserimento in testa alla lista
        Nodo<Integer> n6 = new Nodo<Integer>(22); 
        lista.push(n6);

        System.out.println("\nvalori lista:\n");
        // Iterazione sulla lista dopo l'inserimento
        punt = lista.getTesta();
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("\n" + punt.getValore());
            punt = punt.getNext();
        }

        System.out.println("\ninseriamo un nuovo nodo persona in posizione 2");
        //inserimanto nodo di tipo persona
        lista.addPersona(2,"fabio");
        
        System.out.println("\nvalori lista:\n");
        // Iterazione sulla lista dopo l'inserimento
        punt = lista.getTesta();
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println("\n" + punt.getValore());
            punt = punt.getNext();
        }
    }
}

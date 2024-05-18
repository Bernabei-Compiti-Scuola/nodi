/*
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt per cambiare questa licenza
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java per modificare questo modello
 */
package nodi;

/**
 * Questa classe rappresenta una lista generica.
 * @param <T> il tipo di dato contenuto nella lista
 */
public class Lista <T> implements Cloneable
{
    Nodo <T> testa; // Il nodo di testa della lista

    /**
     * Costruttore di default che inizializza la lista con testa null.
     */
    public Lista() 
    {
        testa=null;
    }
    
    /**
     * Costruttore che inizializza la lista con un nodo specificato.
     * @param n il nodo di testa della lista
     */
    public Lista(Nodo n) 
    {
        testa=n;
    }

    /**
     * Restituisce il nodo di testa della lista.
     * @return il nodo di testa
     */
    public Nodo<T> getTesta() {
        return testa;
    }
    
    /**
     * Aggiunge un nodo alla fine della lista.
     * @param n il nodo da aggiungere
     */
    public void add(Nodo <T> n) 
    {
        if(testa==null)
        {
            testa=n;
            return;
        }
        else
        {
            Nodo attuale=testa;
            while(attuale.getNext()!=null)
                attuale=attuale.getNext();

            attuale.setNext(n);
        }
    }
    
    /**
     * Aggiunge un valore alla fine della lista creando un nuovo nodo.
     * @param v il valore da aggiungere
     */
    public void add(T v)
    {
        Nodo <T> n=new Nodo(v);
        this.add(n);
        
    }
    
    /**
     * Restituisce la dimensione della lista.
     * @return la dimensione della lista
     */
    public int size()
    {
        int n=0;
        n++;
        Nodo attuale=testa;
        if(testa==null)
        {
            return 0;
        }
        else
        {
            while(attuale.getNext()!=null)
            {
                n++;
                attuale=attuale.getNext();
            }
        }
        return n;   
    }

    /**
     * Verifica se la lista è vuota.
     * @return true se la lista è vuota, false altrimenti
     */
    public boolean isEmpty()
    {
        if(testa==null)
            return true;
        else
            return false;
    }
    
    /**
     * Verifica se la lista contiene un valore specificato.
     * @param v il valore da cercare
     * @return true se la lista contiene il valore, false altrimenti
     */
    public boolean contains(T v)
    {
        Nodo attuale=testa;
        while(attuale!=null)
        {
            if(attuale.getValore().equals(v))
                return true;
            attuale=attuale.getNext();
        }
        return false;
    }
    
    /**
     * Rimuove un elemento dalla lista in base all'indice specificato.
     * @param i l'indice dell'elemento da rimuovere
     * @return true se l'elemento è stato rimosso con successo, false altrimenti
     */
    public boolean remove(int i)
    {
        if(i>this.size() ||i<0)
            return false;
        else if(i==0)
            testa=testa.getNext();
        else
        {
            Nodo attuale=testa;
            int cont=0;
            while(cont<i-1)
            {
                attuale=attuale.getNext();
                cont++;
            }
            attuale.setNext(attuale.getNext().getNext());  
        }
        return true;
    }
    
    /**
     * Inserisce un nodo all'inizio della lista.
     * @param n il nodo da inserire
     */
    public void push(Nodo <T> n)
    {
        n.setNext(testa);
        testa=n;
    }
    
    /**
     * Restituisce una rappresentazione in stringa della lista.
     * @return la rappresentazione in stringa della lista
     */
    @Override
    public String toString()
    {
        String s="";
        Nodo<T>punt=testa;
        while(punt!=null)
        {
            s=s+punt.toString();
        }
        return s;
    }
    
    /**
     * Restituisce una sottolista che contiene tutti gli elementi dalla testa fino al primo elemento con valore specificato.
     * @param val il valore da cercare
     * @return la sottolista contenente gli elementi fino al valore specificato
     * @throws CloneNotSupportedException se la clonazione del nodo fallisce
     */
    public Lista<T> sottolista(T val) throws CloneNotSupportedException
    {
        Lista<T> nuovalista=new Lista();
        if(testa==null)
            return nuovalista;
        else
        {
            Nodo <T> punt=testa;
            while(punt!=null&&punt.getValore().equals(val)==false)
                punt=punt.getNext();
            if(punt!=null)
                nuovalista.add(punt.clone());
            return nuovalista;
        }
        
    }
    
    /**
     * Imposta il valore di un elemento nella lista in base all'indice specificato.
     * @param i l'indice dell'elemento da modificare
     * @param v il nuovo valore da assegnare
     * @return true se l'elemento è stato modificato con successo, false altrimenti
     */
    public boolean setVal(int i, T v)
    {
        if(testa==null)
            return false;
        else if(i>this.size() || i<0)
            return false;
        else
        {
            Nodo attuale=testa;
            int cont=0;
            while(cont<i-1)
            {
                attuale=attuale.getNext();
                cont++;
            }
            attuale.getNext().setValore(v);
            return true;
        }
    }
}

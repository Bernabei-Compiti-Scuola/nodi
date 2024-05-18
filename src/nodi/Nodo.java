/*
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt per cambiare questa licenza
 * Clicca su nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java per modificare questo modello
 */
package nodi;

/**
 * Questa classe rappresenta un nodo generico in una lista concatenata.
 * @param <T> il tipo di dato del valore del nodo
 */
public class Nodo <T> implements Cloneable
{
    T valore; // Il valore del nodo
    Nodo next; // Il riferimento al nodo successivo

    /**
     * Costruttore della classe Nodo.
     * @param valore il valore del nodo
     */
    public Nodo(T valore) {
        this.valore = valore;
        this.next = null;
    }

    /**
     * Imposta il valore del nodo.
     * @param valore il valore da impostare
     */
    public void setValore(T valore) {
        this.valore = valore;
    }

    /**
     * Restituisce il valore del nodo.
     * @return il valore del nodo
     */
    public T getValore() {
        return valore;
    }
    
    /**
     * Restituisce il riferimento al nodo successivo.
     * @return il riferimento al nodo successivo
     */
    public Nodo getNext() {
        return next;
    }

    /**
     * Imposta il riferimento al nodo successivo.
     * @param next il riferimento al nodo successivo
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    
    /**
     * Restituisce una rappresentazione in formato stringa del nodo.
     * @return la rappresentazione in formato stringa del nodo
     */
    @Override
    public String toString()
    {
        return valore.toString();
    }
    
    /**
     * Crea una copia del nodo.
     * @return la copia del nodo
     * @throws CloneNotSupportedException se la clonazione non è supportata
     */
    @Override
    public Nodo <T> clone() throws CloneNotSupportedException
    {
        Nodo<T> c=(Nodo<T>) super.clone();
        if(next!=null)
            c.next=this.next.clone();
        return c;
    }
}

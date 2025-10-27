

package raymundoquintanilla_06102025;
public class Nodo 
{
    //valor almacenado en el nodo     
    int valor; 
    
    //referencia al siguiente nodo    
    Nodo siguiente; 

    //constructor
    public Nodo(int valor) 
    {
        this.valor = valor;
        this.siguiente = null;
    }
}
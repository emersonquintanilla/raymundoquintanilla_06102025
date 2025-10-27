

package raymundoquintanilla_06102025;

public class ListaEnlazada 
{
    //referencia a la cabeza/inicio de la lista
    private Nodo cabeza;     
    public ListaEnlazada() 
    {
        //lista vacia inicialmente
        this.cabeza = null; 
    }    
    
    //metodo para agregar al principio
    public void AgregarAlInicio(int valor)    
    {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;        
    }    
    
    //metodo para agregar al final
    public void AgregarAlFinal(int valor) 
    {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null)
        {           
            cabeza = nuevo;
            return;
        }             
        {
            Nodo temporal = cabeza;
            while (temporal.siguiente != null) 
            {
                temporal = temporal.siguiente; 
            }
            temporal.siguiente = nuevo; 
        }      
    }   

    //metodo para eliminar un valor
    public void Eliminar(int valor) 
    {
        if (cabeza == null) 
        {
        System.out.println("Lista vacia");
        return;
        }
        if (cabeza.valor == valor) 
        {
        cabeza = cabeza.siguiente;        
        return;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null && actual.siguiente.valor != valor) 
        {
            actual = actual.siguiente;
        }
        
        if (actual.siguiente == null) 
        {            
            System.out.println("Valor no encontrado en la lista.");
        } 
        else 
        {
            actual.siguiente = actual.siguiente.siguiente;            
        }
    }
    
        //metodo para imprimir todos los valores
        public void MostrarLista() 
    {
        if (cabeza == null) 
        {
        System.out.println("Lista vacia.");
        return;
        }
        Nodo actual = cabeza;
        System.out.print("lista enlazada: ");
        while (actual != null) 
        {
        System.out.print(actual.valor + " -> ");
        actual = actual.siguiente;
        }
        System.out.println("null");
    }
}

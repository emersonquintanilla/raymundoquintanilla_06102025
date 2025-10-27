

package raymundoquintanilla_06102025;

public class Main 
{
    public static void main(String[] args) 
    {        
        //crear obejeto de la lista
        ListaEnlazada Lista = new ListaEnlazada();        
               
        //valores agregados y enlazandolos usando punteros/referencias        
        Lista.AgregarAlFinal(10);
        Lista.AgregarAlFinal(20);
        Lista.AgregarAlFinal(30);        
        Lista.MostrarLista();        
        
        //agregar al inicio/cabeza
        Lista.AgregarAlInicio(5);
        Lista.MostrarLista();         
        
        //elimincion de un valor
        Lista.Eliminar(20);
        Lista.MostrarLista();        
        
        //eliminacion de un valor inexistente
        Lista.Eliminar(100);        
    }
}

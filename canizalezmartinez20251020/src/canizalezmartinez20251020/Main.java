/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canizalezmartinez20251020;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila mipila = new Pila(5);
        //SE VERIFICA SI LA PILA ESTA VACIA
        System.out.println("La pila esta vacia?" +mipila.estaVacia());//devolvera true o false
        System.out.println();
        
        System.out.println("Agregando valores con metod push");
        mipila.push(10); //AGREGANDO EL VALOR 10
        mipila.push(20);//AGREGANDO EL VALOR 20
        mipila.push(30);//AGREGANDO EL VALOR 30
       mipila.push(40);//AGREGANDO EL VALOR 40
       mipila.push(50);//AGREGANDO EL VALOR 50
       
        System.out.println();
        mipila.mostrar();
        System.out.println("tamaño actual de la pila"+mipila.tamano()+"elementos");
        System.out.println();
        
        System.out.println("agregar elemento nuevo con la pila llena");
        mipila.push(60);
        System.out.println();
        
        System.out.println("verificacion del ultimo valor agregado");
        System.out.println("el elemento de la cima "+mipila.peek());
        System.out.println();
        
        System.out.println("extraer valores de la pila");
        System.out.println("se ha extraido el valor de: "+mipila.pop());//se extrae el ultmo de la pila
          System.out.println("se ha extraido el valor de: "+mipila.pop());// nuevamente se extrae el ultio de la pila
          System.out.println();
          
          System.out.println("mostrando valores de la pila");
          System.out.println();
          System.out.println("tamaño actual de la pila"+mipila.tamano()+"elementos");
          System.out.println();
          
          // se recorren los valores de la pila
          while(mipila.estaVacia()){
              System.out.println("se ha extraido el valor de: "+mipila.pop());
              
          }
           System.out.println();//salto de linea
           
           mipila.pop();
        System.out.println();
        System.out.println("verificacion del ultimo valor agregado");
        System.out.println("el elemento de la cima "+mipila.peek());
        System.out.println();
        
    }
    
}

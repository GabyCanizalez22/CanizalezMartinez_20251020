/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canizalezmartinez20251020;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int [] elementos;
    private int cima;
    private int capacidad;
    //METODO CONTRUCTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    // SE CREARA EN MEMORIA UN OBJETO CON LOS ATRIBUTOS QUE ESTAS
    //DENTRO DE ESTE CONSTRUCTOR
    
    public Pila(int tamano){
        
        this.capacidad = tamano;// CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR EN LA PILA
        this.elementos = new int[this.capacidad];// SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1;//EL VALOR POR DEFECTO DE LA CIMA ES -1 VACIA
    }
    
    //METODO PARA VERIFICAR SU LA PILA ESTA VACIA, ES DECIR, SI NO HAY ELEMENTOS
    //O VALORES APLIADOS
    public boolean estaVacia(){
        //EL VALOR DE LA CIMA ES -1 POR LO TANTO, LA PILA ESTA VACIA
        if(this.cima == -1){
        return true;
        //EL VALOR DE LA CIMA ES UN NUMERO DIFERENTE DE -1 POR LO TANTO 
        //LA PILA SI TIENE AL MENOS UN VALOR O UN ELEMENTO
    }else{
            return false;
        }
    }
    //METODO  PARA VERIFICAR SI LA PÍLA ESTA LLENA, DE ESTA MANERA TOMAR LA DECISION 
    //DE NO SEGUIR ALIMENTANDO LA PILA
    public boolean estaLlena(){
        if (this.cima == this.capacidad - 1) {
            //EL VALOR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
        }else{
            //EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
            return false;
        }
        
     
    }
    //DEVUELVE EL VALOR DE LA CIMA, ES DECIR EL VALOR EL ULTIMO ELEMENTO
    //QUE FUW INSERTADO AL ARREGLO
      public int tamano(){
           return this.cima + 1;
       }
      //METODO PARA AGREGAR ELEMENTO AL ARREGLO, ES DECIR A LA PILA
      //PRIMERO SE DEBE REALIZAR LA VERIFICACION DEL TAMAÑO DE LA PILA
      //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO
      public void push(int elemento){
          
          //PRIMERO SE VERIFICA SI LA PILA ESTA LLENA
          if(estaLlena()){
              System.out.println("la pila esta llena, no puede agregar el valor: "+elemento);
              //return;
          }else{
              this.cima++;//SE INCREMENTA EL VALOR DE LA CIMA
              this.elementos[this.cima] = elemento;//SE AGREGA EL NUEVO ELEMENTO AL ARREGLO(A LA PILA)
              System.out.println("EL VALOR:"+elemento+" fue agregado  a la pila");
          }
      }
      //METODO PARA VERIFICAR UN ELEMENTO DE LA PILA(EL ULTIMO QUE HA SIDO INSERTADO AL ARREGLO)
      public int pop(){
          //SE VERIFICA QUE LA PILA NO ESTE VACIA PARA PODER EXTRAER UN ELEMENTO
          if (estaVacia()) {
              System.out.println("la pila esta vacia, no puede hacer la extraccion del elemento");
              //NO SE REALIZA NINGUNA ACCION
              return -1;
          }else{
              //SI HAY ELEMENTOS QUE EXTRAER POR LO TANTO SE CREA UNA NUEVA VARIABLE
              //QUE ALMNACENARA EL VALOR QUE SERA EXTRAIDO
              int elementoExtraido = this.elementos[this.cima];//LA NUEVA VARIABLE POSEE EL VALOR DEL ULTIMO ELEMENTO INSEERTADO AL ARREGLO
              this.cima --;//SE REDUCE EL VALOR DE LA CIMA DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO
              return elementoExtraido;//SE DEVUELVE AL USUARIO EL VALOR QUE FUE EXTRAIDO
          }
      }
      //METODO PARA VERIFICAR EL ULTIMO VALOR INSERTADO ES DECIR VER EL VALOR QUE SE PUEDE
      //EXTRAER DE LA PILA
      public int peek(){
          //SE VERIFICA SI ESTA VACIA
          if (estaVacia()) {
              //SI ESTA VACIA POR LO TANTO MUESTRA MENSAJE AL USUARIO
              System.out.println("La pila esta vacia");
              //NO SE REALIZA NINGUNA ACCION
              return -1;
          }else{
              //SE DEVUELVE AL USUARIO EL ULTIMO ELEMENTO QUE FUE INSERTADO
              return this.elementos[this.cima];
          }
          

      }
      
      //METODO PARA IMPRIMIR LOS VALORES QUE POSEE UNA PILA ES DECIR
      //IMPRIMIR TODOS LOS VALORES DEL ARREGLO DESDE EL ULTIMO QUE FUE
      //AGREGADO HASTA EL PRIMERO(EN ORDEN)
 public void mostrar(){
     //SE VERIFICA QUE NO ESTE VACIA
              if (estaVacia()) {
                  //SI ESTA VACIA  POR LO TANTO NO SE REALIZA NADA
                  System.out.println("la pila esta vacia");
              }else{
                  //SE IMPRIME UNA SALIDA AL USUARIO
                  System.out.print("contendio de la pila (desde la cima hasta la base de la pila)");
                   //SE IMPRIME UNA ESTRUCTURA CON CORCHETE
                  System.out.print("[");
                  // SE DEBE REOCORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
                  //EN LA ESTRUCTURA ITERATIVA SE INICIA DESDE EL VALOR DE LA CIMAES DECIR
                  //DESDE LA ULTIMA POSICION AGREGADA AL ARREGLO MIENTRAS EL VALOR DE I SEA
                  //MAYOR QUE CER0(ES DECIR QUE AUN NO HA LLEGADO A LA BASE DE LA PILA) EL VALOR
                  //DE I ESTARA EN DECREMENTO HASTA LLEGAR A CERO
                  for (int i = this.cima; i>=0; i--) {
                       //SE IMPRIMER CADA VALOR EN SU POSICION CORRESPONDIENTE DE MANERA CONTINUA(SIN SALTOS DE LINEA)
                      System.out.println(this.elementos[i]);
                     
                      System.out.print(", ");//SE IMPRIME UNA COMA
                  }
              }
              //SE CIERRA LA ESTUCTURA DE CORCHETE PARA LA SALIDA
              System.out.println("]");
          }
}

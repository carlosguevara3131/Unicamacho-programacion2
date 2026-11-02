
//la herencia: va hedar (atriburos, metodos y subclases), instrucciones que puden hacer que una clase principal sea la base para 
//poder contruir otras subclases, es decir que una clase principal puede heredar los atributos y metodos de otra clase,
//para poder reutilizar el codigo y no tener que escribirlo de nuevo, ademas de que se puede modificar el comportamiento 
//de los metodos heredados, esto se conoce como polimorfismo.

//ejemplo del bus, carro y taxi. vamos a tener la Clase Vahuculo que sera la superclase y de esta clase heredaran 
//las clases Bus, Carro y Taxi, que seran las subclases. (herdandos los atributos y metodos de la clase Vehiculo).


//Clase padre - Super Clase
public class Vehiculo {
   
    //atributos privados, para acceder a ellos se necesitan los constructores.(para el ejemplo los vamos a dejar publicos)
    public String placa;
    public int modelo;
    public double potencia;
    
    //constructores

    //constructor 1: pide todos los atributos de la clase Vehiculo (3 atributos - 3 parametros).
    public Vehiculo(String placa, int modelo, double potencia) {
        this.placa = placa;
        this.modelo = modelo;
        this.potencia = potencia;
    }




    //metodos
    //vamos agregas por ahora solo los Getters.
    
    public String getPlaca() {
        return placa;
    }
    public int getModelo() {
        return modelo;
    }
    public double getPotencia() {
        return potencia;
    }


        








        
}

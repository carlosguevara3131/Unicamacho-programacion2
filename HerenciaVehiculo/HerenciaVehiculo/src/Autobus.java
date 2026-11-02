

public class Autobus extends Vehiculo {
    
    //atributo -general. privado, para acceder a ellos se necesitan los constructores.
    public int numeroPlaza;

    //constructor

    //Modificador de acceso, nombre de la clase, (parametros separados por comas).
    
     public Autobus(String placa, int modelo, double potencia, int numeroPlaza) {
        //super -> le pasa al padre los atributos la placa, modelo y potencia.
        super(placa, modelo, potencia);

        this.numeroPlaza = numeroPlaza;
    }

    //adicionamos a la clase Autobus los Getters y Setters para el atributo numeroPlaza.
     
    public int getNumeroPlaza() {   //para opterner el numero de plaza.
         return numeroPlaza;
    }

    public void setNumeroPlaza(int numeroPlaza) { //para modificar el numero de plaza.
         this.numeroPlaza = numeroPlaza;
    }
    
  
     



}



//clase hija que va a heredar de la clase padre Vehiculo, es decir que va a heredar los atributos 
//y metodos de la clase padre Vehiculo.

// clase hija - Sub Clase
public class Taxi extends Vehiculo {
    
    //atributo -general. privado, para acceder a ellos se necesitan los constructores.
    private String numeroLicencia;

    //constructor

    //Modificador de acceso, nombre de la clase, (parametros separados por comas).
    
     public Taxi(String placa, int modelo, double potencia, String numeroLicencia) {
        //super -> le pasa al padre los atributos la placa, modelo y potencia.
        super(placa, modelo, potencia);

        this.numeroLicencia = numeroLicencia;
    }


    //metodos getters y setters
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    
      
   

}

public class Main {
    
    public static void main(String[] args) {
        
        //Un objeto de la super clase Vehiculo.
        Vehiculo v1 = new Vehiculo("XYZ789", 2018, 1600); //este objeto no se necesitaria.

        //atributos son publicos, son accesibles desde cualquier otra clase y modificar.
        //v1.modelo = 2020;
        //v1.placa = "ABC123";   ya no necesitariamos este paso ya que hemos creado un constructor.
        //v1.potencia = 150.5;       
        
        //cuando tenemos atributos privados lo que hacemos es definir o crear constructores.
        
        //Un onjeto de la subclase o clase hija Taxi.
        Taxi t1 = new Taxi("XYZ789", 2018, 1600, "LIC-2340");
        //t1.numeroLicencia = "";

        //vamos a crear un objeto de tipo autobus.
        //Un objeto de la subclase o clase hija Autobus.
        Autobus a1 = new Autobus("KSU456", 2020, 2000, 40);
        
        //hasta este punto termina la explicacion de la docente.

    }

}

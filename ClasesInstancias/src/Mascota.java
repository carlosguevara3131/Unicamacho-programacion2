public class Mascota {

    //atributos de la clase
    String nombre;
    String raza;
    String color;
    int edad;
    double peso;
    String tipoMascota;

    //constructor vacío, es creado para poder crear objetos de la clase Mascota sin necesidad de pasarle parámetros
    public Mascota() {
    }

    //metodo con retorno (int, double, String, boolean, otras clases)
    public void comer() {
        System.out.println("...Comiendo...");
    }

    //metodo sin retorno void
    public void hacerSonidos() {
        System.out.println(" ....... Haciendo sonidos... Miaauuuu");
    }

    //el toString() es un metodo que nos permite mostrar los atributos de la clase
    @Override
    public String toString() {
        return "Mascota [nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", edad=" + edad + ", peso=" + peso
                + ", tipoMascota=" + tipoMascota + "]";
    }    

    

}
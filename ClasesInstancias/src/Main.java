import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //vamos a definir el orden de las funciones, como su fuera un orquestador, que va primero etc
        //vamos a usar to.string para imprimir los datos de la mascota

        Scanner sc = new Scanner(System.in);

        //vamos a crear nuestro propio objeto
        //Nombre de la clase + nombre del objeto = new + nombre de la clase();
        
        //objeto 1
        Mascota mascota01 = new Mascota();

        mascota01.nombre = " Firulais";
        mascota01.raza = " Labrador";
        mascota01.color = " Marrón";
        mascota01.edad = 3;
        mascota01.peso = 25.5;
        mascota01.tipoMascota = " Perro";

        mascota01.comer();
        System.out.println(mascota01.toString());
        
        //objeto 2
        Mascota mascota02 = new Mascota();

        mascota02.nombre = " Michi";
        mascota02.raza = " Siames";
        mascota02.color = " Blanco y negro";
        mascota02.edad = 2;
        mascota02.peso = 16.5;
        mascota02.tipoMascota = " gato";

        mascota02.hacerSonidos();
        System.out.println(mascota02.toString());
        
        
    }
}
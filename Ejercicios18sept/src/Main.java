import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicios de bucles y while clase");

        Scanner scan = new Scanner(System.in); //uso el scanner para leer datos de entrada

        System.out.println("Adivina mi color favorito: "); //declaramos la variable bandera y le asignamos el valor que el usuario ingrese
        String bandera = scan.nextLine(); //leemos la entrada del usuario
        while(!bandera.equals("azul")){

            //si el valor ingresado no es azul, se le pedira al usuario que vuelva a intentarlo    
            System.out.println("Ese no es... vuelve a intentarlo");
            System.out.println("Adivina mi color favorito:");
            bandera = scan.nextLine();
        }
        System.out.println("Muy bien...");  //si el valor ingresado es azul, se le dara la bienvenida al usuario
        
    }
}
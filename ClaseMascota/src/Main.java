import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
        
        //objeto 1
        Mascota mascota1 = new Mascota();
        //nombre_Clase   nombre_objeto = new nombre_Clase();

        mascota1.nombre = "Firulais";
        mascota1.raza = "Labrador";
        mascota1.color = "Marron";
        mascota1.edad = 5;
        mascota1.peso = 20.5;
    
        //primer instrucion de la mascota1
        mascota1.hacerDanos();

        //objeto 2
        Mascota mascota2 = new Mascota();
        mascota2.nombre = "Max";
        mascota2.raza = "Golden Retriever";
        mascota2.color = "Blanco";
        mascota2.edad = 3;
        mascota2.peso = 25.0;

        //primer instrucion de la mascota2
        mascota2.dormir();







    
    }

}

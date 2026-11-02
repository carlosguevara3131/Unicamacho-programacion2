
import java.util.Scanner; //importamos la clase scanner para poder leer datos desde la consola

public class EjercicioB1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de radicado a validar: "); //mensaje para el usuario
        long radicadoInicial = scanner.nextLong(); //lee el número de radicado ingresado por el usuario

        //control para evitar números negativos
        if (radicadoInicial < 0) {
            System.out.println("El número de radicado debe ser un entero positivo.");
            scanner.close(); //cerramos el scanner para liberar recursos
            return; //el return detiene la ejecución del programa si el número es negativo
        }

        // Variables para el análisis del radicado
        long aux = radicadoInicial; //variable auxiliar para manipular el radicado sin perder el valor original 
        int cantidadDigitos = 0; //variable para contar la cantidad de dígitos del radicado
        int sumaDigitos = 0; //variable para acumular la suma de los dígitos del radicado
        int digitoMayor = 0; //variable para almacenar el dígito mayor encontrado en el radicado
        long numeroInvertido = 0; //variable para construir el número invertido a partir del radicado
        int contador = 0; //variable para contar las iteraciones del ciclo

        //ciclo para darle manejo especial si el radicado ingresado es exactamente 0
        if (radicadoInicial == 0) {
            cantidadDigitos = 1; //el número 0 tiene un dígito
            sumaDigitos = 0;  //la suma de los dígitos de 0 es 0
            digitoMayor = 0; //el dígito mayor en 0 es 0
            numeroInvertido = 0; //el número invertido de 0 es 0
        } else {
            
             //CONDICIÓN DE PARADA DEL CICLO: (aux > 0)
             //El ciclo se detiene cuando la variable 'aux' llega a 0, lo que indica
             //que se han extraído y procesado todos los dígitos del número.
             //VARIABLE QUE LA MODIFICA: 'aux' mediante la división entera (aux = aux / 10).
             
            while (aux > 0) {  //aux es la variable que se va a ir reduciendo hasta llegar a 0, lo que indica que se han procesado todos los dígitos del radicado
                int digito = (int) (aux % 10); //para extrae el último dígito

                cantidadDigitos++;            //contador de dígitos
                sumaDigitos += digito;          //acumulador de suma

                if (digito > digitoMayor) {     //determinación del dígito mayor
                    digitoMayor = digito;
                }

                numeroInvertido = (numeroInvertido * 10) + digito; //construcción del número invertido capicua

                aux = aux / 10; //reducción del número para extraer el siguiente dígito en la próxima iteración
                contador++; //incremento del contador de iteraciones
            }
        }

        //evaluamos la condición capicua
        boolean esCapicua = (radicadoInicial == numeroInvertido);

        // --- MENSAJES DE SALIDA ---
        System.out.println("\n--- INFORME DE VALIDACIÓN DE RADICADO ---");
        System.out.println("Radicado ingresado: " + radicadoInicial);
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        System.out.println("Suma de dígitos: " + sumaDigitos);
        System.out.println("Dígito mayor: " + digitoMayor);
        System.out.println("¿Es radicado de prueba (Capicúa)?: " + (esCapicua ? "SÍ" : "NO"));
        System.out.println("Cantidad de iteraciones: " + contador);

        scanner.close();
    }
}
    

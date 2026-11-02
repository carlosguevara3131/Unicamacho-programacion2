public class EjercicioB2 {

    public static void main(String[] args) {
        //datos de prueba ficticios para auditoría "el 11111 está duplicado en los índices 0 y 3"
        long[] padronBeneficiarios = {
    100001L, // Posición 0
    200002L, // Posición 1
    300003L, // Posición 2
    400004L, // Posición 3
    100001L, // Posición 4  duplicado con la posición 0
    500005L, // Posición 5
    600006L, // Posición 6
    700007L  // Posición 7
                };

        boolean duplicadoEncontrado = false; //bandera para indicar si se ha encontrado un documento duplicado
        long docDuplicado = 0; //variable para almacenar el documento duplicado encontrado
        int posPrimera = -1; //variable para almacenar la posición del primer documento duplicado encontrado
        int posSegunda = -1; //variable para almacenar la posición del segundo documento duplicado encontrado

        int i = 0;
        
    //CONDICIÓN DE PARADA DEL CICLO EXTERNO: (i < documentos.length - 1 && !duplicadoEncontrado)
    //el ciclo finaliza al recorrer hasta el penultimo elemento O cuando la bandera
    //'duplicadoEncontrado' cambia a true (se detiene en la primera coincidencia).
    //VARIABLE QUE LA MODIFICA: i mediante incremento (i++) y la bandera 'duplicadoEncontrado'
         
        while (i < padronBeneficiarios.length - 1 && !duplicadoEncontrado) {
            
            int j = i + 1;
            
            //CONDICIÓN DE PARADA DEL CICLO INTERNO: (j < padronBeneficiarios.length && !duplicadoEncontrado)
            //avanza comparando el elemento i con los elementos posteriores hasta el final del
            //arreglo o hasta encontrar un duplicado.
            //VARIABLE QUE LA MODIFICA: j mediante incremento (j++) y la bandera 'duplicadoEncontrado'
        
            while (j < padronBeneficiarios.length && !duplicadoEncontrado) {
                if (padronBeneficiarios[i] == padronBeneficiarios[j]) {
                    duplicadoEncontrado = true;
                    docDuplicado = padronBeneficiarios[i];
                    posPrimera = i;
                    posSegunda = j;
                }
                j++; //incremento de j para avanzar en el ciclo interno
            }
            i++; //incremento de i para avanzar en el ciclo externo
        }

        // --- SALIDA DE INFORMACIÓN EN FORMATO TABLA ---
        System.out.println("==================================================");
        System.out.println("   INFORME DE AUDITORÍA DE PADRÓN DE BENEFICIARIOS");
        System.out.println("==================================================");

        if (duplicadoEncontrado) {
            System.out.printf("%-20s | %-12s | %-10s%n", "Documento Repetido", "Posición 1", "Posición 2");
            System.out.println("--------------------------------------------------");
            System.out.printf("%-20d | %-12d | %-10d%n", docDuplicado, posPrimera, posSegunda);
            System.out.println("--------------------------------------------------");
            System.out.println("ESTADO: ALERTA - Se detectó doble asignación de subsidio.");
        } else {
            System.out.println("ESTADO: OK - No se encontraron documentos duplicados.");
        }
    }
}

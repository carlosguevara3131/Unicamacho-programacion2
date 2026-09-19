public class Vectores {
    public static void main(String[] args) {

        //Declaracion de vectores


        int[] vector;
        float[] vectorNumeros;
        String[] vectorTexto;

        //Inicializar vectores numeros enteros

        vector = new int[5];

        vector[3]=5;
        vector[4]=10;

        //Vectores con texto

        vectorTexto = new String[9];
        vectorTexto[2] = "Hola";
        vectorTexto[3] = "Soy";
        vectorTexto[4] = "Carlos";

        for (int i = 0; i < vectorTexto.length; i++) {
            System.out.printf("vectorTexto[%s] = %s \n", i,vectorTexto[i]);
        }

    }
}

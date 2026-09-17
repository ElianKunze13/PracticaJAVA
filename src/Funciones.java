import java.util.List;

public class Funciones {

    /**
     * funcion para determinar si numero es capicua
     */
    //se define la funcion que recibe un numero entero
    public static boolean esCapicua(int numero) {
        //convierte el numero a cadena de caracteres y lo guarda en variable numStr
        String numStr = String.valueOf(numero);
        //invierte la cadena y la guarda en variable reversedStr
        String reversedStr = new StringBuilder(numStr).reverse().toString();

        //compara la cadena original con la invertida y devuelve true si son iguales, false en caso contrario
        if (numStr.equals(reversedStr)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * funcion para devolver lista sin numeros repetidos
     */
    public static List<Integer> eliminarRepetidos(List<Integer> listaOriginal) {

        //se crea una nueva lista para almacenar los elementos sin repetidos
        List<Integer> listaSinRepetidos = new java.util.ArrayList<>();

        //se recorre la lista original y se agregan los elementos a la nueva lista si no estan ya presentes
        for (Integer numero : listaOriginal) {
            if (!listaSinRepetidos.contains(numero)) {
                listaSinRepetidos.add(numero);
                if (numero == -1) {
                    listaSinRepetidos.remove(Integer.valueOf(-1));
                }
            }
        }
        //se devuelve la nueva lista sin repetidos
        return listaSinRepetidos;
    }

    public static String contarPalabra(String frase, String palabra) {
        //se convierte frase a minuscula para evitar errores y se separan con espacios
        String[] fraseMin = frase.toLowerCase().split(" ");

        //se convierte la palabra a minuscula
        String palabraMin = palabra.toLowerCase();

        //se crea contador para guardar cantidad de veces que palabra se repite
        int contador = 0;

        //se recore frase para contar cantidad de veces que palabra se repite
        for (String recorriendoLista : fraseMin){
            if (recorriendoLista.equals(palabraMin)){
                contador++;
            }
        }
        return "La palabra " + palabra + " apararece " + contador + " veces en la frase: ' " + frase + " ' ";
    }

}

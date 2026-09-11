//funcion para determinar si numero es capicua
public class FuncionCapicua {

//se define la funcion que recibe un numero entero
    public static boolean esCapicua(int numero) {
        //convierte el numero a cadena de caracteres y lo guarda en variable numStr
        String numStr = Integer.toString(numero);
        //invierte la cadena y la guarda en variable reversedStr
        String reversedStr = new StringBuilder(numStr).reverse().toString();
        //compara la cadena original con la invertida y devuelve true si son iguales, false en caso contrario
        if (numStr.equals(reversedStr)) {
            return true;
        } else {
            return false;
        }

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner respuesta = new Scanner(System.in);

        System.out.println("INGRESE NUMERO DE EJERCICIO QUE DESEA PROBAR");
        System.out.println("1 - Piramide de numeros ");
        System.out.println("2 - Numero capicua ");
        System.out.println("3 - Numero repetido en lista ");
        System.out.println("4 - Palabra repetida en frase ");


        String opcion = respuesta.nextLine();

        switch (opcion) {
            /*****************************************************************************************************************/

            case "1":
                System.out.println("EJERCICIO n1");
                /**
                 * Diseña un programa que pida al usuario un número entero positivo n y dibuje la siguiente
                 * figura (para n = 4):
                 text
                 1
                 2 3
                 4 5 6
                 7 8 9 10
                 Cada fila contiene un número más que la anterior, y los números se escriben en orden creciente.
                 *  El programa debe validar que n sea positivo; si no lo es, volverá a pedirlo.
                 * */
                Scanner dato = new Scanner(System.in);
                System.out.println("Ingrese un numero entero positivo");
                int num = dato.nextInt();

                while (num < 0) {
                    System.out.println("Por favor, ingrese un numero entero positivo MAYOR que 0");
                    num = dato.nextInt();
                }

                int numDos = num + 1;
                int numTres = numDos + 1;
                int numCuatro = numTres + 1;
                int numCinco = numCuatro + 1;
                int numSeis = numCinco + 1;
                int numSiete = numSeis + 1;
                int numOcho = numSiete + 1;
                int numNueve = numOcho + 1;
                int numDiez = numNueve + 1;

                System.out.println("Piramide de numero ingresado");
                System.out.println(num);
                System.out.println(numDos + " " + numTres);
                System.out.println(numCuatro + " " + numCinco + " " + numSeis);
                System.out.println(numSiete + " " + numOcho + " " + numNueve + " " + numDiez);

                break;
            /*****************************************************************************************************************/

            case "2":
                System.out.println("EJERCICIO n2");
                /**  Escribe una función 'static boolean esCapicua(int numero)' que devuelva true si el número
                 *  se lee igual de izquierda a derecha que de derecha a izquierda, y false en caso contrario.
                 *  La función debe funcionar para cualquier entero positivo (sin límite de cifras).
                 En el programa principal, pide números al usuario hasta que introduzca un 0, y para cada uno
                 muestra si es capicúa o no (usando la función).
                 */

                Scanner datoNuevo = new Scanner(System.in);
                //atributo para guardar numeros ingresados
                int numero = -1;

                //metodo loop para determinar si determinar si numero entero es capicua
                while (numero != 0) {

                    System.out.println("Ingrese nuevo numero entero positivo. " +
                            "Si desea finalizar programa, ingrese 0.");

                    numero = datoNuevo.nextInt();

                    if (numero == 0) {
                        System.out.println("Fin de programa");
                        break;
                    }

                    if (Funciones.esCapicua(numero)) {
                        System.out.println("El numero " + numero + " es capicua");
                    } else {
                        System.out.println("El numero " + numero + " no es capicua");
                    }
                }
                break;
            /*****************************************************************************************************************/

            case "3":
                System.out.println("EJERCICIO n3");
                /**
                 * Escribe un programa que pida al usuario una lista de números enteros positivos
                 * y los almacene en un array. A continuación, el programa debe mostrar 2 listas:
                 * lista original con todos los numeros introducidos, y otra
                 * lista igual pero eliminando los números duplicados(si existen y dejando solo una unica muestra de dichos numeros repetidos).
                 */

                List<Integer> numeroNuevo = new ArrayList<>();
                int valor;
                while (true) {
                    System.out.println("Ingrese un numero entero positivo." +
                            "Si desea finalizar programa, ingrese -1");
                    valor = respuesta.nextInt();
                    numeroNuevo.add(valor);

                    if (valor == -1) {
                        numeroNuevo.remove(Integer.valueOf(-1));
                    }

                    if (valor == -1) {
                        System.out.println("Fin de programa");
                        break;
                    }
                }
                System.out.println("Lista original: " + numeroNuevo);
                System.out.println("Lista sin repetidos: " + Funciones.eliminarRepetidos(numeroNuevo));
                break;

            /************************************************************************************************************/
            case "4":
                System.out.println("EJERCICIO n4");
                /** Implementa un programa que pida una frase y una palabra. Debe contar cuántas veces aparece la palabra en la frase,
                 *  sin distinguir mayúsculas/minúsculas y sin tener en cuenta signos de puntuación (puedes eliminar comas, puntos, etc.).
                 *  Escribe una función static int contarPalabra(String frase, String palabra) que realice el cálculo.
                 * */

                Scanner valorNuevo = new Scanner(System.in);
                System.out.println("Ingrese FRASE nueva ");
                String frase = valorNuevo.nextLine();

                System.out.println("Ingrese PALABRA nueva para revisar si esta repetida en frase ingresada");
                String palabra = valorNuevo.nextLine();

                System.out.println(Funciones.contarPalabra(frase, palabra));

                break;
            /*****************************************************************************************************************/
            case "-1":
                System.out.println("FIN DEL PROGRAMA");
                break;
            /*****************************************************************************************************************/

            default:
                System.out.println("Opcion no valida, ");
                break;
        }


    }
}
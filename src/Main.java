import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner respuesta = new Scanner(System.in);

        System.out.println("¿Desea probar ejercicio nº1? SI - NO");
        String opcion = respuesta.nextLine();

        if (opcion.equalsIgnoreCase("SI")) {
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

        } else{
            System.out.println("EJERCICIO n2");
            /**  Escribe una función 'static boolean esCapicua(int numero)' que devuelva true si el número
             *  se lee igual de izquierda a derecha que de derecha a izquierda, y false en caso contrario.
             *  La función debe funcionar para cualquier entero positivo (sin límite de cifras).
             En el programa principal, pide números al usuario hasta que introduzca un 0, y para cada uno
             muestra si es capicúa o no (usando la función).
             */

            Scanner dato = new Scanner(System.in);

            System.out.println("Ingrese un numero entero positivo. Si no desea agregar mas numeros a la lista," +
                    " ingrese 0 para continuar con el programa");
            int numNuevo = dato.nextInt();

            double numero = 0;
            numero = Double.parseDouble(String.valueOf(numNuevo));

            while (numNuevo != 0){
                System.out.println("Ingrese otro numero entero positivo. Si no desea agregar mas numeros a la lista," +
                        " ingrese 0 para continuar con el programa");

                numNuevo = dato.nextInt();
                numero = Double.parseDouble(String.valueOf(numNuevo));

                if (numNuevo == 0){
                    if (FuncionCapicua.esCapicua(numero)){
                        System.out.println("El numero " + numero + " es capicua");
                        break;
                    } else {
                        System.out.println("El numero " + numero + " no es capicua");
                        break;
                    }
                } else {
                    if (FuncionCapicua.esCapicua(numero)){
                        System.out.println("El numero " + numero + " es capicua");
                        break;
                    } else {
                        System.out.println("El numero " + numero + " no es capicua");
                        break;
                    }
            }
        }

            if (FuncionCapicua.esCapicua(numero)){
                System.out.println("El numero " + numero + " es capicua");
            } else {
                System.out.println("El numero " + numero + " no es capicua");
            }



    }
}
}
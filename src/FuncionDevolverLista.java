import java.util.List;

public class FuncionDevolverLista {

    public  static List<Integer> eliminarRepetidos(List<Integer> listaOriginal){

        //se crea una nueva lista para almacenar los elementos sin repetidos
        List<Integer> listaSinRepetidos = new java.util.ArrayList<>();

        //se recorre la lista original y se agregan los elementos a la nueva lista si no estan ya presentes
        for (Integer numero : listaOriginal) {
            if (!listaSinRepetidos.contains(numero)) {
                listaSinRepetidos.add(numero);
                if(numero == -1){
                    listaSinRepetidos.remove(Integer.valueOf(-1));
                }
            }
        }

        //se devuelve la nueva lista sin repetidos
        return listaSinRepetidos;
    }
}

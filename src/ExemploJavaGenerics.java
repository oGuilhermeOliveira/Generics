import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author guiol
 */
public class ExemploJavaGenerics {

    public static void main(String[] main) {
        List<String> list = new ArrayList();
        list.add("Steve Harris");
        list.add("1");
        imprimir(list);

        List<Long> listLong = new ArrayList();
        listLong.add(100L);
        listLong.add(200L);
        imprimir(listLong);

        String primeiroSt = pegarPrimeiroLista(list);
        System.out.println(primeiroSt);

        Long primeiroLong = pegarPrimeiroLista(listLong);
        System.out.println(primeiroLong);
    }

//    public static void imprimir(List<Object> list) {
//        for (String st : list) {
//            System.out.println(st);
//        }
//    }

    public static <T> void imprimir(List<T> lista) {
        for (T st : lista) {
            System.out.println(st);
        }
    }

    public static <T> T pegarPrimeiroLista(List <T> lista) {
        return lista.get(0);
    }
}

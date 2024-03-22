package generic;

/**
 * @author guiol
 */
public class ExemplosGenericEntry {

    public static void main(String[] args) {
        GenericEntry<String> entry = new GenericEntry<>("Teste");
        System.out.println(entry.getData());

        GenericEntry<Long> entryLong = new GenericEntry<>(100L);
        System.out.println(entryLong.getData());
    }
}

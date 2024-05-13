import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("matemática");
        lista.add("português");
        lista.add("história");
        lista.add("etm");

        System.out.println("A lista é:");
        System.out.println(lista);

        String Y = lista.remove(1);
        System.out.println("O elemento removido da lista foi " + Y);

        String X = lista.set(0, "biologia");
        System.out.println("A lista atualizada é " + lista);

        String elemento = lista.get(2);
        System.out.println("O quarto elemento da lista é: " + elemento);
    }
}
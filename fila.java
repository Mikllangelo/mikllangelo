import java.util.LinkedList;
import java.util.Queue;

public class fila {
public static void main(String[] args) {

Queue<String> carros = new LinkedList<>();

carros.add("Ford");
carros.add("Honda");
carros.add("Nissan");
carros.add("Jeep");

String front = carros.poll();
System.out.println("O carro removido da fila foi o " + front);

System.out.println("O carro que está no topo da pilha é " + carros.peek());

boolean queue = carros.isEmpty();
System.out.println("A fila de carros está vazia? " + queue);

    }
}

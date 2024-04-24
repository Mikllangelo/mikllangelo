import java.util.Stack;

public class pilha {
public static void main(String[] args) {

Stack<String> carros = new Stack();
        
carros.push("Ford");
carros.push("Honda");
carros.push("Nissan");
carros.push("Jeep");
        
String front = carros.pop();
System.out.println("O carro removido da pilha foi o " + front);
        
System.out.println("O carro que está no topo da pilha é " + carros.peek());
        
boolean queue = carros.isEmpty();
System.out.println("A pilha de carros está vazia? " + queue);
  
       }
}

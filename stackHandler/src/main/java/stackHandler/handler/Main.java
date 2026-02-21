package stackHandler.handler;

import umg.edu.gt.data_structure.stack.impl.SymbolValidator;
import umg.edu.gt.data_structure.stack.manual.StackLinked;


public class Main {
	
	public static void main(String[] args) {
        SymbolValidator  validator = new SymbolValidator();
        
        System.out.println("Caso (a+b) * [c-d] -> " + validator.isValid("(a+b) * [c-d]")); // true
        System.out.println("Caso ([)] -> " + validator.isValid("([)]")); // false

        System.out.println("---Prueba de Pila---");
        StackLinked mypila = new StackLinked();
        mypila.initStack('A');
        mypila.push('B');
        mypila.push('C');
        
        System.out.println("Tamaño de la pila: " + mypila.size());
        System.out.println("Nodo inicial (fondo): " + mypila.getNodeInit().value);

        System.out.println("Tamanio? " + mypila.size());
        System.out.println("Peek: " + mypila.peek()); // C
        System.out.println("Pop: " + mypila.pop());   // C
        System.out.println("Peek: " + mypila.peek());
        System.out.println("Pop: " + mypila.pop());   // B
        System.out.println("Vacia? " + mypila.isEmpty()); // false
        System.out.println("Pop: " + mypila.pop());   // A
        System.out.println("Vacia? " + mypila.isEmpty()); // true
        System.out.println("Pop: " + mypila.pop());   // A
        
    }
}

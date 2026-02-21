package umg.edu.gt.data_structure.stack;

import umg.edu.gt.data_structure.stack.manual.StackLinked;
import umg.edu.gt.data_structure.stack.impl.SymbolValidator;


public class Main {
    public static void main(String[] args) {
    	StackLinked stack = new StackLinked();
        
        stack.initStack('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Tamanio? " + stack.size());
        System.out.println("Peek: " + stack.peek()); // C
        System.out.println("Pop: " + stack.pop());   // C
        System.out.println("Peek: " + stack.peek()); // B
        System.out.println("Pop: " + stack.pop());   // B
        System.out.println("Vacia? " + stack.isEmpty()); // false
        System.out.println("Pop: " + stack.pop());   // A
        System.out.println("Vacia? " + stack.isEmpty()); // true
        
        SymbolValidator symbolValidator = new SymbolValidator(); 
        System.out.println(symbolValidator.isValid("(a+b) * [c-d]")); // true
        System.out.println(symbolValidator.isValid("([)]")); // false
    }
}

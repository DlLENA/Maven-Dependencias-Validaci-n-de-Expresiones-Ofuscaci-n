package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {
    private Node top; 
    private Node fondo; 

    public boolean isEmpty() {
        return top == null;
    }

    public void initStack(char value) {
        
        top = new Node(value, null, 1); 
        fondo = top; 
    }

    public void push(char value) {
        if (isEmpty()) {
            initStack(value); 
        } else {
            
            top = new Node(value, top, top.count + 1); 
        }
    }

    public int size() {
        if (isEmpty()) return 0;
        return top.count;
    }

    public char pop() {
        if (isEmpty()) {
            return '0';
        }
        char value = top.value;
        top = top.next;
        
        if (top == null) {
            fondo = null;
        }
        
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow");
        }
        return top.value;
    }

  
    public Node getNodeInit() {
        return fondo;
    }
}

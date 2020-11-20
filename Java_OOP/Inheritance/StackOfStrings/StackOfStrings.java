package StackOfStrings;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackOfStrings {
    private Deque<String> elements;     // Composition

    public StackOfStrings(){
        this.elements = new ArrayDeque<>();

                                        // Delegation
    }
    public void push(String element){
        this.elements.push(element);
    }
    public String pop(){
        return this.elements.pop();
    }
    public String peek(){
        return this.elements.peek();
    }
    public boolean isEmpty(){
        return this.elements.isEmpty();
    }
}

package edu.jsu.mcis.cs310;

public class Main {
    
    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        String message = "Hello, World!";
        return message;
    }
    
    public String reverse(String message) {
        StringBuilder Reverse = new StringBuilder(message);
        Reverse.reverse();
        message = Reverse.toString();
        return message;
    }
    
}
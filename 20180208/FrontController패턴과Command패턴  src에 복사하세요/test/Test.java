package test;

public class Test {
	public static void main(String[] args) {
		Command c =  CommandFactory.getCommand("A"); 
        c.run();
        Command c2 =  CommandFactory.getCommand("B"); 
        c2.run();  
	}
}
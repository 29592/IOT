package test;

public class Test2 {
	public static void main(String[] args) {
		Command c =  CommandFactory2.f.getCommand("A"); 
        c.run();
        Command c2 =  CommandFactory2.f.getCommand("B"); 
        c2.run();  
	}
}
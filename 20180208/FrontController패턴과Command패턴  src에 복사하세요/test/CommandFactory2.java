package test;
import java.util.HashMap;

public class CommandFactory2 { 
	public static CommandFactory2 f = new CommandFactory2();
	private CommandFactory2() {}
	HashMap<String, Command> map = new HashMap<String, Command>();
	
	public   Command getCommand(String cmd) {
		Command c = map.get(cmd);
		if (c == null) {
			if ("A".equals(cmd)) {
				c = new ACommand() ;
				map.put("A", c) ;
				return c;
			} else if ("B".equals(cmd)){
				c = new ACommand() ;
				map.put("B", c) ;
				return c;
			} else return null;
		} else
			return c;
	}
}

package test;
import java.util.HashMap;

public class CommandFactory {
	static HashMap<String, Command> map = new HashMap<String, Command>();
	
	public static Command getCommand(String cmd) {
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

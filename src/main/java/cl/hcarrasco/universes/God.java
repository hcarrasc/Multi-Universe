package cl.hcarrasco.universes;
import org.apache.log4j.Logger;

public class God {
	
	final static Logger logger = Logger.getLogger(God.class);
	
	public static void main(String[] args) {
		
		logger.info("Starting Universe");
		Universe universe = new Universe();
		universe.bigBang();
	    
	}
}

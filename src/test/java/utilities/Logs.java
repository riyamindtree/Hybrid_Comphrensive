package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {

	
	ConfigRead cr = new ConfigRead();
	Logger log;
	
	public Logger createLog()
	{
		System.setProperty("logfilename", cr.getLogName());
		log = LogManager.getLogger(getClass());
		return log;
	}
}

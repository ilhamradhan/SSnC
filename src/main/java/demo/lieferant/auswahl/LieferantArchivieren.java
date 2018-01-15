package demo.lieferant.auswahl;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class LieferantArchivieren implements JavaDelegate {
	
	private final static Logger LOGGER = Logger.getLogger("Lieferantauswahl");

	  public void execute(DelegateExecution execution) throws Exception {
	      LOGGER.info("Ergebnis: " + execution.getVariable("lieferant"));
	  }

}
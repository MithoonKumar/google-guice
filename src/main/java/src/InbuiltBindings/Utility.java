package src.InbuiltBindings;

import com.google.inject.Inject;

import java.util.logging.Logger;

public class Utility {
    private Logger logger;
    @Inject
    public Utility(Logger logger) {
        this.logger = logger;
    }

    public void logSomething() {
        logger.info("Something logged at info level");
    }
}

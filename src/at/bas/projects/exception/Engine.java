package at.bas.projects.exception;

import at.bas.projects.exception.exceptions.EngineException;

public class Engine {
    private boolean hasError;

    public Engine(boolean hasError) {
        this.hasError = hasError;
    }

    public void Start() throws EngineException {
        System.out.println("Engine Started");
        if (hasError) {
            throw new EngineException("Engine error");
        }

    }

}
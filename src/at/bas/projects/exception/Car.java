package at.bas.projects.exception;

import java.util.Random;

import at.bas.projects.exception.exceptions.CarException;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void StartEngine() throws CarException, Exception {

        Random r = new Random();
        if (r.nextBoolean()) {
            throw new CarException("Gear Shaft is broken");
        }
        if (r.nextBoolean()) {
            throw new Exception("No Cooling Liquid");
        }
        engine.Start();
    }

    public Engine getEngine() {
        return engine;
    }
}
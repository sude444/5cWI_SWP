package at.bas.projects.exception;

import at.bas.projects.exception.exceptions.CarException;
import at.bas.projects.exception.exceptions.EngineException;

public class GUI {
    public static void main(String[] args) {
        Engine e1 = new Engine(true);
        Car c1 = new Car(e1);

        try {
            c1.StartEngine();
        } catch (EngineException e) {
            System.out.println(e);
        } catch (CarException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

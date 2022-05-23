
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GUILLE
 */
public class Car implements Vehicle {

    private String type;

    public Car() {
        type = "I'm car";

    }

    @Override
    public Vehicle clonar() {
        Vehicle v = null;
        try {
            v = (Car) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

        return v;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

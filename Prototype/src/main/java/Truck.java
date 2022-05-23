/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class Truck implements Vehicle {

    private String type;

    public Truck() {
        type = "I'm truck";

    }

    @Override
    public Vehicle clonar() {
        Vehicle v = null;
        try {
            v = (Truck) clone();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class PatternDemoPrototype {

    public static void main(String[] args) {

        Car car = new Car();

        Car carClone = (Car) car.clonar();

        System.out.println("car type " + car.getType());

        System.out.println("carClone type " + car.getType());

        System.out.println(car == carClone);
    }

}

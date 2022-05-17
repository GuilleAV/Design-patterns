/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        CoinFactory coinFactory = new CoinFactory();

        Coin coin1 = coinFactory.getCoin("Dolar");
        System.out.println("coin1 cotización = " + coin1.getClass().getName() + " - " + coin1.getCotizacion());

        Coin coin2 = coinFactory.getCoin("euro");
        System.out.println("coin2 cotización = " + coin2.getClass().getName() + " - " + coin2.getCotizacion());

    }

}

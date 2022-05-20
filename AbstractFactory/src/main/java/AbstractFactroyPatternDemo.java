/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class AbstractFactroyPatternDemo {

    public static void main(String[] args) {

        AbstractFactory factory1 = FactoryProducer.getFactory("Coin");

        Coin dolar = factory1.getCoin("Dolar");

        System.out.println("Dolar cotización " + dolar.getCotizacion());

        Coin euro = factory1.getCoin("Euro");

        System.out.println("Euro cotización " + euro.getCotizacion());

        AbstractFactory factory2 = FactoryProducer.getFactory("Bitcoin");

        Coin btc = factory2.getCoin("BTC");

        System.out.println("BitCoin cotización " + btc.getCotizacion());

        Coin eth = factory2.getCoin("ETH");

        System.out.println("Ethel cotización " + eth.getCotizacion());

    }

}

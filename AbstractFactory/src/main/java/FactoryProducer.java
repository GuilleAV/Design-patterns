/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null || factoryType.isEmpty()) {
            return null;
        }

        if (factoryType.equalsIgnoreCase("Coin")) {
            return new CoinFactory();
        }

        if (factoryType.equalsIgnoreCase("Bitcoin")) {
            return new BitCoinFactory();
        }

        return null;
    }

}

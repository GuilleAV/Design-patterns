/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class CoinFactory extends AbstractFactory {

    public Coin getCoin(String coinType) {
        if (coinType == null || coinType.isEmpty()) {
            return null;
        }

        if (coinType.equalsIgnoreCase("DOLAR")) {
            return new Dolar();
        }

        if (coinType.equalsIgnoreCase("EURO")) {
            return new Euro();
        }

        return null;
    }

}

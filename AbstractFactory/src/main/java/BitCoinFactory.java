/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class BitCoinFactory extends AbstractFactory {

    public Coin getCoin(String coinType) {
        if (coinType == null || coinType.isEmpty()) {
            return null;
        }

        if (coinType.equalsIgnoreCase("BTC")) {
            return new BitCoin();
        }

        if (coinType.equalsIgnoreCase("ETH")) {
            return new Ether();
        }

        return null;
    }

}

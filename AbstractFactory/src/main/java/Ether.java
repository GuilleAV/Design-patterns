/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class Ether implements Coin {

    private static final double ETH = 798700.128;

    @Override
    public double getCotizacion() {
        return ETH;
    }
}

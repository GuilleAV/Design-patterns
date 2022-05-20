/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GUILLE
 */
public class Euro implements Coin {

    private static final double EURO = 198.789;

    @Override
    public double getCotizacion() {
        return EURO;
    }

}

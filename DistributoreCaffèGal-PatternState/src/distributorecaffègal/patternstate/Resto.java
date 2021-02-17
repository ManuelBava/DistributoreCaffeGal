/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorecaffègal.patternstate;

/**
 *
 * @author Federico
 */
public class Resto extends Caffe {

    private double resto;

    public Resto(double resto) {
        this.resto = resto;
    }

    public double returnTot(Caffe d) {
        if (d.getTot() > 0) {
            d.setTot(0);
        }
        return d.getTot();
    }

    public double verificaTotZero(Caffe c) {
        if (c.getTot() == 0) {
            return 0;
        }
        return tot;
    }

    
    
}

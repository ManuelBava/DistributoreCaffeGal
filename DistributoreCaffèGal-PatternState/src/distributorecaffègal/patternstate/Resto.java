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

    public Resto() {
        returnTot();
    }

    public double returnTot() {
        if (getTot() > 0) {
            setTot(0);
        }
        return getTot();
    }

    public double verificaTotZero(Caffe c) {
        if (c.getTot() == 0) {
            return 0;
        }
        return tot;
    }

    
    
}

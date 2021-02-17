/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorecaffègal.patternstate;

/**
 *
 * @author manue
 */
public class DistributoreCaffèGal {

    public static void main(String[] args) {
        AutomaDistributore a = new AutomaDistributore();

        a.next(new Caffe(0.32));
        a.next(new Resto());
        a.next(new Soldi());
        a.next(new CaffePronto());
        a.next(new Ritiro());
    }

}

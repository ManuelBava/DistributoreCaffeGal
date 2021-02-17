/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distributorecaffègal.patternstate;


public class CaffePronto extends Caffe{

    public CaffePronto() {
        setTot(tot);;
    }

    public double getTot() {
        return tot;
    }

    public void setTot(double tot) {
        this.tot = tot;
        tot-=0.45;        
    }
    
}

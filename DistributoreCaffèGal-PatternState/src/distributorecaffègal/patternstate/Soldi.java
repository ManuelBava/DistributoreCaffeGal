/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package distributorecaffègal.patternstate;


public class Soldi extends Caffe{
    
    private double soldi;

    public Soldi() {
    }

    public double getTot() {
        return soldi;
    }

    public void setTot(double tot) {
        this.tot = tot;
        soldi+=soldi/tot;       
    }
     
    
    
}

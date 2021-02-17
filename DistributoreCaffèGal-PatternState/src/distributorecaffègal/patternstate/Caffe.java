/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorecaffègal.patternstate;
public class Caffe implements Event{
    public double tot;

    public Caffe(double tot) {
        this.tot = tot;
        if (tot<0.45)
            System.out.println("NCHAI NA LIRA!!!");
    }

    Caffe() {
        setTot(tot);
    }

    public void setTot(double tot) {
        this.tot = tot;
    }

    
    public double getTot() {
        return tot;
    }
    
    
}

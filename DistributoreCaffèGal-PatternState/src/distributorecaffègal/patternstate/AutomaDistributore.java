/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distributorecaffègal.patternstate;

public class AutomaDistributore implements State {

    private State stato;

    public AutomaDistributore() {
        stato = new Attesa();
    }

    @Override
    public void next(Event e) {
        System.out.println("Siamo nello stato iniziale: " + stato);
        System.out.println("Ricevuto evento " + e);
        stato.next(e);
        System.out.println("Siamo passati nello stato " + stato);
    }

    private class Attesa implements State {

        @Override
        public void next(Event e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }
}

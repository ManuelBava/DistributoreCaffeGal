/*Autore Federico*/
package distributorecaffègal.patternstate;
public interface State {
      /**
     * Passa al prossimo stato dato l'evento
     *
     * @param e l'evento che farà transitare
     */
    void next (Event e);
}

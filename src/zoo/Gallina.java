package zoo;

/**
 *Clase Gallina de proyecto Zoologico
 * que hereda de la clase Ave ( que es la clase padre)
 * @author anaru
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     * Constructor por defecto sin parametros  
     */
    public Gallina () {}
    
    /**
     * Constructor con 4 parametros 
     * @param habitat       : donde vive la gallina
     * @param comida        : lo que come la gallina
     * @param longevidad    :la longitud de la gallina 
     * @param periodoIncubacion     : el periodo de incubacion en meses
     */
    public Gallina (Animal.Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Metodo set:  el sonido de la ave
     * @param cacareo
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Metodo get sin parametros
     * @return que devuelve un string del sonido del ave
     */
    public String getCacareo () { return cacareo; }
    
    /**
     * metodo  que no devuelve nada que es el sonido del ave
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     * metodo que digo lo que el ave come
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     * metodo que nos dice el desplazamiento del ave
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}

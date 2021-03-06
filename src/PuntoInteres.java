/**
 *
 * @author Blackbit
 */
class PuntoInteres
{

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @return the zoom
     */
    public double getZoom() {
        return zoom;
    }

    /**
     * @param zoom the zoom to set
     */
    public void setZoom(double zoom) {
        this.zoom = zoom;
    }

    /**
     * @return the max_iteraciones
     */
    public int getMax_iteraciones() {
        return max_iteraciones;
    }

    /**
     * @param max_iteraciones the max_iteraciones to set
     */
    public void setMax_iteraciones(int max_iteraciones) {
        this.max_iteraciones = max_iteraciones;
    }
    private int id;
    private double x;
    private double y;
    private double zoom;
    private int max_iteraciones;
    private String clase;

    PuntoInteres()
    {
        id = 0;
        x = 0;
        y = 0;
        zoom = 0;
        max_iteraciones = 0;
        clase ="";
    }
    
    public PuntoInteres(int id, String clase, double x, double y, double zoom, int max_iteraciones)
    {
        this.id = id;
        this.clase = clase;
        this.x = x;
        this.y = y;
        this.zoom = zoom;
        this.max_iteraciones = max_iteraciones;
    }

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }
}


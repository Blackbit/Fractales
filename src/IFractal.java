/**
 * Interface con los métodos para generalizar el manejo de los diferentes fractales
 * @author soib1a25
 */
public interface IFractal {
    /**
     * Realiza las operaciones de iteración para un punto x, y determinado y
     * devuelve dicho número de iteraciones
     * @param x coordenada horizontal
     * @param y coordenada vertical
     * @return índice del número de iteraciones
     */
    int calculaPunto(double x, double y);
    /**
     * Desplazamiento horizontal para que por defecto se visualice el fractal
     * @return Valor por defecto horizontal para que se visualice correctamente el fractal
     */
    double getOffsetX();
    /**
     * Desplazamiento vertical para que por defecto se visualice el fractal
     * @return Valor por defecto vertical para que se visualice correctamente el fractal
     */
    public double getOffsetY();
    /**
     * Factor multiplicativo de las coordenadas para que se visualice correctamente el fractal
     * inicialmente
     * @return factor de ampliación del fractal
     */
    public double getFactor();
    /**
     * Número de iteraciones de un determinado fractal
     * Hay fractales que necesitan un valor superior y otros un valor inferior
     * @return 
     */
    public int getMaxIteraciones();
    /**
     * Reasigna el número de iteraciones
     * Útil cuando se desea incrementar el detalle al hacer zoom
     * @param maxIteraciones Nuevo valor de iteraciones máxima.
     */
    public void setMaxIteraciones(int maxIteraciones);
    
}

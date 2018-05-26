/**
 *
 * @author Cinthia
 */
public interface IFractal {
    int calculaPunto(double x, double y);
    double getOffsetX();
    public double getOffsetY();
    public double getFactor();
    public int getMaxIteraciones();
    public void setMaxIteraciones(int maxIteraciones);
    
}

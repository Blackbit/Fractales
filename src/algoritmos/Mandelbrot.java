package algoritmos;

/**
 *
 * @author Blackbit
 */
public class Mandelbrot implements IFractal{

    /**
     * @return the offsetX
     */
    @Override
    public double getOffsetX() {
        return 2.0;
    }

    /**
     * @return the offsetY
     */
    @Override
    public double getOffsetY() {
        return 1.25;
    }

    /**
     * @return the factor
     */
    @Override
    public double getFactor() {
        return 2.5;
    }

    int MAXITER = 64;

    @Override
    public int calculaPunto(double px, double py) {
        double zx = 0.0, zy = 0.0;
        double zx2 = 0.0, zy2 = 0.0;
        int value = 0;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            zy = 2.0 * zx * zy + py;
            zx = zx2 - zy2 + px;
            zx2 = zx * zx;
            zy2 = zy * zy;
            value++;
        }
        return value == MAXITER ? 0 : value;
    }
    
    public int calculaPuntoX(double px, double py) {
        double zx = 0.0, zy = 0.0;
        double zx2 = 0.0, zy2 = 0.0;
        int value = 0;
        // a = zx
        // b = zy
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            double zrealUpdated = zx * zx - zy * zy + px;
            double zimaginaryUpdated = 2 * Math.abs(zx) * Math.abs(zy) + py;
            zx = zrealUpdated;
            zy = zimaginaryUpdated;
        value++;
        }
        return value == MAXITER ? 0 : value;
    }

    @Override
    public int getMaxIteraciones() {
        return MAXITER;
    }

    @Override
    public void setMaxIteraciones(int MAXITER) {
        this.MAXITER = MAXITER;
    }
    
}

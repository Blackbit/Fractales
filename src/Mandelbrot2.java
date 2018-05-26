/**
 *
 * @author soib1a25
 */
public class Mandelbrot2 implements IFractal{

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

    int MAXITER = 100;

    
    @Override
    public int calculaPunto(double px, double py) {
        double zx = 0.0, zy = 0.0;
        double zx2 = 0.0, zy2 = 0.0;
        int value = 0;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            zy = 3.0 * zx2 * zy - zy2*zy + py;
            zx = zx2 *zx - 3 * zy2 *zx + px;
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
        double d;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            d = Math.pow(zx, 4) + 2 * zx2 * zy2 + Math.pow(zy, 4);
            if (d == 0)
                break;
            zy = -2.0 * zx * zy / d + py;
            zx = (zx2 - zy2)/d + px;
            zx2 = zx * zx;
            zy2 = zy * zy;
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

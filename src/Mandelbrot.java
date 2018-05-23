/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cinthia
 */
public class Mandelbrot implements IFractal{

    /**
     * @return the offsetX
     */
    public double getOffsetX() {
        return 2.0;
    }

    /**
     * @return the offsetY
     */
    public double getOffsetY() {
        return 1.25;
    }

    /**
     * @return the factor
     */
    public double getFactor() {
        return 2.5;
    }

    static int MAXITER = 64;

        public int calculaPunto2(double px, double py) {
        double zx = px, zy = py;
        double zx2 = 0.0, zy2 = 0.0;
        int value = 0;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            zy = 2.0 * zx * zy -0.7;
            zx = zx2 - zy2 + 0.27015;
            zx2 = zx * zx;
            zy2 = zy * zy;
            value++;
        }
        return value == MAXITER ? 0 : value;
    }

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
            zy = 3.0 * zx * zx * zy - zy2 + py;
            zx = zx2 - 3.0 * zx * zy * zy + px;
            zx2 = zx * zx * zx;
            zy2 = zy * zy * zy;
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

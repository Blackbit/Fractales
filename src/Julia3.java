/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cinthia
 */
public class Julia3 implements IFractal{

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

    int MAXITER = 200;

    @Override
        public int calculaPunto(double px, double py) {
        double zx = px, zy = py;
        double zx2 = px * px, zy2 = py * py;
        int value = 0;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            zy = 2.0 * zx * zy + 0;
            zx = zx2 - zy2 + 0.279;
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


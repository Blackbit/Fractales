
import java.awt.Graphics;

/**
 *
 * @author soib1a25
 */
public class Arbol implements IFractal{

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

    int MAXITER = 75;

    @Override
    public int calculaPunto(double px, double py) {
        double zx = px, zy = py;
        double zx2 = px*px, zy2 = py*py;
        int value = 0;
        while (value < MAXITER && zx2 + zy2 < 4.0) {
            zy = Math.abs(zy*zx);
            zy += zy + zy - py;
            zx = zx2 - zy2 + px;
            zx2 = zx * zx;
            zy2 = zy * zy;
            value++;
        }
        return value == MAXITER ? 0 : value;
    }

    private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
        if (depth == 0) return;
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 10.0);
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 10.0);
        g.drawLine(x1, y1, x2, y2);
        drawTree(g, x2, y2, angle - 20, depth - 1);
        drawTree(g, x2, y2, angle + 20, depth - 1);
    }
    public void paint(Graphics g) {
 //       g.setColor(Color.BLACK);
        drawTree(g, 400, 500, -90, 9);
    }
      
    /*

    public BarnsleyFern() {
        final int dim = 640;
        setPreferredSize(new Dimension(dim, dim));
        setBackground(Color.white);
        img = new BufferedImage(dim, dim, BufferedImage.TYPE_INT_ARGB);
        createFern(dim, dim);
    }
 
    void createFern(int w, int h) {
        double x = 0;
        double y = 0;
 
        for (int i = 0; i < 200_000; i++) {
            double tmpx, tmpy;
            double r = Math.random();
 
            if (r <= 0.01) {
                tmpx = 0;
                tmpy = 0.16 * y;
            } else if (r <= 0.08) {
                tmpx = 0.2 * x - 0.26 * y;
                tmpy = 0.23 * x + 0.22 * y + 1.6;
            } else if (r <= 0.15) {
                tmpx = -0.15 * x + 0.28 * y;
                tmpy = 0.26 * x + 0.24 * y + 0.44;
            } else {
                tmpx = 0.85 * x + 0.04 * y;
                tmpy = -0.04 * x + 0.85 * y + 1.6;
            }
            x = tmpx;
            y = tmpy;
 
            img.setRGB((int) Math.round(w / 2 + x * w / 11),
                    (int) Math.round(h - y * h / 11), 0xFF32CD32);
        }
    }
 
    @Override
    public void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
 
        g.drawImage(img, 0, 0, null);
    }    
    
    */

    @Override
    public int getMaxIteraciones() {
        return MAXITER;
    }

    @Override
    public void setMaxIteraciones(int MAXITER) {
        this.MAXITER = MAXITER;
    }
    
}

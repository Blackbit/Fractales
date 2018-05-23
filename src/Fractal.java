
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;
import javax.swing.event.MouseInputAdapter;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cinthia
 */
public class Fractal extends javax.swing.JPanel {

    /**
     * @return the viewX
     */
    public double getViewX() {
        return viewX;
    }

    /**
     * @param viewX the viewX to set
     */
    public void setViewX(double viewX) {
        this.viewX = viewX;
    }

    /**
     * @return the viewY
     */
    public double getViewY() {
        return viewY;
    }

    /**
     * @param viewY the viewY to set
     */
    public void setViewY(double viewY) {
        this.viewY = viewY;
    }
    private int MAXITER = 64;
    public Color[] colors = new Color[48];
    private double viewX = 0.0;
    private double viewY = 0.0;
    private double zoom = 1.0;
    private int mouseX;
    private int mouseY;
    private IFractal calculoFractal = new Mandelbrot();
    BufferedImage biImagen;

    /**
     * Creates new form Fractal
     */
    public Fractal() {
        initComponents();
        init();
        
        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if ((e.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
                    if (x != mouseX && y != mouseY) {
                        int w = getSize().width;
                        int h = getSize().height;
                        viewX += zoom * Math.min(x, mouseX) / Math.min(w, h);
                        viewY += zoom * Math.min(y, mouseY) / Math.min(w, h);
                        zoom *= Math.max((double) Math.abs(x - mouseX) / w, (double) Math.abs(y - mouseY) / h);
                    }
                } else if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0) {
                    MAXITER += MAXITER / 4;
                } else {
                    MAXITER = 64;
                    viewX = viewY = 0.0;
                    zoom = 1.0;
                }
                paint(getGraphics());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        };
        addMouseListener(ml);
        MouseMotionListener mml = new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();

                if (SwingUtilities.isLeftMouseButton(e))
                {
                    getGraphics().drawImage(biImagen, 0, 0, null);
                    g.setColor(Color.red);
                    g.draw3DRect(mouseX, mouseY, e.getX()-mouseX, e.getY()-mouseY, false);
                }else if (SwingUtilities.isRightMouseButton(e))
                {
                    int w = getSize().width;
                    int h = getSize().height;
                    viewX += (mouseX-e.getX())/32*zoom/Math.min(w, h);
                    viewY += (mouseY-e.getY())/32*zoom/Math.min(w, h);
//                    viewX += 1*zoom/Math.min(w, h);
//                    viewY += 1*zoom/Math.min(w, h);
                    paint(getGraphics());
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        };
        addMouseMotionListener(mml);
    }

/*    @Override
    public void invalidate() {
        super.invalidate(); //To change body of generated methods, choose Tools | Templates.
        paint(getGraphics());
    }*/
    
    

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height); //To change body of generated methods, choose Tools | Templates.
        biImagen = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
    }

    @Override
    public void setBounds(Rectangle r) {
        super.setBounds(r); //To change body of generated methods, choose Tools | Templates.
        biImagen = new BufferedImage(r.width, r.height, BufferedImage.TYPE_INT_BGR);
    }
    
    
    
    private IFractal getTipoFractal()
    {
        return calculoFractal;
    }
    
    private void setTipoFractal(IFractal tipoFractal)
    {
        this.calculoFractal = tipoFractal;
    }

    public void init() {
        for (int i = 0; i < colors.length; i++) {
            int c = 2 * i * 256 / colors.length;
            if (c > 255) {
                c = 511 - c;
            }
            colors[i] = new Color(c, c, c);
        }
    }

    public BufferedImage generaImagen(int ancho, int alto)
    {
        BufferedImage biImagen = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_BGR);
        this.paint(biImagen.getGraphics());
        return biImagen;

    }

    @Override
    public void paint(Graphics g2) {
        super.paint(g2); //To change body of generated methods, choose Tools | Templates.
        if (java.beans.Beans.isDesignTime()) {
            return;
        }

        Graphics g = biImagen.getGraphics();
        
        int y, x;
        double dx;
        double dy;
        int value;
        long inicio = new Date().getTime();
        Dimension size = this.getSize();
        double r = getZoom() / Math.min(size.width, size.height);
        double offsetX = calculoFractal.getOffsetX();
        double offsetY = calculoFractal.getOffsetY();
        double factor = calculoFractal.getFactor();
        
        for (y = 0; y < size.height; y++) {
            for (x = 0; x < size.width; x++) {
                dx = factor * (x * r + getViewX()) - offsetX;
                dy = offsetY - factor * (y * r + getViewY());
                value = calculoFractal.calculaPunto(dx, dy);
                g.setColor(colors[value % colors.length]);
                g.drawLine(x, y, x, y);
            }
        }
        long hasta = (new Date()).getTime();
        g2.drawImage(biImagen, 0, 0, null);
//        lblInfo.setText(String.format("%.02fs", (float)(hasta-inicio)/1000.0));
//        System.out.println("Ha tardado "+(hasta-inicio)+"ms");
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

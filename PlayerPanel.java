import java.awt.GradientPaint;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.Graphics2D;

import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
    

    DeckColors deckColor;

    public PlayerPanel(Player player){
        this.deckColor = player.getDeckColors();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Create a gradient from top to bottom
        Color color1 = Color.BLUE;  // Start color
        Color color2 = Color.CYAN; // End color
        int width = getWidth();
        int height = getHeight();

        GradientPaint gradientPaint = new GradientPaint(0, 0, color1, 0, height, color2);
        g2d.setPaint(gradientPaint);


        g2d.fillRect(0, 0, width, height);
    }
}








// import java.awt.Color;


// public class PlayerPanel() extends JPanel {

//     public PlayerPanel(Player player){

//     }

 
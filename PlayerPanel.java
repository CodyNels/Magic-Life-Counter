import java.awt.GradientPaint;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayerPanel extends JPanel{
    
    Player panelsPlayer;
    DeckColors deckColor;
    String playerName;
    int life;
    Color colorless = new Color(204,194,192);
    Color black = new Color(82,82,82);
    Color blue = new Color(170,225,251);
    Color green = new Color(155, 211, 174);
    Color red = new Color(250,170,143);
    Color white = new Color(255,251,213);
    Color textColor = new Color(51,51,51);




    public PlayerPanel(Player player){
        this.panelsPlayer = player;
        this.deckColor = player.getDeckColors();
        this.playerName = player.getName();
        this.life = player.getLife();

        JPanel nameAndNumber = new JPanel();
        nameAndNumber.setLayout(new BoxLayout(nameAndNumber, BoxLayout.Y_AXIS));

        JLabel name = new JLabel(this.playerName);
        nameAndNumber.add(name);

        JLabel lifeLabel = new JLabel("" + this.life);
        lifeLabel.setFont(new Font("Dialog", Font.BOLD, 55));
        nameAndNumber.add(lifeLabel);
        nameAndNumber.setOpaque(false);
        this.add(nameAndNumber);

        JPanel lifeButtons = new JPanel();
        JButton lifeUp = new JButton("+");
        JButton lifeDown = new JButton("-");
        lifeButtons.add(lifeUp);
        lifeButtons.add(lifeDown);
        lifeButtons.setOpaque(false);
        this.add(lifeButtons);

        JPanel poison = new JPanel();
        JLabel poisonLabel = new JLabel("Poison Counters: ");

        JLabel poisonCounters = new JLabel("0");

        JButton poisonUp = new JButton("+");
        JButton poisonDown = new JButton("-");
        poison.add(poisonLabel);
        poison.add(poisonCounters);
        poison.add(poisonUp);
        poison.add(poisonDown);
        poison.setOpaque(false);
        this.add(poison);


        

        if(this.deckColor == DeckColors.Colorless){
            this.setBackground(colorless);
        }else if(this.deckColor == DeckColors.Black){
            this.setBackground(black);
        }else if(this.deckColor == DeckColors.Blue){
            this.setBackground(blue);
        }else if(this.deckColor == DeckColors.Green){
            this.setBackground(green);
        }else if(this.deckColor == DeckColors.Red){
            this.setBackground(red);
        }else if(this.deckColor == DeckColors.White){
            this.setBackground(white);
        }

        
        for (Component component : this.getComponents()) {
            if (component instanceof JComponent) {
                component.setForeground(textColor);
            }
        }
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Color color1;
        Color color2;
        Color color3;
        Color color4;
        Color color5;

        if (deckColor == DeckColors.Black) {
            color1 = black;
            color2 = black;
            color3 = black;
            color4 = black;
            color5 = black;
        } else if (deckColor == DeckColors.Blue) {
            color1 = blue;
            color2 = blue;
            color3 = blue;
            color4 = blue;
            color5 = blue;
        } else if (deckColor == DeckColors.Green) {
            color1 = green;
            color2 = green;
            color3 = green;
            color4 = green;
            color5 = green;
        }  else if (deckColor == DeckColors.Red) {
            color1 = red;
            color2 = red;
            color3 = red;
            color4 = red;
            color5 = red;
        }  else if (deckColor == DeckColors.White) {
            color1 = white;
            color2 = white;
            color3 = white;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlackBlue){
            color1 = black;
            color2 = black;
            color3 = blue;
            color4 = blue;
            color5 = blue;
        } else if (deckColor == DeckColors.BlackGreen){
            color1 = black;
            color2 = black;
            color3 = green;
            color4 = green;
            color5 = green;
        } else if (deckColor == DeckColors.BlackRed){
            color1 = black;
            color2 = black;
            color3 = red;
            color4 = red;
            color5 = red;
        } else if (deckColor == DeckColors.BlackWhite){
            color1 = black;
            color2 = black;
            color3 = white;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlueGreen){
            color1 = blue;
            color2 = blue;
            color3 = green;
            color4 = green;
            color5 = green;
        } else if (deckColor == DeckColors.BlueRed){
            color1 = blue;
            color2 = blue;
            color3 = red;
            color4 = red;
            color5 = red;
        } else if (deckColor == DeckColors.BlueWhite){
            color1 = blue;
            color2 = blue;
            color3 = white;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.GreenWhite){
            color1 = green;
            color2 = green;
            color3 = white;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.GreenRed){
            color1 = green;
            color2 = green;
            color3 = red;
            color4 = red;
            color5 = red;
        } else if (deckColor == DeckColors.RedWhite){
            color1 = red;
            color2 = red;
            color3 = white;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlackBlueGreen){
            color1 = black;
            color2 = blue;
            color3 = blue;
            color4 = green;
            color5 = green;
        } else if (deckColor == DeckColors.BlackBlueRed){
            color1 = black;
            color2 = blue;
            color3 = blue;
            color4 = red;
            color5 = red;
        } else if (deckColor == DeckColors.BlackBlueWhite){
            color1 = black;
            color2 = blue;
            color3 = blue;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlackGreenRed){
            color1 = black;
            color2 = green;
            color3 = green;
            color4 = red;
            color5 = red;
        }  else if (deckColor == DeckColors.BlackGreenWhite){
            color1 = black;
            color2 = green;
            color3 = green;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlackRedWhite){
            color1 = black;
            color2 = red;
            color3 = red;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlueGreenRed){
            color1 = blue;
            color2 = green;
            color3 = green;
            color4 = red;
            color5 = red;
        } else if (deckColor == DeckColors.BlueGreenWhite){
            color1 = blue;
            color2 = green;
            color3 = green;
            color4 = white;
            color5 = white;
        }  else if (deckColor == DeckColors.BlueRedWhite){
            color1 = blue;
            color2 = red;
            color3 = red;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.GreenRedWhite){
            color1 = green;
            color2 = red;
            color3 = red;
            color4 = white;
            color5 = white;
        } else if (deckColor == DeckColors.BlackBlueGreenRed){
            color1 = black;
            color2 = blue;
            color3 = green;
            color4 = green;
            color5 = red;
        } else if (deckColor == DeckColors.BlackBlueGreenWhite){
            color1 = black;
            color2 = blue;
            color3 = green;
            color4 = green;
            color5 = white;
        }  else if (deckColor == DeckColors.BlackBlueRedWhite){
            color1 = black;
            color2 = blue;
            color3 = red;
            color4 = red;
            color5 = white;
        } else if (deckColor == DeckColors.BlackGreenRedWhite){
            color1 = black;
            color2 = green;
            color3 = red;
            color4 = red;
            color5 = white;
        } else if (deckColor == DeckColors.BlueGreenRedWhite){
            color1 = blue;
            color2 = green;
            color3 = red;
            color4 = red;
            color5 = white;
        } else if (deckColor == DeckColors.BlackBlueGreenRedWhite){
            color1 = black;
            color2 = blue;
            color3 = green;
            color4 = red;
            color5 = white;
        }else{
            color1 = colorless;
            color2 = colorless;
            color3 = colorless;
            color4 = colorless;
            color5 = colorless;
        }
        


        int width = getWidth();
        int height = getHeight();

        // Calculate segment width for smooth transitions
        int segmentWidth = width / 4;

        // Gradient across full width with horizontal blending
        GradientPaint gradient1 = new GradientPaint(0, 0, color1, segmentWidth, 0, color2);
        g2d.setPaint(gradient1);
        g2d.fillRect(0, 0, segmentWidth, height);

        GradientPaint gradient2 = new GradientPaint(segmentWidth, 0, color2, segmentWidth * 2, 0, color3);
        g2d.setPaint(gradient2);
        g2d.fillRect(segmentWidth, 0, segmentWidth, height);

        GradientPaint gradient3 = new GradientPaint(segmentWidth * 2, 0, color3, segmentWidth * 3, 0, color4);
        g2d.setPaint(gradient3);
        g2d.fillRect(segmentWidth * 2, 0, segmentWidth, height);

        GradientPaint gradient4 = new GradientPaint(segmentWidth * 3, 0, color4, width, 0, color5);
        g2d.setPaint(gradient4);
        g2d.fillRect(segmentWidth * 3, 0, width - segmentWidth * 3, height);

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
    }

    public void addOpponents(Player[] opponents){
        
        JPanel commanderPanel = new JPanel();
        JLabel commanderLabel = new JLabel("Commander Dmg");

        JPanel oppPanel = new JPanel();
        oppPanel.setLayout(new GridLayout(4,2));
        oppPanel.setOpaque(false);
        commanderPanel.add(commanderLabel);
        commanderPanel.setLayout(new BoxLayout(commanderPanel, BoxLayout.Y_AXIS));
        for(int i = 0; i < opponents.length; i++){
            JPanel uke = new JPanel();
            if(this.playerName != opponents[i].getName()){
                JLabel name = new JLabel(opponents[i].getName());

                JLabel dmg = new JLabel("0");
                JButton up = new JButton("+");
                JButton down = new JButton("-");
                uke.add(name);
                uke.add(dmg);
                uke.add(up);
                uke.add(down);
                uke.setOpaque(false);
                oppPanel.add(uke);
            }
        }
        commanderPanel.add(oppPanel);
        for (Component component : commanderPanel.getComponents()) {
            if (component instanceof JComponent) {
                component.setForeground(textColor);
            }
        }
        commanderPanel.setOpaque(false);
        this.add(commanderPanel);
    }
}

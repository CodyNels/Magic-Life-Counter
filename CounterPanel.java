/* Commander Damage
* Dice Roller
 * Coin Flip
*/

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

public class CounterPanel extends JPanel{
    

    public CounterPanel(Player[] players){
        int amountOfPlayers = players.length;
        this.setLayout(new GridLayout(2, (int) Math.ceil(amountOfPlayers / 2.0)));

        for (int i = 0; i < amountOfPlayers; i++) {
            JPanel playerPanel = new PlayerPanel(players[i]);
            JLabel playerName = new JLabel(players[i].getName());
            playerPanel.add(playerName);
            playerPanel.setBackground(getBackground());
            this.add(playerPanel);


        }
    }


}



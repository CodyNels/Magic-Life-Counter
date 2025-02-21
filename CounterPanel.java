
import javax.swing.JPanel;

import java.awt.GridLayout;

public class CounterPanel extends JPanel{
    

    public CounterPanel(Player[] players){
        int amountOfPlayers = players.length;
        this.setLayout(new GridLayout(2, (int) Math.ceil(amountOfPlayers / 2.0)));

        for (int i = 0; i < amountOfPlayers; i++) {
            PlayerPanel playerPanel = new PlayerPanel(players[i]);
            playerPanel.addOpponents(players);
            this.add(playerPanel);
        }
    }


}



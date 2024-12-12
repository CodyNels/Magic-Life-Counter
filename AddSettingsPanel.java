import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


/*
 * Player Name
 * Color
 */


public class AddSettingsPanel extends JPanel{
    

    public AddSettingsPanel(){
        this.setPreferredSize(new Dimension(300,300));
        this.setBackground(Color.gray);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        JButton addPlayerButton = new JButton("Add Player");
        this.add(addPlayerButton);
    }
}
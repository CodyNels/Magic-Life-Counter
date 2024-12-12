/* Commander Damage
* Dice Roller
 * Coin Flip
*/

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  

public class CounterPanel extends JPanel{
    
    JPanel addPlayerPanel = new AddSettingsPanel();


    public CounterPanel(){
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(1200,800));
        JPanel settingsThing = new JPanel();
        settingsThing.setLayout(new BorderLayout());
        settingsThing.setPreferredSize(new Dimension(345, 800));
        settingsThing.add(addPlayerPanel, BorderLayout.PAGE_START);
        addPlayerPanel.setVisible(false);
        JButton addPlayer = new JButton("+");
        addPlayer.setPreferredSize(new Dimension(45,40));
        addPlayer.addActionListener(new AddPlayerListener());
        settingsThing.add(addPlayer, BorderLayout.LINE_END);
        this.add(settingsThing, BorderLayout.PAGE_END);
    }

    private class AddPlayerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(addPlayerPanel.isVisible()){
                addPlayerPanel.setVisible(false);
            }else{
                addPlayerPanel.setVisible(true);
            }
            
        }
        
    }
    


}

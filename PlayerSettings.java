import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;


public class PlayerSettings extends JPanel{
    
    /*
     * Name
     * Color
     */

    JCheckBox blackCheck = new JCheckBox("Black");
    JCheckBox blueCheck = new JCheckBox("Blue");
    JCheckBox greenCheck = new JCheckBox("Green");
    JCheckBox redCheck = new JCheckBox("Red");
    JCheckBox whiteCheck = new JCheckBox("White");
    JTextArea playerName = new JTextArea("Player's Name");
    DeckColors color;
    int life;

    public PlayerSettings(){
        Border blackline = BorderFactory.createLineBorder(Color.black);
        this.setBorder(blackline);
        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());

        playerName.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                if(playerName.getText().length() > 42){
                    String rightLength = playerName.getText().substring(0, 41);
                    playerName.setText(rightLength);
                }else if(playerName.getText().length() <= 0){
                    playerName.setText("Player's Name");
                }
            }
            
        });
        int width = this.getWidth();
        playerName.setSize(width , HEIGHT);
        JPanel boxes = new JPanel(new GridLayout(1,5));
        
        boxes.add(blackCheck);
        boxes.add(blueCheck);
        boxes.add(greenCheck);
        boxes.add(redCheck);
        boxes.add(whiteCheck);

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(playerName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(boxes, gbc);

    }

    public DeckColors checkColor(){
        DeckColors color = DeckColors.Colorless;
        if(blackCheck.isSelected() && blueCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackBlueGreenRedWhite;
        }else if(blueCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlueGreenRedWhite;
        }else if(blackCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackGreenRedWhite;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackBlueRedWhite;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && greenCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackBlueGreenWhite;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlackBlueGreenRed;
        }else if(greenCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.GreenRedWhite;
        }else if(blueCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlueRedWhite;
        }else if(blueCheck.isSelected() && greenCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlueGreenWhite;
        }else if(blueCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlueGreenRed;
        }else if(blackCheck.isSelected() && redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackRedWhite;
        }else if(blackCheck.isSelected() && greenCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackGreenWhite;
        }else if(blackCheck.isSelected() && greenCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlackGreenRed;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackBlueWhite;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlackBlueRed;
        }else if(blackCheck.isSelected() && blueCheck.isSelected() && greenCheck.isSelected()){
            color = DeckColors.BlackBlueGreen;
        }else if(redCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.RedWhite;
        }else if(greenCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.GreenWhite;
        }else if(greenCheck.isSelected()  && redCheck.isSelected()){
            color = DeckColors.GreenRed;
        }else if(blueCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlueWhite;
        }else if(blueCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlueRed;
        }else if(blueCheck.isSelected() && greenCheck.isSelected()){
            color = DeckColors.BlueGreen;
        }else if(blackCheck.isSelected() && whiteCheck.isSelected()){
            color = DeckColors.BlackWhite;
        }else if(blackCheck.isSelected() && redCheck.isSelected()){
            color = DeckColors.BlackRed;
        }else if(blackCheck.isSelected() && greenCheck.isSelected()){
            color = DeckColors.BlackGreen;
        }else if(blackCheck.isSelected() && blueCheck.isSelected()){
            color = DeckColors.BlackBlue;
        }else if(whiteCheck.isSelected()){
            color = DeckColors.White;
        }else if(redCheck.isSelected()){
            color = DeckColors.Red;
        }else if(greenCheck.isSelected()){
            color = DeckColors.Green;
        }else if(blueCheck.isSelected()){
            color = DeckColors.Blue;
        }else if(blackCheck.isSelected()){
            color = DeckColors.Black;
        }

        return color;
    }

    public String getName(){
        String name = playerName.getText();
        return name;
    }


}

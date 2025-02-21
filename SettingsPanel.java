import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SettingsPanel extends JPanel{
    

    PlayerSettings player1 = new PlayerSettings();
    PlayerSettings player2 = new PlayerSettings();
    PlayerSettings player3 = new PlayerSettings();
    PlayerSettings player4 = new PlayerSettings();
    PlayerSettings player5 = new PlayerSettings();
    PlayerSettings player6 = new PlayerSettings();
    PlayerSettings player7 = new PlayerSettings();
    PlayerSettings player8 = new PlayerSettings();
    int amountofPlayers = 0;
    int life = 20;
    JButton life40 = new JButton("40");
    JButton life20 = new JButton("20");
    JPanel cardPanel = new JPanel(new CardLayout());

    public SettingsPanel(){
        this.setPreferredSize(new Dimension(1200,800));
        this.setLayout(new CardLayout());
        player1.setVisible(false);
        player2.setVisible(false);
        player3.setVisible(false);
        player4.setVisible(false);
        player5.setVisible(false);
        player6.setVisible(false);
        player7.setVisible(false);
        player8.setVisible(false);

        JPanel prePanel = new JPanel();
        JPanel customizePanel = new JPanel();
        JLabel playerCountLabel = new JLabel("Amount of Players: ");

        JPanel gridPanel = new JPanel(new GridLayout(2,4));
        JButton playerCount1 = new JButton("1");
        playerCount1.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount1);

        JButton playerCount2 = new JButton("2");
        playerCount2.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount2);

        JButton playerCount3 = new JButton("3");
        playerCount3.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount3);

        JButton playerCount4 = new JButton("4");
        playerCount4.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount4);

        JButton playerCount5 = new JButton("5");
        playerCount5.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount5);

        JButton playerCount6 = new JButton("6");
        playerCount6.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount6);

        JButton playerCount7 = new JButton("7");
        playerCount7.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount7);

        JButton playerCount8 = new JButton("8");
        playerCount8.addActionListener(new PlayerCountListener());
        gridPanel.add(playerCount8);

        customizePanel.add(playerCountLabel);
        customizePanel.add(gridPanel);

        JPanel lifePanel = new JPanel();
        JLabel startingLifeLabel = new JLabel("Starting Life: ");
       
        life20.addActionListener(new LifeListener());
        
        life40.addActionListener(new LifeListener());
        lifePanel.add(startingLifeLabel);
        lifePanel.add(life20);
        lifePanel.add(life40);
        

        JPanel playersPanel = new JPanel();
        playersPanel.setLayout(new GridLayout(4,2));
        playersPanel.add(player1);
        playersPanel.add(player2);
        playersPanel.add(player3);
        playersPanel.add(player4);
        playersPanel.add(player5);
        playersPanel.add(player6);
        playersPanel.add(player7);
        playersPanel.add(player8);


        JButton startGame = new JButton("Start Game");
        startGame.addActionListener(new StartGame());
        prePanel.add(customizePanel);
        prePanel.add(lifePanel);
        prePanel.add(playersPanel);
        prePanel.add(startGame);
        prePanel.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));
        cardPanel.add(prePanel, "Panel1");
        this.add(cardPanel);
    }

    public class LifeListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            switch(source.getText()){
                case "20":
                    life = 20;
                    source.setFont(new Font("Dialog", Font.BOLD, 14));
                    life40.setFont(new Font("Dialog", Font.BOLD, 12));
                    break;
                case "40":
                    source.setFont(new Font("Dialog", Font.BOLD, 14));
                    life20.setFont(new Font("Dialog", Font.BOLD, 12));
                    break;
                default:
            }
        }
        
    }

    public class PlayerCountListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();


            switch(source.getText()){
                case "1":
                    player1.setVisible(true);
                    player2.setVisible(false);
                    player3.setVisible(false);
                    player4.setVisible(false);
                    player5.setVisible(false);
                    player6.setVisible(false);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 1;
                    break;
                case "2":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(false);
                    player4.setVisible(false);
                    player5.setVisible(false);
                    player6.setVisible(false);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 2;
                    break;
                case "3":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(false);
                    player5.setVisible(false);
                    player6.setVisible(false);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 3;
                    break;
                case "4":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(true);
                    player5.setVisible(false);
                    player6.setVisible(false);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 4;
                    break;
                case "5":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(true);
                    player5.setVisible(true);
                    player6.setVisible(false);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 5;
                    break;
                case "6":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(true);
                    player5.setVisible(true);
                    player6.setVisible(true);
                    player7.setVisible(false);
                    player8.setVisible(false);
                    amountofPlayers = 6;
                    break;
                case "7":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(true);
                    player5.setVisible(true);
                    player6.setVisible(true);
                    player7.setVisible(true);
                    player8.setVisible(false);
                    amountofPlayers = 7;
                    break;
                case "8":
                    player1.setVisible(true);
                    player2.setVisible(true);
                    player3.setVisible(true);
                    player4.setVisible(true);
                    player5.setVisible(true);
                    player6.setVisible(true);
                    player7.setVisible(true);
                    player8.setVisible(true);
                    amountofPlayers = 8;
                    break;
                default:

            }
        }
        
    }

    public class StartGame implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Player[] players = new Player[amountofPlayers];
            PlayerSettings[] playerPanels = {player1, player2, player3, player4, player5, player6, player7, player8};
            for (int i = 0; i < amountofPlayers; i++) {
                DeckColors playerColors = playerPanels[i].checkColor();
                players[i] = new Player(playerPanels[i].getName(), playerColors);
            }
            JPanel actualGame = new CounterPanel(players);
            cardPanel.add(actualGame, "Panel2");

            CardLayout cl = (CardLayout) cardPanel.getLayout();
            cl.show(cardPanel, "Panel2");
            
            for(int i = 0; i < amountofPlayers; i++){
                System.out.println(players[i]);
            }

        }
    }
}
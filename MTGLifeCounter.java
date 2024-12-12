import javax.swing.JFrame;

public class MTGLifeCounter {
public static void main(String args[]){
		JFrame frame = new JFrame("MTG Commander Life Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new CounterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}

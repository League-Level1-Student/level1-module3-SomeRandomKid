import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class NumGenerator  implements ActionListener {
	JFrame boi = new JFrame();
	JPanel meme = new JPanel();
	JButton clemy = new JButton();
	JLabel dank = new JLabel();
	Random lol = new Random();
	int pepe = lol.nextInt(100);
	public NumGenerator() {
		boi.add(meme);
		meme.add(clemy);
		meme.add(dank);
		boi.setVisible(true);
		clemy.setText("Generate");
		int pepe = lol.nextInt(100);
		dank.setText(""+ pepe);
		clemy.addActionListener(this);
		boi.pack();
		
			
		
	}
	public static void main(String[] args) {
		NumGenerator x = new NumGenerator();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		;JButton buttonPressed = (JButton) arg0.getSource();
		// TODO Auto-generated method stub
		if (buttonPressed == clemy) {
		 int j = lol.nextInt(100);
		 dank.setText(""+ j);
		}
		
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clicker implements ActionListener {
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton incButton = new JButton("Inc");
	JButton discButton = new JButton("Disc");
	public static void main(String[] args) {
	Clicker a = new Clicker();
	a.buildWindow();
	}
	void buildWindow() {
		window.add(panel);
		panel.add(incButton);
		panel.add(discButton);
		window.setVisible(true);
		window.pack();
		incButton.addActionListener(this);
		discButton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton boi = (JButton)arg0.getSource();
		if (boi == incButton) {
			System.out.println("The counter is");
		}
		else if (boi == discButton) {
			
		}
	}
}

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_V2 implements ActionListener{
JFrame boi = new JFrame();
JPanel dank = new JPanel();
JTextField meme = new JTextField(10);
JTextField sad = new JTextField(10);
JButton lol = new JButton();
JButton supreme = new JButton();
JButton patty = new JButton();
JButton gang = new JButton();


Calculator_V2() {
	boi.setVisible(true);
	boi.add(dank);
	dank.add(meme);
	dank.add(sad);
	dank.add(lol);
	boi.pack();
	lol.setText("Add");
	lol.addActionListener(this);
	dank.add(supreme);
	supreme.setText("Subtact");
	supreme.addActionListener(this);
	dank.add(patty);
	patty.setText("Multiply");
	patty.addActionListener(this);
	dank.add(gang);
	gang.setText("Divide");
	gang.addActionListener(this);
	boi.pack();
	}

public static void main(String[] args) {
	Calculator_V2 f = new Calculator_V2();
}


@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	// TODO Auto-generated method stub
	String x = meme.getText();
	int y = Integer.parseInt(x);
	String z = sad.getText();
	int a = Integer.parseInt(z);
	if (buttonPressed == lol) {
		 int b = y + a;
		 JOptionPane.showMessageDialog(null, b);
	}
	if (buttonPressed == supreme) {
		 int c = y - a;
		 JOptionPane.showMessageDialog(null, c);
	}
	if (buttonPressed == patty) {
		 int d = y * a;
		 JOptionPane.showMessageDialog(null, d);
	}
	if (buttonPressed == gang) {
		 int e = y / a;
		 JOptionPane.showMessageDialog(null, e);
	}
	}
}

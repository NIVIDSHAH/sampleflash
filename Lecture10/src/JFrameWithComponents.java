import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameWithComponents extends JFrame implements ActionListener {
	JLabel myLabel = new JLabel("Name: ");
	JTextField myField = new JTextField(12);
	JButton myButton = new JButton("OK!");
	
	public JFrameWithComponents() {
		super("Frame with component and action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(myLabel);
		add(myField);
		add(myButton);
		myButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		myLabel.setText(myField.getText());
		myButton.setText("You clicked!");
	}
}

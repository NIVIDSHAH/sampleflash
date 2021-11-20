import javax.swing.*;
import java.util.*;
public class JFrameDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame aFrame = new JFrame("Hello world");
		final int WIDTH = 350;
		final int HEIGHT = 400;
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

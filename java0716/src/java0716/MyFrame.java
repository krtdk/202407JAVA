package java0716;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton jb = new JButton("테스트");
	
	public MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("안녕 스윙");
		this.setLocation(700,300);
		this.setSize(300,300);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame();
		
	}
}

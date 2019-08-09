// huangmingxin 2019.7.31
import javax.swing.*;


public class JframeHelloWorld{
    public static void main(String[] args){
	    JFrame frame = new JFrame("JFrame");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("helloworld");
		panel.add(label);
		frame.setContentPane(panel);
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
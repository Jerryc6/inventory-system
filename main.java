import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main{

	public void Object(){

		JFrame frame = new JFrame("Screen");
		frame.setSize(500,600);
		frame.setLayout(null);
		frame.setVisible(true);

		JButton bt = new JButton("PRESS");
		frame.add(bt);
		bt.setBounds(150,200,220,50);

		bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e){	
				System.out.println("Hello");
			}
		});
	}



	public static void main(String [] args){
		main m = new main();
		m.Object();
	}
}

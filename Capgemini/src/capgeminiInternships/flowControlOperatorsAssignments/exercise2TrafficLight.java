package capgeminiInternships.flowControlOperatorsAssignments;

import javax.swing.*;
import java.awt.event.*;

class light extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton jRadioButton1,jRadioButton2,jRadioButton3;
	JButton jButton;
	ButtonGroup G1;

	public light() {
		this.setLayout(null);
		jRadioButton1 = new JRadioButton();
		jRadioButton2 = new JRadioButton();
		jRadioButton3 = new JRadioButton();
		jButton = new JButton("Click");
		G1 = new ButtonGroup();
		jRadioButton1.setText("Red");
		jRadioButton2.setText("Yellow");
		jRadioButton3.setText("Green");
		jRadioButton1.setBounds(50, 30, 80, 50);
		jRadioButton2.setBounds(150, 30, 80, 50);
		jRadioButton3.setBounds(250, 30, 80, 50);
		jButton.setBounds(125, 90, 80, 30);
		this.add(jRadioButton1);
		this.add(jRadioButton2);
		this.add(jRadioButton3);
		this.add(jButton);
		G1.add(jRadioButton1);
		G1.add(jRadioButton2);
		G1.add(jRadioButton3);
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String qual = " ";
				if (jRadioButton1.isSelected()) {
					qual = "stop";
				} else if (jRadioButton2.isSelected()) {
					qual = "ready";
				} else if (jRadioButton3.isSelected()) {
					qual = "go";
				} else {
					qual = "No button selected";
				}
				JOptionPane.showMessageDialog(light.this, qual);
			}
		});
	}
}

public class exercise2TrafficLight {
	public static void main(String a[]) throws Exception {
		light f = new light();
		f.setBounds(700, 200, 400, 200);
		f.setTitle("Traffic Lights");
		f.setVisible(true);
	}
}

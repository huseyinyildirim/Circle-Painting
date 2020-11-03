package p4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class Frm extends JFrame implements ActionListener {
	private JPanel p;
	private JButton b1, b2;
	private Graphics g;
	private boolean flag; 
	
	public Frm() {
		this.setTitle("Paint");
		this.setSize(300, 200);
		
		p = new JPanel();
		this.add(p);
		
		b1 = new JButton("ÇÝZ");
		b2 = new JButton("BOYA");
		p.add(b1);
		p.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		flag = false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		g = this.getGraphics();
		if(e.getSource() == b1) {
			g.drawOval(110, 75, 100, 100);
		} else if(e.getSource() == b2) {
			if(!flag) {
				g.setColor(Color.RED);
				flag = true;
			} else {
				g.setColor(this.getBackground());
				flag = false;
			}
			
			g.fillOval(110, 75, 100, 100);
		}
	}
	
	
}

public class Main {

	public static void main(String[] args) {
		Frm f1 = new Frm();
		f1.setVisible(true);		
	}

}

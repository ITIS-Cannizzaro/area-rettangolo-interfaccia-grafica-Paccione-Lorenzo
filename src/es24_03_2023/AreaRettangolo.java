package es24_03_2023;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AreaRettangolo extends JFrame implements ActionListener {
	JLabel base= new JLabel("Base: ");
	JTextArea b= new JTextArea(1,1);
	JLabel altezza= new JLabel("Altezza: ");
	JTextArea a= new JTextArea(1,1);
	JLabel risultato= new JLabel("");
	JTextArea r= new JTextArea(1,1);
	JButton inserisci= new JButton("Calcola");
	JButton cancella= new JButton("Cancella");
	
	public AreaRettangolo() {
		super("Area");
		Container c =this.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(base);
		c.add(b);
		c.add(altezza);
		c.add(a);
		c.add(risultato);
		c.add(r);
		c.add(inserisci);
		inserisci.addActionListener(this);
		c.add(cancella);
		cancella.addActionListener(this);
		setTitle("Calcola area rettangolo");
		setSize(300,150);
		
		
		
		
		
		
		}
	public void calcola() {
		double base= Double.parseDouble(a.getText());
		double altezza= Double.parseDouble(b.getText());
		double Area=base*altezza;
		r.setText(Double.toString(Area));
	}
	public void cancella() {
		b.setText("");
		a.setText("");
		r.setText("");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==inserisci) {
			calcola();
			
		}
		if(e.getSource()==cancella) {
			cancella();
		}
		
	}
		
}	
	

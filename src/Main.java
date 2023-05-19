import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener{
	
	private ArrayList<Integer> l;
	
	JTextArea aggiungi= new JTextArea();
	JTextArea risultato= new JTextArea();
	
	JButton Aggiungi= new JButton("Aggiungi");
	JButton Rimuovi= new JButton("Rimuovi");
	JButton Visualizza= new JButton("Visualizza");
	
	JLabel Inserisci=new JLabel("Inserisci un numero:");
	
	public void funzioni() {
		
		l = new ArrayList<>();
		
		Container cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(Aggiungi);
		cont.add(aggiungi);
		
		
		Aggiungi.setHorizontalTextPosition(Aggiungi.LEFT);
		aggiungi.setPreferredSize(new Dimension(250,20));
		Aggiungi.addActionListener(e -> junta());
		
		Visualizza.setHorizontalTextPosition(Visualizza.LEFT);
		risultato.setPreferredSize(new Dimension(250,20));
		
		Rimuovi.setHorizontalTextPosition(Rimuovi.LEFT);
		Rimuovi.addActionListener(e -> cancella());
		
		setSize(400,400);
		setVisible(true);
		setResizable(false);
		
	}
	
	public void junta() {
		for(int i; i<l.size(); i++) {
			//non aggiunge i numeri inseriti nella JTextArea "aggiungi" all'ArrayList "l"!!
			
		}
	}
	
	public void cancella() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Visualizza) {
			junta();
		}
		if(e.getSource()==Rimuovi) {
			cancella();
		}
	}
	
	public static void main(String[] args) {
		
		//Il codice non visualizza la GUI perché non hai chiamato il metodo "funzioni()" qui nel main.
		
	}
	
}



import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame implements ActionListener{
	
	ArrayList<Integer> l;
	
	JTextArea aggiungi= new JTextArea();
	JTextArea risultato= new JTextArea();
	
	JButton Aggiungi= new JButton("Aggiungi");
	JButton Rimuovi= new JButton("Rimuovi");
	JButton Visualizza= new JButton("Visualizza");
	
	JLabel Inserisci=new JLabel("Inserisci un numero:");
	
	public Main() {
		super("Verifica");
		
		l = new ArrayList<>();
		
		Container cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(Inserisci);
		cont.add(aggiungi);
		cont.add(Aggiungi);
		cont.add(Rimuovi);
		cont.add(Visualizza);
		cont.add(risultato);
		
		Aggiungi.setHorizontalTextPosition(Aggiungi.LEFT);
		aggiungi.setPreferredSize(new Dimension(250,20));
		Aggiungi.addActionListener(e -> junta());
		
		Visualizza.setHorizontalTextPosition(Visualizza.LEFT);
		risultato.setPreferredSize(new Dimension(250,20));
		Visualizza.addActionListener(e-> stampa());
		
		Rimuovi.setHorizontalTextPosition(Rimuovi.LEFT);
		Rimuovi.addActionListener(e -> cancella());
		
		setSize(400,300);
		setVisible(true);
		setResizable(false);
		
	}
	
	public int num(int n) {
		return (int)l.get(n);
	}
	
	public void junta() {
		int n=Integer.parseInt(aggiungi.getText());
		l.add(n);
		for(int j = 0; j<l.size(); j++) {
			int f=num(j);
			if (n<f) {
				int x=f;
				l.set(j, n);
				n=x;
				j++;
			}
			if (n>f)
				l.set(j, n);
		}
		aggiungi.setText("");
			//non aggiunge i numeri inseriti nella JTextArea "aggiungi" all'ArrayList "l"!!
	}
	
	public void cancella() {
		
	}
	
	public void stampa() {
		String k=" ";
		for(int i=0; i<l.size(); i++)
		{
			k=k + l.get(i) + " ";
		}
		risultato.setText(k);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Aggiungi) {
			junta();
		}
		if(e.getSource()==Rimuovi) {
			cancella();
		}
		if(e.getSource()==Visualizza) {
			stampa();
		}
	}
	
	public static void main(String[] args) {
		Main frame =new Main();
		//Il codice non visualizza la GUI perché non hai chiamato il metodo "funzioni()" qui nel main.
		
	}
	
}

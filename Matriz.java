package Interfaz;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Matriz extends JFrame{
	public Matriz() {
		setTitle("Juego"); 
		setSize(600,700);
		Matriz_puntos puntos=new Matriz_puntos();
		add(puntos);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz matriz=new Matriz();
		matriz.setVisible(true);
	}
	class Matriz_puntos extends JPanel{
	    ArrayList<Point> lista = new ArrayList<Point>();


		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawLine(0, 100, 100, 100);
			for (int i=0;i<600;i+=100) {
				for (int j=100;j<700;j+=100) {
			g.drawRect(i,j, 5, 5);
			lista.add(new Point(i,j));
			if(lista.size()>1) {
				System.out.println("hola");
			}
			
		}
	}}}
}

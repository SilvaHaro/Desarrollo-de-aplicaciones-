package Unidad1;
 
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class ventana1 extends JFrame
{

	public ventana1()
	{
		super("Titulo de la ventana");
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	public static void main(String []args) 
	{
		
		
		ventana1 ventana=new ventana1();
		
	}
	
}

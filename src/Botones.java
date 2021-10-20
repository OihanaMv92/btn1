import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Botones implements WindowListener,
ActionListener
{
	// Ventana1
				Frame Ventana1= new Frame("Ventana 1.");
				Frame Ventana2= new Frame("Ventana 2");
	//Vetana2			
				Button btnNext= new Button("Next:");
				Button btnSalir = new Button("salir");
				Label Prueba = new Label ("Hola compañero!");
				Label Ventana2L = new Label("Ventana dos Aqui estamos!");
				public Botones()
				{
					Ventana1.setLayout(new FlowLayout()); // añadir distribucion
					Ventana1.add(btnNext);
					Ventana1.add(btnSalir);
					Ventana1.addWindowListener(this);
					Ventana1.add(Prueba);
					btnNext.addActionListener(this);
					btnSalir.addActionListener(this);
					Ventana1.setResizable(false);// no poder maximizar
					Ventana1.setBackground(Color.cyan);//Un poco de color no hace daño
					Ventana1.setSize(200,100);
					Ventana1.setLocationRelativeTo(null);//Ventana centrada
					Ventana1.setVisible(true);

					Ventana2.setLayout(new FlowLayout()); // añadir distribucion
					Ventana2.addWindowListener(this);
					Ventana2.setResizable(false);// no poder maximizar
					Ventana2.setBackground(Color.green);//Un poco de color no hace daño
					Ventana2.setSize(200,100);
					Ventana2.setLocationRelativeTo(null);//Ventana centrada
					Ventana2.add(Ventana2L);
					//Aquí no es donde quieres que se haga visible
					//Ventana2.setVisible(true);
					
					
				}
				
				public static void main(String[] args)
				{
					new Botones();
				}
				@Override
				public void actionPerformed(ActionEvent evento)
				{
					if(evento.getSource().equals(btnNext)) 
					{ 
						//Ahora sobra porque antes no era visible
						//Ventana2.setVisible(false);
						//Cambio por (true) al ejecutar la acción del botón
						Ventana2.setVisible(true);
						Ventana1.setVisible(false); // Asi desaparece la de atras
						
					}
					else if(evento.getSource().equals(btnSalir)) {
					System.exit(0);
					}	
					
				}

				@Override
				public void windowOpened(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowClosing(WindowEvent even)
				{
					//Me gusta renombrar los eventos para que no haya confusiones a posteriori
					if (Ventana1.isActive())
					{
						Ventana1.setVisible(false);
					}
					else if (Ventana2.isActive())
					{
						Ventana1.setVisible(false);
						Ventana2.setVisible(false);
					}
					
				}

				@Override
				public void windowClosed(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowIconified(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeiconified(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowActivated(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}

				@Override
				public void windowDeactivated(WindowEvent e)
				{
					// TODO Auto-generated method stub
					
				}
		}

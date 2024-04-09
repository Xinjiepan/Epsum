package epsum.proyecto.pantalla;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VerVentana extends Frame{

	

	private Panel PSuperior, PInferior, PIzquierda, PCentral, PSuperiorIzquierda, PInferiorIzquierda;
	private Button BRegistrar, BEnviar;
	private Label LNick, LMensaje, LUsuarios;
	private TextField TNick;
	private TextArea  TAMensajes, TMensaje, ListaUsuario ;
	
	public VerVentana() {
		setSize(500,500);
		PSuperior = new Panel();
		BRegistrar = new Button("Registrar");
		TNick = new TextField(10);
		LNick = new Label("Nick :");
		BorderLayout borderLayout = new BorderLayout();		
		setLayout(new BorderLayout());
		add(PSuperior,BorderLayout.NORTH);
		
		PSuperior.add(LNick);
		PSuperior.add(TNick);
		PSuperior.add(BRegistrar);
		
		PInferior = new Panel();
		BEnviar = new Button("Enviar");
		TMensaje = new TextArea(1,10);
		LMensaje = new Label("Mensaje :");
		add(PInferior,BorderLayout.SOUTH);
		
		PInferior.add(BEnviar);
		PInferior.add(TMensaje);
		PInferior.add(LMensaje);
		
		PIzquierda = new Panel();
		PSuperiorIzquierda = new Panel();
		PInferiorIzquierda = new Panel();
		LUsuarios = new Label("Usuarios");
		ListaUsuario = new TextArea(1,10);
		
		add(PIzquierda,BorderLayout.WEST);
		PIzquierda.add(PSuperiorIzquierda);
		PIzquierda.add(PInferiorIzquierda);
		
		PSuperiorIzquierda.add(LUsuarios);
		PInferiorIzquierda.add(ListaUsuario);
		
		PCentral = new Panel();
		TAMensajes = new TextArea(50, 100);
		add(PCentral,BorderLayout.CENTER);
		PCentral.add(TAMensajes);
		
		
	}
	
}


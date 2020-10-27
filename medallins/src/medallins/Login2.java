package medallins;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Login2 extends JFrame {

	private JPanel contentPane;
	public JTextField txtUser;
	public JTextField txtPassword;
	public ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();

	public void anadirUsuarios()
	{
		Usuarios usuario1 = new Usuarios();
		usuario1.setNombre("Admin");
		usuario1.setPassword("SoyElAdmin");;
		Usuarios usuario2 = new Usuarios();
		usuario2.setNombre("noAdmin");
		usuario2.setPassword("NoSoyElAdmin");
		usuarios.add(usuario1);
		usuarios.add(usuario2);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Login2 frame = new Login2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login2() {
		anadirUsuarios();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setBounds(162, 59, 86, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(183, 35, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(162, 115, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(172, 90, 65, 14);
		contentPane.add(lblNewLabel_1);
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(162, 167, 89, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean correcto = false;
				String nombre = txtUser.getText();
				String Password = txtPassword.getText();
				for(Usuarios user:usuarios) {


					if(nombre.contains(user.getNombre()) && Password.contains(user.getPassword())) {
						JOptionPane.showMessageDialog(null, "Login correcto");
						correcto = true;
					
					}
				}
				if(!correcto) {
					JOptionPane.showMessageDialog(null, "Login incorrecto");
				} 
			}
		});
	}

}

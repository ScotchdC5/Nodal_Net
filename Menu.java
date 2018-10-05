import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 204, 287);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblNodalNet = new JLabel("NODAL NET");
		lblNodalNet.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblNodalNet.setBounds(10, 11, 181, 56);
		frmMenu.getContentPane().add(lblNodalNet);
		
		JButton btnNewButton = new JButton("New Network");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(35, 78, 105, 23);
		frmMenu.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Open Network");
		btnNewButton_1.setBounds(35, 136, 105, 23);
		frmMenu.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Quit");
		btnNewButton_2.setBounds(35, 194, 101, 23);
		frmMenu.getContentPane().add(btnNewButton_2);
	}
}

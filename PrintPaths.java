import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PrintPaths {

	private JFrame frmPaths;

	/**
	 * Launch the application.
	 */
	public static void PrintActivity() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintPaths window = new PrintPaths();
					window.frmPaths.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrintPaths() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPaths = new JFrame();
		frmPaths.setTitle("Paths");
		frmPaths.setBounds(100, 100, 451, 330);
		frmPaths.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPaths.getContentPane().setLayout(null);
		
		JTextPane txtpnAbcdf = new JTextPane();
		txtpnAbcdf.setText("A->B->C->D->F               Duration: 30\r\nA->B->C->D->E               Duration: 34");
		txtpnAbcdf.setBounds(10, 29, 414, 221);
		frmPaths.getContentPane().add(txtpnAbcdf);
		
		JLabel lblCurrentPaths = new JLabel("Current Paths");
		lblCurrentPaths.setBounds(10, 11, 78, 14);
		frmPaths.getContentPane().add(lblCurrentPaths);
		
		JButton btnNewButton = new JButton("Close");
		btnNewButton.setBounds(346, 257, 78, 23);
		frmPaths.getContentPane().add(btnNewButton);
	}
}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

public class RemoveActivity {

	private JFrame frmRemoveActivity;

	/**
	 * Launch the application.
	 */
	public static void RemoveScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveActivity window = new RemoveActivity();
					window.frmRemoveActivity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RemoveActivity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRemoveActivity = new JFrame();
		frmRemoveActivity.setTitle("Remove");
		frmRemoveActivity.setBounds(100, 100, 217, 147);
		frmRemoveActivity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRemoveActivity.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 40, 181, 20);
		frmRemoveActivity.getContentPane().add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Activity Name");
		lblNewLabel.setBounds(10, 15, 90, 14);
		frmRemoveActivity.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.setBounds(102, 74, 89, 23);
		frmRemoveActivity.getContentPane().add(btnNewButton);
	}
}

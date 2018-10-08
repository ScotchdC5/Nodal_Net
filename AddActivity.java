import java.awt.EventQueue;

import javax.swing.JFrame;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AddActivity {

	private JFrame frmAddActivity;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void AddScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddActivity window = new AddActivity();
					window.frmAddActivity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddActivity() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddActivity = new JFrame();
		frmAddActivity.setTitle("Add Activity");
		frmAddActivity.setBounds(100, 100, 230, 282);
		frmAddActivity.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddActivity.getContentPane().setLayout(null);
		
		JLabel lblNode = new JLabel("Activity Name");
		lblNode.setBounds(10, 26, 71, 14);
		frmAddActivity.getContentPane().add(lblNode);
		
		JLabel lblNewLabel = new JLabel("Dependencies");
		lblNewLabel.setBounds(10, 84, 82, 14);
		frmAddActivity.getContentPane().add(lblNewLabel);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(10, 145, 46, 14);
		frmAddActivity.getContentPane().add(lblDuration);
		
		textField = new JTextField();
		textField.setBounds(10, 51, 86, 20);
		frmAddActivity.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 109, 86, 20);
		frmAddActivity.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 170, 86, 20);
		frmAddActivity.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(115, 209, 89, 23);
		frmAddActivity.getContentPane().add(btnAdd);
	}
}

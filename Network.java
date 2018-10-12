import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Network {

	private JFrame frmNodalNet;
	private JTextField txtProjectName;
	private JTextField addActivityName;
	private JTextField addDependencies;
	private JTextField addDuration;
	private String dependenciesText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Network window = new Network();
					window.frmNodalNet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Network() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNodalNet = new JFrame();
		frmNodalNet.setTitle("NODAL NET");
		frmNodalNet.setBounds(100, 100, 589, 414);
		frmNodalNet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNodalNet.getContentPane().setLayout(null);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(500, 342, 62, 23);
		frmNodalNet.getContentPane().add(btnQuit);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(500, 308, 62, 23);
		frmNodalNet.getContentPane().add(btnHelp);
		
		JButton btnAddActivity = new JButton("Add Activity");
		btnAddActivity.setBounds(445, 66, 117, 23);
		frmNodalNet.getContentPane().add(btnAddActivity);
		
		txtProjectName = new JTextField();
		txtProjectName.setBounds(214, 11, 165, 46);
		frmNodalNet.getContentPane().add(txtProjectName);
		txtProjectName.setBackground(SystemColor.control);
		txtProjectName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtProjectName.setText("NODAL NET");
		txtProjectName.setColumns(10);
		
		JButton btnRemoveActivity = new JButton("Remove Activity");
		btnRemoveActivity.setBounds(445, 100, 117, 23);
		frmNodalNet.getContentPane().add(btnRemoveActivity);
		
		JButton btnPrintPaths = new JButton("Print Paths");
		btnPrintPaths.setBounds(445, 134, 117, 23);
		frmNodalNet.getContentPane().add(btnPrintPaths);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.setBounds(445, 168, 117, 23);
		frmNodalNet.getContentPane().add(btnRestart);
		
		JButton btnNewButton = new JButton("About");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(500, 277, 62, 23);
		frmNodalNet.getContentPane().add(btnNewButton);
		
		JTextArea activityList = new JTextArea();
		activityList.setText("Activity\t\tDependencies\t\tDuration");
		activityList.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		activityList.setBounds(10, 65, 389, 235);
		frmNodalNet.getContentPane().add(activityList);
		
		JLabel lblActivity = new JLabel("Activity");
		lblActivity.setBounds(10, 312, 46, 14);
		frmNodalNet.getContentPane().add(lblActivity);
		
		JLabel lblDependencies = new JLabel("Dependencies");
		lblDependencies.setBounds(159, 312, 81, 14);
		frmNodalNet.getContentPane().add(lblDependencies);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(309, 312, 46, 14);
		frmNodalNet.getContentPane().add(lblDuration);
		
		addActivityName = new JTextField();
		addActivityName.setBounds(10, 328, 86, 20);
		frmNodalNet.getContentPane().add(addActivityName);
		addActivityName.setColumns(10);
		
		addDependencies = new JTextField();
		addDependencies.setBounds(159, 328, 86, 20);
		frmNodalNet.getContentPane().add(addDependencies);
		addDependencies.setColumns(10);
		
		addDuration = new JTextField();
		addDuration.setBounds(309, 328, 86, 20);
		frmNodalNet.getContentPane().add(addDuration);
		addDuration.setColumns(10);
		btnPrintPaths.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnRemoveActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnAddActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				Activity newActivity = new Activity();
				newActivity.name = addActivityName.getText();
				newActivity.dependency = addDependencies.getText();
				newActivity.duration = Integer.parseInt(addDuration.getText());
				
				
				
			}
		});
	}
}

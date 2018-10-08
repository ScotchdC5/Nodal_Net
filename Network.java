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

public class Network {

	private JFrame frmNodalNet;
	private JTextField txtProjectName;

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
		frmNodalNet.setBounds(100, 100, 319, 300);
		frmNodalNet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNodalNet.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(-6, -16, 320, 284);
		frmNodalNet.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnRemoveActivity = new JButton("Remove Activity");
		btnRemoveActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RemoveActivity RemoveOpen = new RemoveActivity();
				RemoveOpen.RemoveScreen();
				
			}
		});
		btnRemoveActivity.setBounds(22, 135, 117, 23);
		panel.add(btnRemoveActivity);
		
		JButton btnAddActivity = new JButton("Add Activity");
		btnAddActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddActivity AddOpen = new AddActivity();
				AddOpen.AddScreen();
				
			}
		});
		btnAddActivity.setBounds(22, 85, 117, 23);
		panel.add(btnAddActivity);
		
		JButton btnPrintPaths = new JButton("Print Paths");
		btnPrintPaths.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrintPaths PrintOpen = new PrintPaths();
				PrintOpen.PrintActivity();
				
			}
		});
		btnPrintPaths.setBounds(185, 85, 117, 23);
		panel.add(btnPrintPaths);
		
		JButton btnFinish = new JButton("Finish");
		btnFinish.setBounds(185, 135, 117, 23);
		panel.add(btnFinish);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.setBounds(185, 183, 117, 23);
		panel.add(btnRestart);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setBounds(22, 237, 62, 23);
		panel.add(btnHelp);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(249, 237, 53, 23);
		panel.add(btnQuit);
		
		txtProjectName = new JTextField();
		txtProjectName.setBackground(SystemColor.control);
		txtProjectName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtProjectName.setText("NODAL NET");
		txtProjectName.setBounds(78, 32, 165, 46);
		panel.add(txtProjectName);
		txtProjectName.setColumns(10);
	}
}

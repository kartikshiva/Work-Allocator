package mysql;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;

public class sec extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;
	private JScrollPane scrollPane_1;
	private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sec frame = new sec();
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
	public sec() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 809, 562);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(95, 158, 160));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProjectArea = new JLabel("PROJECT AREA");
		lblProjectArea.setBounds(100, 13, 577, 42);
		lblProjectArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblProjectArea.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblProjectArea);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 53, 736, 91);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Times New Roman", Font.BOLD, 16));
		scrollPane.setViewportView(textArea);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(29, 159, 736, 298);
		contentPane.add(scrollPane_1);
		
		textArea_1 = new JTextArea();
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		scrollPane_1.setViewportView(textArea_1);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(668, 477, 97, 25);
		contentPane.add(btnSubmit);
	}
}
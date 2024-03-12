package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 428, 222);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCounter = new JButton("Count");
		btnCounter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(textField.getText());
				
				a++;
//				textField.setText(a+"");
				textField.setText(String.valueOf(a));
			}
		});
		btnCounter.setBounds(152, 123, 89, 23);
		contentPane.add(btnCounter);
		
		JLabel lblCount = new JLabel("Counter");
		lblCount.setBounds(74, 77, 75, 33);
		contentPane.add(lblCount);
		
		textField = new JTextField();
		textField.setText("0");
		textField.setEditable(false);
		textField.setBounds(155, 74, 109, 38);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}

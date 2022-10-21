package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.AccountDao;
import init.Contains;
import init.Message;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;
	
	private AccountDao accountDao = new AccountDao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 523, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		username = new JTextField();
		username.setBounds(183, 74, 256, 33);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(183, 134, 256, 33);
		contentPane.add(password);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(96, 83, 77, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(96, 143, 77, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnngNhp = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnngNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(accountDao.login(username.getText(), password.getText()) == null) {
					Message.showMessage("Tai khoan hoac mat khau khong chinh xac");
				}
				else {
					setVisible(false);
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								home frame = new home();
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
					System.out.println(Contains.accountLogged);
				}
			}
		});
		btnngNhp.setBounds(207, 196, 109, 24);
		contentPane.add(btnngNhp);
		
		JLabel lblQunLBn = new JLabel("Qu\u1EA3n L\u00FD B\u00E1n H\u00E0ng");
		lblQunLBn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQunLBn.setBounds(182, 11, 161, 33);
		contentPane.add(lblQunLBn);
	}
}

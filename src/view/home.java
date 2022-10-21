package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import image.IconButton;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Icon;
public class home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public home() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 489);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 158, 450);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnSnPhm = new JButton("S\u1EA3n Ph\u1EA9m");
		btnSnPhm.setIcon(IconButton.getIcon("image/icon1.png"));
		btnSnPhm.setBounds(10, 71, 138, 43);
		panel.add(btnSnPhm);
		
		JButton btnKhchHng = new JButton("Kh\u00E1ch h\u00E0ng");
		btnKhchHng.setBounds(10, 125, 138, 43);
		panel.add(btnKhchHng);
		
		JButton btnNhnVin = new JButton("Nh\u00E2n vi\u00EAn");
		btnNhnVin.setBounds(10, 179, 138, 43);
		panel.add(btnNhnVin);
		
		JButton btnnHng = new JButton("\u0110\u01A1n h\u00E0ng");
		btnnHng.setBounds(10, 233, 138, 43);
		panel.add(btnnHng);
		
		JButton btnBoCo = new JButton("B\u00E1o c\u00E1o");
		btnBoCo.setBounds(10, 284, 138, 43);
		panel.add(btnBoCo);
		
		JButton btnngXut = new JButton("\u0110\u0103ng xu\u1EA5t");
		btnngXut.setBounds(10, 340, 138, 43);
		panel.add(btnngXut);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(158, 0, 692, 37);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblQunLSn = new JLabel("Qu\u1EA3n L\u00FD S\u1EA3n Ph\u1EA9m");
		lblQunLSn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQunLSn.setBounds(260, 11, 175, 25);
		panel_1.add(lblQunLSn);
			
	}
}

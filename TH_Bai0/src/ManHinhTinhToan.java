import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKq;


	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(136, 47, 217, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(136, 106, 217, 20);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setBackground(new Color(255, 255, 255));
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(302, 44, 290, 26);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBackground(Color.WHITE);
		txtB.setBounds(302, 103, 290, 26);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly phep Cong
				//Viet lenh o mot thu tuc, ham roi goi o day
				xuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(66, 173, 96, 35);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(210, 173, 96, 35);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyNhan();

			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(364, 173, 96, 35);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyChia();

			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(525, 173, 96, 35);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(136, 252, 130, 20);
		contentPane.add(lblKtQuTnh);
		
		txtKq = new JTextField();
		txtKq.setForeground(Color.RED);
		txtKq.setEditable(false);
		txtKq.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKq.setColumns(10);
		txtKq.setBackground(Color.WHITE);
		txtKq.setBounds(302, 255, 290, 26);
		contentPane.add(txtKq);
	}
	
	void xuLyCong()
	{

		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		
		double tong = soA + soB;
		txtKq.setText(String.valueOf(tong));
	}
	
	void xuLyTru()
	{
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		
		double hieu = soA - soB;
		txtKq.setText(String.valueOf(hieu));
	}
	void xuLyNhan()
	{
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		
		double tich = soA * soB;
		txtKq.setText(String.valueOf(tich));
	}
	void xuLyChia()
	{
		double soA = Double.parseDouble(txtA.getText());
		double soB = Double.parseDouble(txtB.getText());
		double thuong;
		if (soB != 0)
		{
			thuong = soA / soB;
			txtKq.setText(String.valueOf(thuong));
		}else
			txtKq.setText("Không chia được");

		
	}
}

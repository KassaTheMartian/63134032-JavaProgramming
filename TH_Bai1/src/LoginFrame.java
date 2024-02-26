import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JTextField txtMatKhau;


	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(65, 59, 148, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("MẬT KHẨU");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(65, 135, 148, 36);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(223, 59, 232, 36);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		txtMatKhau = new JTextField();
		txtMatKhau.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMatKhau.setColumns(10);
		txtMatKhau.setBounds(223, 135, 232, 36);
		contentPane.add(txtMatKhau);
		
		JButton bntDangNhap = new JButton("ĐĂNG NHẬP");
		bntDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xuLyDangNhap();
			}
		});
		bntDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		bntDangNhap.setBounds(186, 205, 153, 42);
		contentPane.add(bntDangNhap);
	}
	
	public void xuLyDangNhap() 
	{
		// Lay ten dang nhap va mat khau
		String strTen = txtTenDangNhap.getText();
		String strMk = txtMatKhau.getText();
		
		if (strTen.equals("63CNTT") && strMk.equals("123"))
		{
			// Hien home page
			new HomeFrame().setVisible(true);
			// An trang dang nhap
			this.setVisible(false);
		} else {
			txtTenDangNhap.setText("");
			txtMatKhau.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng");
		}
	}
}

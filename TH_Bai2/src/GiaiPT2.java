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

import java.lang.Math;
import javax.swing.JTextArea;

public class GiaiPT2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextArea txtNghiem;

	/**
	 * Create the frame.
	 */
	public GiaiPT2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("x^2 +");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(177, 87, 67, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblX = new JLabel("x + ");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX.setBounds(319, 87, 37, 20);
		contentPane.add(lblX);
		
		JLabel lblX_1 = new JLabel("= 0");
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblX_1.setBounds(427, 87, 37, 20);
		contentPane.add(lblX_1);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(106, 84, 51, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(244, 84, 51, 31);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(366, 84, 51, 31);
		contentPane.add(txtC);
		
		JButton btnNghiem = new JButton("Tìm nghiệm");
		btnNghiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				giaiPT2();
			}
		});
		btnNghiem.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNghiem.setBounds(195, 157, 173, 36);
		contentPane.add(btnNghiem);
		
		txtNghiem = new JTextArea();
		txtNghiem.setFont(new Font("Monospaced", Font.PLAIN, 16));
		txtNghiem.setBounds(106, 223, 358, 91);
		contentPane.add(txtNghiem);
	}
	
	public void giaiPT2()
	{

		try {
			double a = Double.parseDouble(txtA.getText());
		    double b = Double.parseDouble(txtB.getText());
		    double c = Double.parseDouble(txtC.getText());
		    
			double detal = b*b-4*a*c;
			
			if (detal < 0) txtNghiem.setText("Phương trình vô nghiệm");
			if (detal == 0) 
			{
				txtNghiem.setText("Phương trình có nghiệm kép: " + (-b/(2*a)));
			}
			if (detal > 0)
			{
				txtNghiem.setText("Phương trình có hai nghiệm:" + "\nX1:\t" + (-b-Math.sqrt(detal)/(2*a) + "\nX2:\t" + (-b+Math.sqrt(detal)/(2*a))));
			}
		
		} catch (NumberFormatException e) {
		    // Xử lý ngoại lệ NumberFormatException ở đây
		    // Ví dụ: Hiển thị một thông báo lỗi
		    JOptionPane.showMessageDialog(null, "Các giá trị nhập không hợp lệ. Vui lòng nhập lại số.");
		}
		

	}
}

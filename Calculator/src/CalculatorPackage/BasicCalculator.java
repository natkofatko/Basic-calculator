package CalculatorPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BasicCalculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNUmber; 
	double secondNumber; 
	double result; 
	String operations; 
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BasicCalculator window = new BasicCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BasicCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 13, 214, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn7.setBounds(0, 50, 55, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn8.setBounds(66, 50, 55, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn9.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn9.setBounds(133, 50, 55, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 firstNUmber = Double.parseDouble(textField.getText()); 
				 textField.setText("");
				 operations = "+"; 
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_plus.setBounds(200, 48, 55, 50);
		frame.getContentPane().add(btn_plus);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn4.setBounds(0, 113, 55, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn5.setBounds(66, 113, 55, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn6.setBounds(133, 113, 55, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNUmber = Double.parseDouble(textField.getText()); 
				 textField.setText("");
				 operations = "-"; 
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_minus.setBounds(199, 111, 55, 50);
		frame.getContentPane().add(btn_minus);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn1.setBounds(0, 176, 55, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn2.setBounds(66, 176, 55, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn3.setBounds(133, 176, 55, 50);
		frame.getContentPane().add(btn3);
		
		JButton btn_multiply = new JButton("*");
		btn_multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNUmber = Double.parseDouble(textField.getText()); 
				 textField.setText("");
				 operations = "*"; 
			}
		});
		btn_multiply.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_multiply.setBounds(200, 174, 55, 50);
		frame.getContentPane().add(btn_multiply);
		
		JButton btn_plusMinus = new JButton("+-");
		btn_plusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText())); 
				ops = ops * (-1); 
				textField.setText(String.valueOf(ops));
				
			}
		});
		btn_plusMinus.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_plusMinus.setBounds(0, 239, 55, 50);
		frame.getContentPane().add(btn_plusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn0.getText(); 
				textField.setText(EnterNumber);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn0.setBounds(66, 239, 55, 50);
		frame.getContentPane().add(btn0);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_dot.setBounds(133, 239, 55, 50);
		frame.getContentPane().add(btn_dot);
		
		JButton btn_equal = new JButton("/");
		btn_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNUmber = Double.parseDouble(textField.getText()); 
				 textField.setText("");
				 operations = "/"; 
			}
		});
		btn_equal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_equal.setBounds(200, 239, 55, 50);
		frame.getContentPane().add(btn_equal);
		
		JButton buttonArrow = new JButton("<-");
		buttonArrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		buttonArrow.setFont(new Font("Tahoma", Font.BOLD, 15));
		buttonArrow.setBounds(0, 302, 55, 50);
		frame.getContentPane().add(buttonArrow);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnC.setBounds(66, 302, 55, 50);
		frame.getContentPane().add(btnC);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNUmber = Double.parseDouble(textField.getText()); 
				 textField.setText("");
				 operations = "%"; 
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercent.setBounds(133, 302, 55, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton button = new JButton("=");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String answer;
			secondNumber = Double.parseDouble((textField.getText()));
			if(operations== "+")
			{
				
			result = firstNUmber + secondNumber; 
			answer = String.format("%.2f", result);
			textField.setText(answer);
			
			}
			else if(operations== "-")
			{
				
			result = firstNUmber - secondNumber; 
			answer = String.format("%.2f", result); 
			textField.setText(answer);
			} 
			else if(operations== "*")
			{
				
			result = firstNUmber * secondNumber; 
			answer = String.format("%.2f", result); 
			textField.setText(answer);
			} 
			else if(operations== "/")
			{
				
			result = firstNUmber / secondNumber; 
			answer = String.format("%.2f", result); 
			textField.setText(answer);
			} 
			else if(operations== "%")
			{
				
			result = firstNUmber % secondNumber; 
			answer = String.format("%.2f", result); 
			textField.setText(answer);
			} 
			}
			
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(200, 302, 55, 50);
		frame.getContentPane().add(button);
	}
}

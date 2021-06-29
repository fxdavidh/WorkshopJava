import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CreateMenu extends JFrame {
	
	JTextField nameTxt, priceTxt;
	ButtonGroup btnGroup;
	JRadioButton coffee, tea;

	private void initFrame() {		
		setSize(500, 500);
		setVisible(true);
		setLayout(new GridLayout(0, 2));
		
		initComponents();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 200);
	}
	
	private void initComponents() {
		JLabel nameLbl, typeLbl, priceLbl;
		JButton saveBtn, cancelBtn;
		
		nameLbl = new JLabel("Name");
		nameTxt = new JTextField();
		
		typeLbl = new JLabel("Type");
		
		priceLbl = new JLabel("Price");
		priceTxt = new JTextField();
		
		saveBtn = new JButton("Save");
		cancelBtn = new JButton("Cancel");
		
		saveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				saveData();
			}
		});
		
		add(nameLbl);
		add(nameTxt);
		add(typeLbl);
		initRadioButton();
		add(priceLbl);
		add(priceTxt);
		add(saveBtn);
		add(cancelBtn);
	}
	
	private void initRadioButton() {
		JPanel panelType = new JPanel();
		
		panelType.setLayout(new FlowLayout());
		btnGroup = new ButtonGroup();
		coffee = new JRadioButton("Coffee");
		tea = new JRadioButton("Tea");
		
		coffee.setActionCommand("coffee");
		tea.setActionCommand("tea");
		
		btnGroup.add(coffee);
		btnGroup.add(tea);
		
		panelType.add(coffee);
		panelType.add(tea);
		
		add(panelType);
		
	}
	
	private void saveData() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Name : " + nameTxt.getText() + "\n" +
				"Type : " + btnGroup.getSelection().getActionCommand() + "\n" +
				"Price : " + priceTxt.getText());
	}
	
	public CreateMenu() {
		initFrame();
	}

	
	
}

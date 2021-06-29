import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainMenu {

	JFrame fr;
	
	private void initFrame() {
		fr = new JFrame("My First GUI");
		
		fr.setSize(500, 500);
		fr.setVisible(true);
		fr.setLayout(null);
		
		initComponents();
		
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocation(100, 200);
	}
	
	private void initComponents() {
		JButton createBtn = new JButton("Create");
		JButton viewBtn = new JButton("View");
		JButton updateBtn = new JButton("Update");
		JButton deleteBtn = new JButton("Delete");

		createBtn.setBounds(200, 60, 100, 50);
		viewBtn.setBounds(200, 140, 100, 50);
		updateBtn.setBounds(200, 220, 100, 50);
		deleteBtn.setBounds(200, 300, 100, 50);
		
		createBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false);
				new CreateMenu();
			}
		});
		
		fr.add(createBtn);
		fr.add(viewBtn);
		fr.add(updateBtn);
		fr.add(deleteBtn);
	}
	
	public MainMenu() {
		initFrame();
	}

}

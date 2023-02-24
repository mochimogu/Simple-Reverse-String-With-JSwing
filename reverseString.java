import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class reverseString implements ActionListener, KeyListener{

    JPanel panel2 = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel3 = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
    JTextArea text = new JTextArea();
    JTextField textField1;
    JTextField textField2;
    JLabel label = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    GroupLayout layout;
    
    
    
    public reverseString() {
    
        label1.setText("Reverse Word");
        label.setText("Enter Your Word");
        textField1 = new JTextField();
        textField1.setColumns(10);
        button = new JButton("Enter");

        button.addActionListener(this);
        //panel1 features:
        panel1.add(label1);
        panel1.setBackground(Color.LIGHT_GRAY);
        panel2.add(label);
        panel2.add(textField1);
        panel2.add(button);
        panel3.add(label2);
         //frame features:
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel3, BorderLayout.SOUTH);
        frame.setSize(500, 500);
        frame.setVisible(true); 
        frame.setTitle("Reverse String");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField1.addKeyListener(this);


    }

    public String reverseStr(String word) {
        char ch[] = word.toCharArray();
        String newStr = " ";
        for(int i = ch.length-1; i >= 0; i--) {
            newStr += ch[i];
        }
        return newStr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button) {
            // System.out.println("Button is pressed");
            String word = textField1.getText();
            System.out.println("The word in reverse is: " + reverseStr(word));
            label2.setText("Your Reverse Word is: " + reverseStr(word));
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            String word = textField1.getText();
            System.out.println("The word in reverse is: " + reverseStr(word));
            label2.setText("Your Reverse Word is: " + reverseStr(word));

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // System.out.println("key is released: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new reverseString();
    }
    
}

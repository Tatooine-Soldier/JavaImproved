import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class LoginGUI implements ActionListener {
    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    public static void main(String[] args) {
        JPanel panel = new JPanel();                          //panel is the layout of the frame;
        JFrame frame = new JFrame();                         //frame is the window that pops up;
        frame.setSize(350,200);                                
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);                                    //add panel to the frame, so that things can be displayed;

        panel.setLayout(null);
        
        userlabel = new JLabel("User");                //label is "user";
        userlabel.setBounds(10, 20, 80, 25);                  //params, x y width height;
        panel.add(userlabel);                                    //add the label to the layout ;

        userText = new JTextField(20);              //the param means length of textfield eg. 20;
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);                                 //add the textfield to the layout; 

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);              //50 as y means it will be below user label;
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");               //written on button;
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LoginGUI());            //ties button to the class and method below
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {          //this is run whenever button clicked;
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Tom") && password.equals("ye")) {
            success.setText("Login success");
        }

    }
}
import javax.swing.JOptionPane;

public class apples {
    public static void main(String[] args) {

        JOptionPane.showConfirmDialog(null, "Do you want to begin?", "Yee", JOptionPane.CANCEL_OPTION);     //asks to confirm begin
        String name = JOptionPane.showInputDialog("Type your name: ");     //reads in as a string
        String fn = JOptionPane.showInputDialog("Enter first number: ");
        String sn = JOptionPane.showInputDialog("Enter second number: ");

        int first = Integer.parseInt(fn);                    // convert to int
        int second = Integer.parseInt(sn);
        int sum = first + second;

        JOptionPane.showMessageDialog(null, "The sum of " + first + " and " + second + " is " + sum, name + "'s calculator", JOptionPane.PLAIN_MESSAGE);
    }
}

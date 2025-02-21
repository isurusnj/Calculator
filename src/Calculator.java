import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton [] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[10];
    JButton[] addButtons,subbuttons,mulButtons,divButtons;
    JButton decButton,eqeButton,delButton,clrButton;
    JPanel panel;

    Font font = new Font("Arial", Font.PLAIN, 12);
    double num1=0,num2=0,result=0;
    Calculator(){
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {

    }

}

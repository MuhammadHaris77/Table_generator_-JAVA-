import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("enter your name?");
         int number = Integer.parseInt(input);
        for (int i = 1 ; i <= 10 ; i++   ){

            System.out.println( number + "x"+ i + " = " + i * number);
        }
 //       JOptionPane.showMessageDialog(null,"your name is " + input);

        System.exit(0);

    }
}
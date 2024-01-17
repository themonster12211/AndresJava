import javax.swing.*;

public class reverseString {

    public static String reverseString(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static String getString() {
        String input;
        input = JOptionPane.showInputDialog("Please enter a phrase or sentence: ");
        return input;
    }

    public static void main(String[] args) {
        String userInput = getString();
        String reversedInput = reverseString(userInput);
        JOptionPane.showMessageDialog(null, "The message you typed in backwards is: " + reversedInput);
    }
}

import javax.swing.JOptionPane;

public class passwordVerifier
{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Please type in a valid password: ");


        if (isValid(input))
        {
            JOptionPane.showMessageDialog(null,"you have met all the requirements for a valid password");
        } else {
            JOptionPane.showMessageDialog(null,"That is not a proper format");
            JOptionPane.showMessageDialog(null,"Here are the requirements:");
            JOptionPane.showMessageDialog(null,"The password should be at least 8 characters long, contain at least one upper and lowercase letter\n"
            + " The password should have at least one digit \n"
            + "The password should use one of the following special characters:   !@#$%^&*");
        }
    }
    
    
    private static boolean isValid(String passVerify)
    {
        
        if (passVerify.length() > 7){ 
            System.out.print("Password is valid so far: ");
        }else {
            System.out.print("Password is invalid, please try again");
        }
        boolean hasUppercase = false;
        boolean hasNum = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        char[] specialCharacters = {'!','@','#','$','%','^','&','*'};  
        for (char c : passVerify.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            }
            if (Character.isLowerCase(c)){
                hasLower = true;
            }        
            if (Character.isDigit(c)){
                hasNum = true;
            }
        }
        for (char c : specialCharacters){
            if (passVerify.contains(Character.toString(c))){
                hasSpecial = true; 
                break;
            }
        }
        
        if (hasUppercase == true && hasNum == true && hasLower == true && hasSpecial == true){
            System.out.println("This password is valid!");
            return true;
        }else{
            return false;
        }
    }
        
}
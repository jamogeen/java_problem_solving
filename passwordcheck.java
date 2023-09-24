import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean isvalid = false;
        int count = 0;
        while(!isvalid)
        {
            if (count != 0){
                System.out.println("Invalid password!");
                System.out.println("A valid password must have:\n" +
                        "-At least 10 characters\n" +
                        "- At least one uppercase letter\n" +
                        "- At least one lowercase letter\n" +
                        "- At least one digit\n" +
                        "- At least one \"special\" character\n");
                System.out.println("Re-enter password below:");
            }
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter your password :");
            // String password
            String password = myObj.nextLine();
            isvalid = Validatepassword(password);
            count ++;
        }
        System.out.println("Password meets all requirements.");
    }

    public static boolean Validatepassword(String password)
    {
        String passowrdcode= password;
        int passlenght = passowrdcode.length();
        if(passlenght >= 10)
        {
            char[] chars = passowrdcode.toCharArray();
            StringBuilder num = new StringBuilder();
            StringBuilder lcase = new StringBuilder();
            StringBuilder Ucase = new StringBuilder();
            StringBuilder schar = new StringBuilder();
            for(char l : chars){
                if(Character.isDigit(l)){
                    num.append(l);
                }
                if(Character.isLowerCase(l)){
                    lcase.append(l);
                }
                if(Character.isUpperCase(l)){
                    Ucase.append(l);
                }
                if(!Character.isDigit(l) && !Character.isLetter(l) && !Character.isSpace(l)){
                    schar.append(l);
                }
            }
            if (!num.toString().isEmpty() && !lcase.toString().isEmpty() && !Ucase.toString().isEmpty() && !schar.toString().isEmpty()) {
            } else {
                return false;
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}


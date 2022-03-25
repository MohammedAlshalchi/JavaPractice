package InterviewQuestions;

public class PasswordValidationTask {
 /*
 1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
  */


    public static void main(String[] args) {
        String password = "Mohammed#@7789";
      boolean result  = validationPassword(password);
        System.out.println(result);
    }



    public static boolean validationPassword (String password){

       boolean  hasLowerCaseChar = password.matches("(.*[a-z].*)"),
                hasUpperCaseChar = password.matches("(.*[A-Z].*)"),
                hasSpecialChar   = password.matches("(.*[ -/, :-@].*)");

if (password.length() >= 6 && !password.contains(" ")){
    if (hasLowerCaseChar && hasUpperCaseChar && hasSpecialChar){
        return true;
    }
}




return false;
    }
}

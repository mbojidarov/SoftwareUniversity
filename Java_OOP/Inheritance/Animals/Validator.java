package Animals;

public class Validator {

    public static boolean isNotValidName(String string){

        return string == null || string.trim().isEmpty();
    }

    public static boolean isNotValidAge(int age){
        return age < 0 || String.valueOf(age).trim().isEmpty();
    }
}

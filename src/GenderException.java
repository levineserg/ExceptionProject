public class GenderException {
    public static char genderException(String str)  {
        if (str.equals("f") || str.equals("m")) {
            return str.charAt(0);
        } else throw new RuntimeException();
    }
}

public class ValidatePhoneNumber {


    public static void main(String[] args) {
        String PHONE_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
        String phone1 = "(84)-(0978489648)";
        String phone2 = "(a4)-(2978489648)";
        System.out.println(phone1.matches(PHONE_REGEX));
        System.out.println(phone2.matches(PHONE_REGEX));
    }
}

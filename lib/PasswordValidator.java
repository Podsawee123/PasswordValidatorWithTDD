package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password
     * return strangth
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    
    public static PasswordStrength validate(String password) {
        int minLength = 8;

        if (password == null || password.length() < minLength) {
            return PasswordStrength.INVALID;
        }

        boolean Num = false;
        boolean Upper = false;
        boolean Lower = false;
        boolean Special = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                Num = true;
            } else if (Character.isUpperCase(c)) {
                Upper = true;
            } else if (Character.isLowerCase(c)) {
                Lower = true;
            } else {
                Special = true;
            }
        }

        if (Special && Upper && Lower && Num) {
            return PasswordStrength.STRONG;
        } else if (Upper && Lower && Num) {
            return PasswordStrength.MEDIUM;
        } else {
            return PasswordStrength.WEAK;
        }
    }
}

package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @return 
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        
        int minLength = 8; // TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        
        if (password==null || password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        boolean Num = false;
        boolean Upper = false;
        boolean Lower = false;
        boolean Special = false;

        for(char c : password.toCharArray()) {
            if(Character.isDigit(c)){
                Num = true;
            }
             else if(Character.isUpperCase(c)){
                Upper = true;
            }
            else if(Character.isLowerCase(c)){
                Lower = true;
            }
            else {
                Special = true;
            }
        if(Special && Upper && Lower && Num){
            return PasswordStrength.STRONG;
        }else if(Upper && Lower && Num){
            return PasswordStrength.MEDIUM;
        }else{
            return PasswordStrength.WEAK;

         // TODO: การคืนค่านี้ถูกต้องหรือไม่?
    }
}
        return null;
    }
}

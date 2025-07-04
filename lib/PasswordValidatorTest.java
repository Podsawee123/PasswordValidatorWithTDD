package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw = "123";
        PasswordStrength result1 = PasswordValidator.validate(pw);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: "+pw+" Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: "+pw+" Expected INVALID but got " + result1);
        }

        // Test Case 2: ตัวอักษรพิมพ์เล็กอย่างเดียว WEAK
        pw = "abcdefghij";
        PasswordStrength result2 = PasswordValidator.validate(pw);
         if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: "+pw+" Only lowercase is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: "+pw+" Expected INVALID but got " + result2);
        }

        // Test Case 3: ตัวเลขอย่างเดียว WEAK
        pw = "12345678";
        PasswordStrength result3 = PasswordValidator.validate(pw);
         if (result3 == PasswordStrength.WEAK) {
            System.out.println("Test Case 3 Passed: "+pw+" Only number is WEAK.");
        } else {
            System.out.println("Test Case 3 FAILED: "+pw+" Expected INVALID but got " + result3);
        }

        // Test Case 4: ตัวพิมพ์ใหญ่,ตัวพิมเล็กและตัวเลข MDIUM
        pw = "Abcd2345";
        PasswordStrength result4 = PasswordValidator.validate(pw);
         if (result4 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 4 Passed: "+pw+" Uppercase,lowercase and number are MEDIUM.");
        } else {
            System.out.println("Test Case 4 FAILED: "+pw+" Expected INVALID but got " + result4);
        }

        // Test Case 5: ตัวอักษรพิเศษมตัวพิมพ์ใหญ่,ตัวพิมเล็กและตัวเลข STRONG
        pw = "@Abc1234";
        PasswordStrength result5 = PasswordValidator.validate(pw);
         if (result5 == PasswordStrength.STRONG) {
            System.out.println("Test Case 5 Passed: "+pw+" SpecialCharacter,uppercase,lowercase and number are STRONG.");
        } else {
            System.out.println("Test Case 5 FAILED: "+pw+" Expected INVALID but got " + result5);
        }


        System.out.println("--------------------------------");
    }
}

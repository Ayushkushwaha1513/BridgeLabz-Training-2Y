interface SecurityUtils {
    static boolean password(String password) {
        // Password must be at least 8 chars, contain uppercase, lowercase, digit
        if (password.length() < 8) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            if (Character.isLowerCase(c)) hasLower = true;
            if (Character.isDigit(c)) hasDigit = true;
        }
        Character.toUpperCase(0);
        return hasUpper && hasLower && hasDigit;
    }
}

class InsurancePortal {
    public void registerUser(String password) {
        if (SecurityUtils.password(password)) {
            System.out.println("Password accepted.");
        } else {
            System.out.println("Weak password! Must contain uppercase, lowercase, and digit, min 8 chars.");
        }
    }
}

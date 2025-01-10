// 31. Write a Java program to create a class Mobile (type, phone_no). 
// Customize the exception such that if the user gives phone_no having less 
// than or greater than 10 digits, then the program has to throw an exception 
// with the message "Invalid Phone Number".

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}

class Mobile {
    private String type;
    private String phoneNo;

    public Mobile(String type, String phoneNo) throws InvalidPhoneNumberException {
        if (phoneNo.length() != 10) {
            throw new InvalidPhoneNumberException("Invalid Phone Number: " + phoneNo);
        }
        this.type = type;
        this.phoneNo = phoneNo;
    }

    public String getType() {
        return type;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    @Override
    public String toString() {
        return "Mobile[type=" + type + ", phoneNo=" + phoneNo + "]";
    }

    public static void main(String[] args) {
        try {
            // Valid phone number
            Mobile mobile1 = new Mobile("Smartphone", "1234567890");
            System.out.println(mobile1);

            // Invalid phone number
            Mobile mobile2 = new Mobile("Feature Phone", "12345");
            System.out.println(mobile2);
        } catch (InvalidPhoneNumberException e) {
            System.err.println(e.getMessage());
        }
    }
}

package designPatterns;

public class builderEmployees {
    private final String fullName; // required
    private final String role; // required
    private final String companyEmailAddress; // required
    private final String phoneNumber; // optional
    private final String additionalEmailAddress; // optional

    private builderEmployees (employeeBuilder builder) {
        this.fullName = builder.fullName;
        this.role = builder.role;
        this.companyEmailAddress = builder.companyEmailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.additionalEmailAddress = builder.additionalEmailAddress;
    }

    public String getFullName() {
        return fullName;
    }
    public String getRole() {
        return role;
    }
    public String getCompanyEmailAddress() {
        return companyEmailAddress;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAdditionalEmailAddress() {
        return additionalEmailAddress;
    }

    @Override
    public String toString() {
        return "Employee: "+this.fullName+", "+this.role+", "+this.companyEmailAddress+", "+this.phoneNumber+", "+this.additionalEmailAddress;
    }

    public static class employeeBuilder
    {
        private final String fullName;
        private final String role;
        private final String companyEmailAddress;
        private String phoneNumber;
        private String additionalEmailAddress;

        public employeeBuilder(String fullName, String role, String companyEmailAddress) {
            this.fullName = fullName;
            this.role = role;
            this.companyEmailAddress = companyEmailAddress;
        }
        public employeeBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public employeeBuilder additionalEmailAddress(String additionalEmailAddress) {
            this.additionalEmailAddress = additionalEmailAddress;
            return this;
        }

        public builderEmployees build() {
            builderEmployees employee =  new builderEmployees(this);
            return employee;
        }
    }
}

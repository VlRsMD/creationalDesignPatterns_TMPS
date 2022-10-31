package designPatterns;

public class prototypeEmployee implements prototype {
    public String fullName, role, companyEmailAddress, city;

    public prototypeEmployee() {}

    public  prototypeEmployee(String fullName, String role, String companyEmailAddress, String city) {
        this();
        this.fullName = fullName;
        this.role = role;
        this.companyEmailAddress = companyEmailAddress;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee: "+this.fullName+", "+this.role+", "+this.companyEmailAddress+", "+this.city;
    }

    @Override
    public prototype getClone() {
        return new prototypeEmployee(fullName, role, companyEmailAddress, city);
    }
}

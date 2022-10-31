package company;
import designPatterns.singletonCompanyName;
import designPatterns.prototypeEmployee;

public class smartwatchDepartment {
    public static void main(String[] args) {
        // get company name using singleton pattern
        singletonCompanyName companyTitle = singletonCompanyName.getInstance();
        String title = companyTitle.name;

        // create list of the employees of the smartwatch production department using prototype pattern
        prototypeEmployee employee1 = new prototypeEmployee("Karl Neumann", "Project Manager", "karl.neumann@smarttech.de", "Bremen");

        prototypeEmployee employee2 = (prototypeEmployee)employee1.getClone();
        employee2.fullName = "Karl Niederberger";
        employee2.role = "Full Stack Developer";
        employee2.companyEmailAddress = "karl.niederberger@smarttech.de";

        prototypeEmployee employee3 = (prototypeEmployee)employee1.getClone();
        employee3.fullName = "Ludwig Alterburg";
        employee3.role = "Frontend Developer";
        employee3.companyEmailAddress = "ludwig.alterburg@smarttech.de";

        prototypeEmployee employee4 = (prototypeEmployee)employee1.getClone();
        employee4.fullName = "Ronald Lichtendorf";
        employee4.role = "Backend Developer";
        employee4.companyEmailAddress = "ronald.lichtendorf@smarttech.de";

        prototypeEmployee employee5 = (prototypeEmployee)employee1.getClone();
        employee5.fullName = "Adolf Lehrmann";
        employee5.role = "Backend Developer";
        employee5.companyEmailAddress = "adolf.lehrmann@smarttech.de";

        prototypeEmployee employee6 = (prototypeEmployee)employee1.getClone();
        employee6.fullName = "Rudolf Stadtweg";
        employee6.role = "Hardware Engineer";
        employee6.companyEmailAddress = "rudolf.stadtweg@smarttech.de";

        prototypeEmployee employee7 = (prototypeEmployee)employee1.getClone();
        employee7.fullName = "Alexander Torberg";
        employee7.role = "Hardware Engineer";
        employee7.companyEmailAddress = "alexander.torberg@smarttech.de";


        System.out.println("Company: "+title+"\n");
        System.out.println("Department: Smartwatch production department"+"\n");
        System.out.println("List of employees: "+"\n");
        System.out.println(employee1+"\n"+employee2+"\n"+employee3+"\n"+employee4+"\n"+employee5+"\n"+employee6+"\n"+employee7);
    }
}

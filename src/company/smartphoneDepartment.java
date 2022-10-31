package company;
import designPatterns.singletonCompanyName;
import designPatterns.builderEmployees;

public class smartphoneDepartment {
    public static void main(String[] args) {
        // get company name using singleton pattern
        singletonCompanyName companyTitle = singletonCompanyName.getInstance();
        String title = companyTitle.name;

        // build list of the employees of the smartphone production department using builder pattern
        builderEmployees employee1 = new builderEmployees.employeeBuilder("Andreas Smith", "Project Manager", "andreas.smith@smarttech.de")
                .phoneNumber("+49 244 5678859")
                // no additional email address
                .build();
        builderEmployees employee2 = new builderEmployees.employeeBuilder("Wolfgang Kernberg", "Full Stack Developer", "wolfgang.kernberg@smarttech.de")
                .phoneNumber("+49 578 5799543")
                // no additional email address
                .build();
        builderEmployees employee3 = new builderEmployees.employeeBuilder("Karl Ludwigsen", "Frontend Developer", "karl.ludwigsen@smarttech.de")
                .phoneNumber("+49 329 4438757")
                .additionalEmailAddress("karl.ludwigsen@gmail.com")
                .build();
        builderEmployees employee4 = new builderEmployees.employeeBuilder("Thomas Gleisberg", "Backend Developer", "thomas.gleisberg@smarttech.de")
                // no phoneNumber
                .additionalEmailAddress("thomas.gleisberg@gmail.com")
                .build();
        builderEmployees employee5 = new builderEmployees.employeeBuilder("Olaf Torwald", "Backend Developer", "olaf.torwald@smarttech.de")
                .phoneNumber("+49 490 5719834")
                .additionalEmailAddress("olaf.torwald@gmail.com")
                .build();
        builderEmployees employee6 = new builderEmployees.employeeBuilder("Alexander Weissmann", "Hardware Engineer", "alexander.weissmann@smarttech.de")
                .phoneNumber("+49 379 4326590")
                // no additional email address
                .build();
        builderEmployees employee7 = new builderEmployees.employeeBuilder("Gerhard Reinberg", "Hardware Engineer", "gerhard.reinberg@smarttech.de")
                // no phone number
                // no additional email address
                .build();

        System.out.println("Company: "+title+"\n");
        System.out.println("Department: Smartphone production department"+"\n");
        System.out.println("List of employees: "+"\n");
        System.out.println(employee1+"\n"+employee2+"\n"+employee3+"\n"+employee4+"\n"+employee5+"\n"+employee6+"\n"+employee7);
    }
}

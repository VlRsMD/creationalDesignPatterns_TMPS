package company;
import designPatterns.singletonCompanyName;
import designPatterns.abstractFactory;
import designPatterns.deviceF;
import designPatterns.smartphoneFactoryF;
import designPatterns.smartwatchFactoryF;

public class products {
    public static void main(String[] args) {
        // get company name using singleton pattern
        singletonCompanyName companyTitle = singletonCompanyName.getInstance();
        String title = companyTitle.name;

        // types of products specified using Factory and Abstract Factory patterns
        deviceF smartphone = abstractFactory.getDevice(new smartphoneFactoryF("1920x1080","64 GB"));
        deviceF smartwatch = abstractFactory.getDevice(new smartwatchFactoryF("320x320","32 GB"));

        System.out.println("Company: "+title+"\n");
        System.out.println("Smartphone parameters: "+smartphone);
        System.out.println("Smartwatch parameters: "+smartwatch);
    }
}

package company;
import designPatterns.singletonCompanyName;
import designPatterns.abstractFactory;
import designPatterns.deviceAF;
import designPatterns.smartphoneFactoryAF;
import designPatterns.smartwatchFactoryAF;

public class products {
    public static void main(String[] args) {
        // get company name using singleton pattern
        singletonCompanyName companyTitle = singletonCompanyName.getInstance();
        String title = companyTitle.name;

        // types of products
        deviceAF smartphone = abstractFactory.getDevice(new smartphoneFactoryAF("1920x1080","64 GB"));
        deviceAF smartwatch = abstractFactory.getDevice(new smartwatchFactoryAF("320x320","32 GB"));

        System.out.println("Company: "+title+"\n");
        System.out.println("Smartphone parameters: "+smartphone);
        System.out.println("Smartwatch parameters: "+smartwatch);
    }
}

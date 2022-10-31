package designPatterns;

public class singletonCompanyName {
    private static singletonCompanyName title = new singletonCompanyName();
    public String name;
    //Creating private constructor
    private singletonCompanyName()
    {
        name = "SmartTech GmbH";
    }
    public static singletonCompanyName getInstance()
    {
        return title;
    }
}

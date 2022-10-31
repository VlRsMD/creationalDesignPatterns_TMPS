package designPatterns;

public class smartphoneFactoryAF implements deviceAbstractFactory {
    private String display;
    private String memory;

    public smartphoneFactoryAF(String display, String memory){
        this.display=display;
        this.memory=memory;
    }
    @Override
    public deviceAF createDevice() {
        return new smartphoneAF(display, memory);
    }
}

package designPatterns;

public class smartwatchFactoryAF implements deviceAbstractFactory {
    private String display;
    private String memory;

    public smartwatchFactoryAF(String display, String memory){
        this.display=display;
        this.memory=memory;
    }
    @Override
    public deviceAF createDevice() {
        return new smartwatchAF(display, memory);
    }
}

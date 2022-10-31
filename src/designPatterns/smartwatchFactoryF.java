package designPatterns;

public class smartwatchFactoryF implements deviceAbstractFactory {
    private String display;
    private String memory;

    public smartwatchFactoryF(String display, String memory){
        this.display=display;
        this.memory=memory;
    }
    @Override
    public deviceF createDevice() {
        return new smartwatchF(display, memory);
    }
}

package designPatterns;

public class smartphoneFactoryF implements deviceAbstractFactory {
    private String display;
    private String memory;

    public smartphoneFactoryF(String display, String memory){
        this.display=display;
        this.memory=memory;
    }
    @Override
    public deviceF createDevice() {
        return new smartphoneF(display, memory);
    }
}

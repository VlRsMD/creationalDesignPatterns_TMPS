package designPatterns;

public class smartphoneAF extends deviceAF {
    private String display;
    private String memory;

    public smartphoneAF(String display, String memory){
        this.display=display;
        this.memory=memory;
    }
    @Override
    public String getDisplay() {
        return this.display;
    }

    @Override
    public String getMemory() {
        return this.memory;
    }
}

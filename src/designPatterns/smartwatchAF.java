package designPatterns;

public class smartwatchAF extends deviceAF {
    private String display;
    private String memory;

    public smartwatchAF(String display, String memory){
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

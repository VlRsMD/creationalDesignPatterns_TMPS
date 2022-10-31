package designPatterns;

public class smartwatchF extends deviceF {
    private String display;
    private String memory;

    public smartwatchF(String display, String memory){
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

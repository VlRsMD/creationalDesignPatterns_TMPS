package designPatterns;

public abstract class deviceAF {
    public abstract String getDisplay();
    public abstract String getMemory();

    @Override
    public String toString(){
        return "Display = "+this.getDisplay()+", Memory = "+this.getMemory();
    }
}

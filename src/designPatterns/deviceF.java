package designPatterns;

public abstract class deviceF {
    public abstract String getDisplay();
    public abstract String getMemory();

    @Override
    public String toString(){
        return "Display = "+this.getDisplay()+", Memory = "+this.getMemory();
    }
}

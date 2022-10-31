package designPatterns;

public class abstractFactory {
    public static deviceF getDevice(deviceAbstractFactory factory) {
        return factory.createDevice();
    }
}

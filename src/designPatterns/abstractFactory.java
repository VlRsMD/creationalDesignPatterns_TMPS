package designPatterns;

public class abstractFactory {
    public static deviceAF getDevice(deviceAbstractFactory factory) {
        return factory.createDevice();
    }
}

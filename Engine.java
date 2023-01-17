public class Engine {
    public final enum EngineType;
    private final double value;
    private final int power;

    public Engine(int engineType, double value, int power) {
        EngineType = engineType;
        this.value = value;
        this.power = power;
    }

}

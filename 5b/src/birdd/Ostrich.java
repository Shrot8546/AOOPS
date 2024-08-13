package birdd;

public class Ostrich implements Bird {
    @Override
    public void fly() {
        throw new RuntimeException("Ostriches cannot fly!");
    }
}
package workers;
public class Main {
    public static void main(String[] args) {
        Worker worker = new Robot();
        worker.work();

        Eater eater = new Human();
        eater.eat();
    }
}
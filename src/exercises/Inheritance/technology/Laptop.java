package exercises.Inheritance.technology;

public class Laptop extends Computer{
    private double weight;
    public Laptop(int storage, int ram, String cpu, int size, double weight, String Mac) {
        super(storage, ram, cpu, size, Mac);
        this.weight = weight;
    }

    public boolean isClunky() {
        return weight > 5.0 ;

    }
    public void connectToInternet() {
        System.out.println("Your Laptop is connected to Internet");

    }
}

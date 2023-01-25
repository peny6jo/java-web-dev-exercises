package exercises.Inheritance.technology;

public class Computer extends Device  {
    private int ram;
    private  int storage;
    private int size;
    private String cpu;

    public void setIP( int ip){
        IP = ip;
    }
    public int getIP(){
        return IP;
    }
    public int getMACAddress(){
        return getMACAddress();
    }
    public String getCpu(){
        return cpu;
    }
    public void setCpu( String newCpu){
        this.cpu = newCpu;
    }

    public Computer(int storage, int ram, String cpu, int size, String Mac) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.cpu = cpu;
        this.size =size;
        this.MACAddress = Mac ;
    }
    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }
    private void changeCpu(String newCpu){
        setCpu(newCpu);

    }

    public void connectToInternet() {
        System.out.println("Your Computer is connected to Internet");

    }

    public void watchVideo(String video) {
    System.out.println("Just a minute to find the video" + video);
    }
}

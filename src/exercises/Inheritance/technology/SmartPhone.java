package exercises.Inheritance.technology;

public class SmartPhone extends Device{
    private int photos;
    public void takePhoto() {
        this.photos = this.photos + 1;
    }

    public int getNumberOfPhoto() {
        return this.photos;
    }
    public void connectToInternet() {
        System.out.println("Your SmartPhone is connected");
    }


    public void watchVideo(String video) {
        System.out.println("Just a minute to find the video and present in your Smartphone" + video);
    }
}

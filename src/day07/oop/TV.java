package day07.oop;

public class TV {
    String color;
    int channel;

    public TV() {
        color="gray";
        channel=11;
    }
    public TV(String color) {
        this.color = color;
    }
    public TV(int channel) {
        this.channel = channel;
    }
    public TV(String color, int channel) {
        this.color = color;
        this.channel = channel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    //output

    public void display() {
        System.out.println(color + ", " + channel);
    }
}

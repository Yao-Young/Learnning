package SE.design_pattern.P6_Command.receiver;

public class Light {

    public void on() {
        System.out.println("the light turn on!");
    }

    public void off() {
        System.out.println("the light turn off");
    }

    public void up() {
        System.out.println("the light power up");
    }

    public void down() {
        System.out.println("the light power down");
    }


}

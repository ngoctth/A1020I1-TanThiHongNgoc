package _05_class_object.bai_tap.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }

}

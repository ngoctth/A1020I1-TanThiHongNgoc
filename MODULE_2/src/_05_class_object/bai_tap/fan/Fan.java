package _05_class_object.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString(){
        if(on){
            return ("Speed: " +speed+"\n"+"Color: " + color+ "\n"+ "Radius: " + radius+ "\n"+"Fan is on.");

        }else{
            return ("Color: " + color+"\n"+"Radius: " +radius+"\n"+"Fan is off.");
        }
    }
}

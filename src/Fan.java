public class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    int speed = SLOW;;
    boolean on = false;
    double radius = 5;
    String color = "blue";

    public Fan() {}

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void turnOn() {
        on = true;
    }
    public void turnOff() {
        on = false;
    }
    public boolean isOn() {
        return on;
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
    public String toString() {
        if (on) {
            return "Fan status: speed - " + speed
                                + ", radius - " + radius
                                + ", color - " + color
                                + ", Fan is on.";
        } else {
            return "Fan status: radius - " + radius
                    + ", color - " + color
                    + ", Fan is off.";
        }
    }
}

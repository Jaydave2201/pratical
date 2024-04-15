public class practical10 {
    private final int MAX_SPEED;
    private int currentSpeed;

    public practical10(int maxSpeed) {
        this.MAX_SPEED = maxSpeed;
        this.currentSpeed = 0;
    }

    public void accelerate(int speedIncrease) {
        if (currentSpeed + speedIncrease <= MAX_SPEED) {
            currentSpeed += speedIncrease;
            System.out.println("Car accelerated to " + currentSpeed + " km/h");
        } else {
            System.out.println("Cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h");
        }
    }

    public void decelerate(int speedDecrease) {
        if (currentSpeed - speedDecrease >= 0) {
            currentSpeed -= speedDecrease;
            System.out.println("Car decelerated to " + currentSpeed + " km/h");
        } else {
            System.out.println("Car cannot decelerate below 0 km/h");
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public static void main(String[] args) {
        practical10 myCar = new practical10(200);
        myCar.accelerate(50);
        myCar.decelerate(20);
        myCar.accelerate(250);
    }
}

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + " takes off in the sky.");
        }

    }

    @Override
    public int ascend(int altitude) {
        this.altitude = this.altitude + altitude;
        System.out.println(this.getName() + " flies upward, altitude : " + this.altitude);
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println("It glides into the air.");
    }

    @Override
    public int descend(int altitude) {
        if (this.flying && this.altitude > 1) {
            this.altitude = this.altitude - altitude;
            System.out.println(this.getName() + " flies downward, altitude : " + this.altitude);
        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.getAltitude() <= 1) {
            this.flying = false;
            if (this.flying) {
                System.out.println(this.getName() + " is too high, it can't lands.");
            }
            System.out.println(this.getName() + " lands on the ground.");
        }
    }
}

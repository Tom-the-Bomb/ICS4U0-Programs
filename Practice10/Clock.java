import java.util.*;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public Clock(int totalSeconds) {
        setClock(totalSeconds);
    }

    public void setClock(int totalSeconds) {
        hours = Math.floorDiv(totalSeconds, 3600);
        totalSeconds = Math.floorMod(totalSeconds, 3600);
        minutes = Math.floorDiv(totalSeconds, 60);
        seconds = Math.floorMod(totalSeconds, 60);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = Math.floorMod(hours, 24);
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = Math.floorMod(minutes, 60);
        setHours(hours + Math.floorDiv(minutes, 60));
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = Math.floorMod(seconds, 60);
        setMinutes(minutes + Math.floorDiv(seconds, 60));
    }

    public void tick() {
        setSeconds(seconds + 1);
    }

    public void tickDown() {
        setSeconds(seconds - 1);
    }

    public void addClock(Clock clock) {
        setHours(hours + clock.getHours());
        setMinutes(minutes + clock.getMinutes());
        setSeconds(seconds + clock.getSeconds());
    }

    public Clock addedClock(Clock clock) {
        Clock newClock = new Clock(hours, minutes, seconds);
        newClock.setHours(newClock.getHours() + clock.getHours());
        newClock.setMinutes(newClock.getMinutes() + clock.getMinutes());
        newClock.setSeconds(newClock.getSeconds() + clock.getSeconds());
        return newClock;
    }

    public void subtractClock(Clock clock) {
        setHours(hours - clock.getHours());
        setMinutes(minutes - clock.getMinutes());
        setSeconds(seconds - clock.getSeconds());
    }

    public Clock subtractedClock(Clock clock) {
        Clock newClock = new Clock(hours, minutes, seconds);
        newClock.setHours(newClock.getHours() - clock.getHours());
        newClock.setMinutes(newClock.getMinutes() - clock.getMinutes());
        newClock.setSeconds(newClock.getSeconds() - clock.getSeconds());
        return newClock;
    }

    public String toString() {
        return String.format("(%02d:%02d:%02d)", hours, minutes, seconds);
    }
}

class ClockDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Seconds since midnight: ");
        int totalSeconds = sc.nextInt();

        Clock firstClock = new Clock(totalSeconds);
        System.out.printf("First clock: %s%n%n", firstClock);

        for (int i = 1; i <= 10; i++) {
            firstClock.tick();
            System.out.printf("After tick %d: %s%n", i, firstClock);
        }

        System.out.print("\nSeconds: ");
        int s = sc.nextInt();
        System.out.print("Minutes: ");
        int m = sc.nextInt();
        System.out.print("Hours: ");
        int h = sc.nextInt();
        sc.close();

        Clock secondClock = new Clock(h, m, s);
        System.out.printf("Second clock: %s%n%n", secondClock);

        for (int i = 1; i <= 10; i++) {
            secondClock.tick();
            System.out.printf("After tick %d: %s%n", i, secondClock);
        }

        firstClock.addClock(secondClock);

        System.out.printf("%nFirst clock: %s%n", firstClock);
        System.out.printf("Second clock: %s%n%n", secondClock);

        Clock thirdClock = firstClock.subtractedClock(secondClock);

        System.out.printf("Third clock: %s", thirdClock);
    }
}

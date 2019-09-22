public class Time {

    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setTime(int hour, int minute, int seconds){
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        String hourFor = String.format("%02d",hour);
        String minuteFor = String.format("%02d",minute);
        String secondsFor = String.format("%02d",seconds);
        return "Time{" +
                "" + hourFor +
                ":" + minuteFor +
                ":" + secondsFor +
                '}';
    }
}

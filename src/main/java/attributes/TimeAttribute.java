package attributes;

class TimeAttribute extends AbstractAttribute<Integer> {
    static {
        SECONDS_IN_DAY = 60 * 60 * 24;
        SECONDS_IN_HOUR = 60 * 60;
        SECONDS_IN_MINUTES = 60;
    }

    private static final int SECONDS_IN_DAY, SECONDS_IN_HOUR, SECONDS_IN_MINUTES;

    public TimeAttribute(int seconds, int minutes, int hour) {
        this(seconds + SECONDS_IN_MINUTES * minutes + SECONDS_IN_HOUR * hour);
    }

    public TimeAttribute(int seconds) {
        super(seconds);
        //if (seconds <= 0) throw new IllegalArgumentException("seconds must be not negative");
        //if (seconds <= 0) System.exit(999);
        value = seconds % SECONDS_IN_DAY;
    }

    public int hours() {
        return value / SECONDS_IN_HOUR;
    }

    public int minutes() {
        return (value % SECONDS_IN_HOUR) / SECONDS_IN_MINUTES;
    }

    public int seconds() {
        return value % SECONDS_IN_MINUTES;
    }

    public int howManyMinutesLeftAfterHour() {
        return (value - SECONDS_IN_HOUR * hours()) / SECONDS_IN_MINUTES;
    }

    public int howManySecondsLeftAfterMinutes() {
        return seconds();
    }

    @Override
    public String name() {
        return "time";
    }

    @Override
    protected void checkValid(Integer seconds) {
        if (seconds < 0) throw new IllegalArgumentException("seconds must be not negative");
    }

    @Override
    public String toString() {
        return STR."\{name()} is \{hours()}:\{String.format("%02d",minutes())}:\{String.format("%02d",seconds())}";
    }
}

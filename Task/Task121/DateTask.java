package Task121;

public class DateTask {
    private byte day;
    private byte month;
    private short year;

    public DateTask() {
        this(1, 1, 1);
    }

    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    @Override
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            this.day = (byte) d;
            this.year = (short) y;
            this.month = (byte) m;
        } else {
            System.out.println("Attempting to create a non-valid date: " + m + "/" + d + "/" + y);
            this.day = (byte) 0;
            this.year = (short) 0;
            this.month = (byte) 0;
        }
    }

    public static void leapYears() {
        System.out.println("\n--- Leap Years between 1980 and 2023 ---");
        for (int i = 1980; i <= 2023; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year.");
            }
        }
        System.out.println("----------------------------------------");
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        if (valid(day, this.month, this.year)) {
            this.day = (byte) day;
        } else {
            System.out.println("Invalid day entered (" + day + "). Day not changed.");
        }
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (valid(this.day, month, this.year)) {
            this.month = (byte) month;
        } else {
            System.out.println("Invalid month entered (" + month + "). Month not changed.");
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        if (valid(this.day, this.month, year)) {
            this.year = (short) year;
        } else {
            System.out.println("Invalid year entered (" + year + "). Year not changed.");
        }
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            return false;
        }

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
                if (isLeapYear) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
        }
        return true;
    }
}
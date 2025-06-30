package Challenges.Enumchallenge;

public enum  days {
    Monday(true),
    Tuesday (true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false),
    Sunday(false);

   private final boolean isWeekday;

    days(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }
    public String getType(){
        return isWeekday?  "Weekday" : "Weekend";
}
}

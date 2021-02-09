package com.company.enumy;

public enum Month {
    JANUARY(31),
    FEBRUARY(29),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    private int days;

    public int getDays() {
        return days;
    }

    Month(int days) {
        this.days = days;
    }

    public static void whichIsFirst(Month one, Month two) {
        if (one.ordinal() < two.ordinal()) {
            System.out.println(one + " is before " + two);
        } else if (one.ordinal() > two.ordinal()) {
            System.out.println(two + " is before " + one);
        } else {
            System.out.println("This is the same month dude!");
        }
    }

    public static void whichIsLonger(Month one, Month two) {
        if (one.days < two.days) {
            System.out.println(one + " is shorter than " + two);
        } else if (one.days > two.days) {
            System.out.println(one + " is longer than " + two);
        } else {
            System.out.println("They are the same length dude!");
        }
    }
}

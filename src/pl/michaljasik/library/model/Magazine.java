package pl.michaljasik.library.model;

import java.util.Objects;

public class Magazine extends Publication {
    private int day;
    private int month;
    private String language;

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(title,publisher, year);
        this.day = day;
        this.month = month;
        this.language = language;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + month + ";" + day + ";" + language ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Magazine magazine = (Magazine) o;
        return day == magazine.day && month == magazine.month && Objects.equals(language, magazine.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), day, month, language);
    }
}

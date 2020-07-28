package ru.moodle.Appline.course.FourthQuestion.Sweets;

public class Candies extends Sweets {
    private String sprinkling;

    public Candies(String name, Double weight, Double price, String sprinkling) {
        super(name, weight, price);
        this.sprinkling = sprinkling;
    }

    public String getSprinkling() {
        return sprinkling;
    }

    public void setSprinkling(String sprinkling) {
        this.sprinkling = sprinkling;
    }

    @Override
    public String toString() {
        return "Candies{" + super.toString() +
                ", sprinkling='" + sprinkling + '}';
    }
}

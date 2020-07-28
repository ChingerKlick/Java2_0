package ru.moodle.Appline.course.FourthQuestion.Sweets;

public class Chocolate extends Sweets {
    private String filling;

    public Chocolate(String name, Double weight, Double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Chocolate{" + super.toString() +
                ", filling='" + filling + '}';
    }
}

package ru.moodle.Appline.course.FourthQuestion.Sweets;

public class Marmalade extends Sweets{
    private String form;

    public Marmalade(String name, Double weight, Double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Marmalade{" + super.toString() +
                ", form='" + form + '}';
    }
}

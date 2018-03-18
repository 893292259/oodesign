package chapter2;


import java.util.Observable;

public class Course extends Observable {
    private float math;
    private float chinese;
    private float english;
    public  void changescore(float math, float chinese, float english) {
        this.chinese = chinese;
        this.english = english;
        this.math = math;
        setChanged();
        notifyObservers();
    }


    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChinese() {
        return chinese;
    }

    public void setChinese(float chinese) {
        this.chinese = chinese;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

}

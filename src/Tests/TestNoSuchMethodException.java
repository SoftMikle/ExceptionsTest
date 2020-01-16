package Tests;


public class TestNoSuchMethodException {

    int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    void someMethod(){
        System.out.println("someMethod()");
    }

    int method(){
        return getScore();
    }
}

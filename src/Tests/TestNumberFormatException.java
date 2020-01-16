package Tests;

public class TestNumberFormatException {
    private int number;
    private String string;

    public TestNumberFormatException(int number, String string) {
        this.number = number;
        this.string = string;
    }

    public  int getStringToInteger(String s){
        int temp = Integer.parseInt(s);
        return temp;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}

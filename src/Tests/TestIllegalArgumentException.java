package Tests;

public class TestIllegalArgumentException {
    private int[] arr;
    private int n;

    public TestIllegalArgumentException(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public int getValueOfArr(int i) throws IllegalArgumentException {
        if(i < 0 || i > getArr().length){
            throw new IllegalArgumentException("This array member don`t exist");
        }
        return getArr()[i];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}

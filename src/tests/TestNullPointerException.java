package Tests;

public class TestNullPointerException {

    private Object someObject;

    public TestNullPointerException(Object someObject) {
        this.someObject = someObject;
    }

    public Object getWrongObject(){
        return null;
    }

    public Object getSomeObject(){
        return this.someObject;
    }

    public void setSomeObject(Object someObject) {
        this.someObject = someObject;
    }
}

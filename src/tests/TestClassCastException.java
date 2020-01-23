package Tests;

public class TestClassCastException {
    public String castToString(Object obj){
        String string = obj.toString();
        return string;
    }

    public Integer castToInteger(Object obj){
        Integer integer = (Integer) obj;
        return integer;
    }

    public TestClassCastException() {
    }
}

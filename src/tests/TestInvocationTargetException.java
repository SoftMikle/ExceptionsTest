package Tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestInvocationTargetException {
    private Method getMethod;
    private TestNoSuchMethodException noSuchMethodExc;

    public TestInvocationTargetException() {
        this.noSuchMethodExc = new TestNoSuchMethodException();
    }

    public void prepare(int score) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        getMethodOfNoSuchMethodTest().invoke(new TestRuntimeException(112), score);
    }

    public TestNoSuchMethodException getNoSuchMethodExc() {
        return noSuchMethodExc;
    }

    public Method getMethodOfNoSuchMethodTest() throws NoSuchMethodException {
        getMethod = TestNumberFormatException.class.getMethod("method");
        return getMethod;
    }
}

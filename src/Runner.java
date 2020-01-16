import Tests.*;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {

        Object object = new Object();
        TestNullPointerException test1 = new TestNullPointerException(object);
        try{
            String string = test1.getSomeObject().toString();
            System.out.println(string + " no errors");
            String string1 = test1.getWrongObject().toString();
        } catch (NullPointerException e){
            System.err.println(e.getMessage());
        }


        TestNumberFormatException test2 = new TestNumberFormatException(2, "99");
        try{
        System.out.println(test2.getStringToInteger(test2.getString()));
        test2.getStringToInteger("AC/DC");
        } catch (NumberFormatException e){
            System.err.println(e.getMessage());
        }


        TestIllegalArgumentException test3 = new TestIllegalArgumentException(new int[] {11, 22, 33}, 3);
        int temp = 0;
        try{
            temp = test3.getValueOfArr(2);
            System.out.println(temp);
            temp = test3.getValueOfArr( 2 - 4);
            System.out.println(temp);
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }


        Random random = new Random();
        try {
            TestRuntimeException test4 = new TestRuntimeException(random.nextInt(112));
            // if u ll enter wrong number - there will appear RuntimeException
        } catch (RuntimeException e){

            System.err.println(e.getMessage());
        }


        try {
            TestIllegalStateException test5 = new TestIllegalStateException(1280, 1800);
            test5.setHeightOfDisplayInPx(1044);
            test5.setWidthOfDisplayInPx(-1080);
        } catch (IllegalStateException e){
            System.err.println(e.getMessage());
        }


        try {
            TestNoSuchMethodException test6 = new TestNoSuchMethodException();
            test6.getClass().getDeclaredMethod("someMethod");
            test6.getClass().getDeclaredMethod("someElseMethod");

        } catch (NoSuchMethodException e){
            System.err.println(e.getMessage());
        }


        try {
            Object obj = new java.util.Date();
            TestClassCastException test7 = new TestClassCastException();
            test7.castToString(obj);
            test7.castToInteger(obj);
        } catch (ClassCastException e){
            System.err.println(e.getMessage());
        }


        try {
            TestParseException test8 = new TestParseException(12);
            TestParseException test8_1 = new TestParseException();
        } catch (ParseException e){
            System.err.println(e.getMessage());
        }


        try {
            TestInvocationTargetException test9 = new TestInvocationTargetException();
            test9.getMethodOfNoSuchMethodTest();
            test9.prepare(9992);
        } catch (NoSuchMethodException |IllegalAccessException |InvocationTargetException e){
            System.err.println(e.getMessage());
        }
    }
}

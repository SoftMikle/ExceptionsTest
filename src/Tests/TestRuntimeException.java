package Tests;

import java.util.Scanner;

public class TestRuntimeException {
    private int a;
    private int b;
    private Scanner scanner = new Scanner(System.in);

    public TestRuntimeException(int a) {
        this.a = a;
        System.out.println("Enter " + a + " from keyboard");
        this.b = scanner.nextInt();
        if(a != b){
            throw new RuntimeException("Wrong number entered");
        }
    }

    public TestRuntimeException(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

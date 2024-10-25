package exception.basic.unchecked;

public class Client {
    public void call() { // throws MyUncheckedException { // Unchecked 예외는 throws 선언을 하지 않아도 된다.
        throw new MyUncheckedException("ex");
    }
}

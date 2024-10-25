package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {
        //문제 상황
        throw new MyCheckedException("ex");
    }
}
/*
* 예외를 던지는 쪽에서는 try-catch를 작성하지 않을 수도 있습니다. 대신, 그 메서드가 예외를 던진다는 것을 메서드 선언부에 throws로 표시하여 호출자에게 이 예외를 처리할 책임이 있음을 알립니다.
	•	호출하는 쪽에서는 예외를 처리해야 하므로 try-catch를 사용하여 그 예외를 처리하게 됩니다.

다시 정리해보면:

	1.	예외를 던지는 쪽 (메서드 내부에서 예외 발생):
	•	예외를 발생시키고 던지기만 합니다.
	•	이쪽에서는 try-catch를 꼭 사용할 필요가 없습니다.
	•	메서드 선언부에 throws 키워드를 사용해서 예외가 발생할 가능성이 있다는 것을 알립니다.
	*
	* public class Client {
    public void performAction() throws MyCheckedException {
        // 문제가 생기면 예외를 던짐
        if (someProblemOccurs()) {
            throw new MyCheckedException("예외 발생!");
        }
    }
}
* 2.	예외를 처리하는 쪽 (메서드를 호출하는 쪽):
	•	예외를 던지는 메서드를 호출하는 쪽에서 그 예외를 처리합니다.
	•	try-catch를 사용해서 던져진 예외를 처리합니다. 예외를 처리하지 않으면 컴파일 에러가 발생하므로 호출하는 쪽에서는 반드시 try-catch로 예외를 처리해야 합니다.
	*
	* public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        try {
            client.performAction(); // 예외를 던질 수 있으므로 try-catch로 처리
        } catch (MyCheckedException e) {
            // 예외 처리 코드
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
* 중요한 점:

	•	예외를 던지는 메서드는 예외를 처리하지 않고 던지기만 할 수 있습니다. 메서드 선언부에 throws 키워드를 통해 예외 발생 가능성을 호출자에게 알립니다.
	•	예외를 처리하는 메서드 (호출자)는 그 예외를 반드시 try-catch로 처리하거나, 다시 상위로 던질 수 있습니다.

예외 처리를 상위로 넘기는 경우:

만약 호출자가 그 예외를 직접 처리하지 않고 상위로 다시 던지고 싶다면, try-catch 대신 throws 키워드를 사용하여 예외를 또 던질 수 있습니다.
* public class Main {
    public static void main(String[] args) throws MyCheckedException {
        Client client = new Client();
        client.performAction(); // 예외를 호출자에게 넘김 (여기서 처리하지 않음)
    }
}
*
* 이 경우, main 메서드에서 예외를 처리하지 않고 상위로 던지지만, 최종적으로 JVM까지 예외가 전파되면 프로그램이 중단됩니다. 일반적으로 상위 레벨에서는 반드시 예외를 처리해야 하므로, try-catch가 많이 사용됩니다.

결론:

	•	예외를 던지는 메서드는 try-catch를 작성하지 않아도 되고, 그 예외를 상위 호출자에게 던집니다.
	•	호출자는 그 예외를 try-catch로 반드시 처리해야 합니다. 예외를 직접 처리하지 않고 상위로 넘길 수도 있지만, 최종적으로는 처리해야 합니다.
* */
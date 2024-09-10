package lang.system;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간(밀리초)를 가져온다.
        long currentTime = System.currentTimeMillis();
        System.out.println("currentTime = " + currentTime);

        //현재 시간(나노초)를 가져온다.
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);

        //환경 변수를 읽는다.
        System.out.println("genenv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("getProperties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 빠르게 복사한다.
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);
        // 반복문으로 배열을 하나씩 복사하는 대신, System.arraycopy()를 사용하면 배열 전체를 한 번에 복사할 수 있다.
        // 이 메서드는 자바 내부에서 특별히 빠르게 작동하도록 설계되어 있어서, 반복문을 쓰는 것보다 더 빠를 수 있다.
        // 정확한 속도 차이는 여러 가지 조건에 따라 달라질 수 있지만, 일반적으로 큰 차이가 난다.
        // System.arraycopy()는 자바가 운영체제의 빠른 메모리 복사 기능을 사용하여 배열을 복사하며,
        // 배열의 타입과 위치가 올바른지 확인한 뒤, 데이터를 효율적으로 복사한다.



        // 배열을 출력한다.
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString(copiedArray) = " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(1);
        // 가급적 사용하는걸 권장하지 않는다. 왜냐하면, 프로그램이 종료되면서 자원을 해제하는 코드가 실행되지 않을 수 있기 때문이다.


    }
}
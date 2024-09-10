package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 시작 시간 읽기

        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java ";
        }
        long endTime = System.currentTimeMillis(); // 끝 시간 읽기

        System.out.println("result = " + result);
        System.out.println("time =  " + (endTime - startTime) + "ms");
    }
}

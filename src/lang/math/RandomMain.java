package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();
        //Random random = new Random(1); // seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt(); //int 범위 내의 랜덤한 정수
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble(); //0.0 ~ 1.0 사이의 랜덤한 double
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean(); //랜덤한 boolean
        System.out.println("randomBoolean = " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //0 ~ 9 사이의 랜덤한 정수
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1; //1 ~ 10 사이의 랜덤한 정수
        System.out.println("randomRange2 = " + randomRange2);

    }
}

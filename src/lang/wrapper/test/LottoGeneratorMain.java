package lang.wrapper.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {
        Lottogenerator generator = new Lottogenerator();
        int[] lottoNumbers = generator.generate();

        //생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        for (int lottonumber : lottoNumbers) {
            System.out.print(lottonumber + " ");
        }
    }
}

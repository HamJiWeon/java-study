package lang.math.test;

import java.util.Arrays;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();
        int[] lottoGenerate = generator.generate();
        Arrays.sort(lottoGenerate);

        System.out.print("오늘의 로또 당첨 번호는 => ");
        for (int x : lottoGenerate) System.out.print(x + " ");
    }
}

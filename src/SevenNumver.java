
public class SevenNumver {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        for (int i = 1; i < 100; i++) {
            // iの値が7で割り切れるとき
            if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                // iの値を表示する
                System.out.println("clap!");
            }else {

                System.out.println(i);
            }
        }
    }

}


public class reviw02 {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        for (int i = 1; i < 100; i++) {
            // iの値が7で割り切れるとき
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 ==0 ) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        
        
    }
    }}
//    【FizzBuzz問題】
//    1から100までの連続した整数を画面に表示する。ただし、下記の条件にしたがうこと：
 //   ・もし、その整数が3で割り切れる数なら "Fizz" と表示する
  //  ・もし、その整数が5で割り切れる数なら "Buzz" と表示する
   // ・上記2つの条件は同時に満たせる。つまり、もし、その整数が3で割り切れ、なおかつ5で割り切れる数なら "FizzBuzz" と表示する
    //・それ以外の数は、その数をそのまま表示する




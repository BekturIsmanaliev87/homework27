

import static java.lang.Math.sqrt;


public class Main {
    public static void main(String[] args) {
        System.out.println(sqrt(100));

    }
    public static <Double> UnaryOperator cqrt(double n){
        UnaryOperator <Double> koren=c-> sqrt(c);
        koren.sqrt(n);
        return koren;
    }
}
//public static UnaryOperator<Double> sqrt().
//
//Создайте метод sqrt().
//Он должен возвращать реализацию интерфейса UnaryOperator.
//Принимает одну цифру и возвращает его квадратный корень

 /*
 //   public static <T>  Interface writeable(T name){
//        Interface <T>  writing= t-> System.out.println("menin atym "+t);
//        writing.name(name);
  //      return writing;
 //   }
//}
*/
/*
    public static <T> Interface  getInterface( T n) {
        Interface i = new Interface() {

            @Override
            public void name(Object j) {
                System.out.println("your name " + j);

            }

        };
        i.name(n);
        return i;
    }

 */

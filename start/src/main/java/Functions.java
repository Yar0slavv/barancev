public class Functions {
    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Alex");
        hello("Ivan");

        int len = 5;
        System.out.println("Площадь квадрата со стороной "+ len + " = " + area(len));

        int a = 5;
        int b = 6;
        System.out.println("Площадь прямоугольника со сторонами "+ a + " и "+ b + " = " + area(a,b));
    }

    public static void  hello(String somebody){
        System.out.println("Hello " + somebody + "!");
    }

    public static double area(double l){
        return l * l;
    }

    public static  int area(int a, int b){
        return a * b;
    }
}

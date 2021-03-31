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

        Square s = new Square(8);
        System.out.println("Площадь квадрата со стороной "+ s.l + " = " + areaObjectSquare(s));

        Rectangle r = new Rectangle();
        r.a = 5;
        r.b = 6;
        System.out.println("Площадь прямоугольника со сторонами "+ r.a + " и "+ r.b + " = " + areaObjectRect(r));

        Cat t = new Cat("Barsik", 8);
        System.out.println("Моего кота зовут "+ t.name + "!"+ " Он весит " + t.weight + "kg");
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

    public static int areaObjectSquare(Square s){
        return s.l * s.l;
    }

    public static int areaObjectRect(Rectangle r){
        return r.a * r.b;
    }

    public static void catObject(Cat b){

    }
}

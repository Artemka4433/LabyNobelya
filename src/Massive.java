public class Massive {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setNum(500);
        Singleton singleton2 =  Singleton.getInstance();

        System.out.println(singleton2.getNum());
    }
}
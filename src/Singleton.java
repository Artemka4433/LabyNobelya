public class Singleton {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private static Singleton instance;
 //   private Singleton() { }
    public static Singleton getInstance() {
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}

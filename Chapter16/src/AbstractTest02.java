public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.move();
        Animal x = new Cat();
        x.move();
    }
}
//抽象类不一定有抽象方法，但抽象方法必须出现在抽象类中
//抽象类中的构造方法是给子类使用的
public class inner {
     String message = "Hello World! from Outer Class";
    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        inner outer = new inner();
        inner.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
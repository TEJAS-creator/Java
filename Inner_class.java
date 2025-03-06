class Outside {
    String x = "Hello";

    class Inside {
        String y = "Tejas";

        public void good(){
            System.out.println("Congratulations !!!");
        }
    }

    public void greet(){
        System.out.println("Good morning !!!");
    }
}

    public class Main{
    public static void main(String[] args) {
        Outside out = new Outside();
        Outside.Inside in = out.new Inside();
        System.out.println(out.x + " " + in.y);
        out.greet();
        in.good();
    }
}

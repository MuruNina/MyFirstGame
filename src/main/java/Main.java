public class Main {
    public static void main(String[] args) throws Exception {
//        Entity nero = new Entity(2, 25);
//        nero.move(3, 35);
//        String neroString = nero.toString();
//        System.out.println(neroString);
//        Entity kirie = new Entity(4, 35);
//        System.out.println(kirie.toString());
//
//        boolean bobo = nero.equals(kirie);
//        System.err.println(bobo);
        Cat kirie = new Cat();
        kirie.getAge();
        System.out.println(kirie.getAge());
        kirie.setAge(35);
        kirie.setAge(10);
        kirie.meow();
        while (true){
            kirie.meow();
            Thread.sleep(2000);
        }
    }
}
package OCPExam.chapter2.ploymorphism;

public class Oceanographer extends Dolphin {

    public int age = 10;

    public static void main(String[] args) {
       Oceanographer o = new Oceanographer();
    //    o.checkSound(new Dolphin()) ;
    //    o.checkSound(new Whale());
       Oceanographer.checkSound(new Dolphin()) ;
       Oceanographer.checkSound(new Whale());

       // for class and interface together
       Primate primate = new Oceanographer();
       System.out.println(primate.hasHair());

       Oceanographer o1 = (Oceanographer) primate;
       System.out.println(o1);
    }

    // private void checkSound(LivesInOcean animal) {
    //     animal.makeSound();
    // }
    private static void checkSound(LivesInOcean animal) {
        animal.makeSound();
    }
    
}

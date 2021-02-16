package OCPExam.chapter2;

import java.util.function.Predicate;

public class FindmatchingAnimals {
    // private static void print(Animal animal, CheckTrait<Animal> trail){ // calling CheckTrait interface
    //     if(trait.test(animal)){
    //         System.out.println(animal);
    //     }
    // }

    private static void print(Animal animal, CheckTrait trait){ // calling CheckTrait interface
        if(trait.test(animal)){
            System.out.println(animal);
        }
    
    }
    private static void print(Animal1 animal1, CheckTrailTest trait){ // calling CheckTrait interface
        if(trait.test1(animal1)){
            System.out.println(animal1);
        }
    
    }

    // private static void print(Animal animal, Predicate<Animal> trait){ // calling predicate interface
    //     if(trait.test(animal)){
    //         System.out.println(animal);
    //     }
    // }

    public static void getAtmval(Accountholder accholder, Predicate<Accountholder> ah){
        if(ah.test(accholder)){
            System.out.println("test");
            if(accholder.getAccountno() == 123){
                System.out.println(accholder.getAddress());
            }
        }     

    }
    public static void main(String[] args){
       // print(new Animal1("fish", true, true), b-> b.canWalk());
       // print(new Animal("Kangaru", true, false), b-> b.canWalk()); // return result of canHop

        getAtmval( new Accountholder(123, " 1 halifax ") , ac->ac.isGood());


        


        // (Animal b) -> {return b.canHop();}
        // 

    }
}
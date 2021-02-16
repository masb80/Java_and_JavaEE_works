
package OCPExam.chapter3.genericwildcard;

public class WildclassExample<T> {
    T[] list;

    public WildclassExample(T[] listarray){
        this.list = listarray;
    }   
    
    public void greaterthan(WildclassExample<?> otherstudent){
        if(list.length > otherstudent.list.length){
            System.out.println("True");;
        }else{
            System.out.println("False");
        }
    }
}

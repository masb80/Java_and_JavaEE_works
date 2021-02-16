// default, private, protected, public

/*
 private is restricted

*** the methods or data members declared as private are accessible only within the class in which they are declared
*** Any other class of same package will not be able to access these members
*** Classes or intrfaces can not be declared as private
*/
package OCAExam.accessmodifier;

import OCAExam.Protectedaccessmodifiertest.Protectedaccessmodifiertest;

// for private access modifiers in field and method
class Privateaccessdmodifiertestclass {
    private int a = 1; // not accessible from another class like in main function in Accessmodifiertest
                       // class.

    private void privatemethodA() {
        System.out.println("IN the private method in class A");
    }
}

/*
 * for default access modifiers if not declares
 * 
 * if you dont use any modifires and then it will trated as default and it can
 * be accessable only in that package the data members, class or method which
 * are not decleared using any access modifirs ie having default access
 * modifires are accessible only within the same package
 */
class Defaultaccessdmodifiertestclass {
    int a = 1; // not accessible from another class like in main function in Accessmodifiertest
               // class.

    void defaultmethod() {
        System.out.println("IN the default method in class A");
    }
}

/*
 * for protected access modifier
 *** 
 * the protected access modifier is accessible within package and outside the
 * package but through inheritence only it can be applied in data member,
 * method, and constructor it can not be applied in on the class
 */
class Protectedaccessdmodifiertestclass {
    protected int a = 1;

    protected void Protectedmethod() {
        System.out.println("In the Protected method in class Protectedaccessdmodifiertestclass");
    }
}

public class Accessmodifiertest extends Protectedaccessmodifiertest { // class A for protected test and public
    private int a = 1;

    private void privatemethodB() {
        System.out.println("IN the private method in class B");
    }

    protected void defaultmethod() {
        System.out.println("IN the default method in class Accessmodifiertest");
    }

    // protected test from another class
    public int b = 1; // class and member data need to be public to enter from another class

    public void Protectedmethod() {
        System.out
                .println("In the Protected method in class Protectedaccessdmodifiertestclass which is in another file");
    }

    public static void main(String args[]) {
        Privateaccessdmodifiertestclass s = new Privateaccessdmodifiertestclass();
        Accessmodifiertest obj = new Accessmodifiertest();
        // s.privatemethodA(); // WE CAN NOT ENTER FROM HERE AS PRIVATE AND OUTSIDE OF
        // THIS CLASS
        // s.A = 1; // we can not add this value
        // System.out.println(s.a);
        obj.privatemethodB();
        System.out.println(obj.a);
        Protectedaccessdmodifiertestclass pr = new Protectedaccessdmodifiertestclass();
        pr.Protectedmethod();
        obj.defaultmethod();
        obj.x = 5; // protected in the inheritence class but child class object can access
        obj.Protectedmethod1(); // protected means after extends , this object can access to the imported class

    }
}

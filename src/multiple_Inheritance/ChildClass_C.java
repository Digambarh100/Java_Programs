package multiple_Inheritance;

public class ChildClass_C extends BaseClass_A ,BaseClass_B {
	
	public static void main(String[] args) {
		C c= new C();
		c.m1();
		}
}

/*
//Note- it will get the compile time error
One class has many super classes called as multiple inheritance.
Why multiple inheritance not supported in java in case of classes?
Class base has test () method and class derived has also test () method.
Class test extends Base, Derived, which test method It will called, so it create
the ambiguity so that’s why multiple inheritance does not supports in java.



Hybrid inheritance
It is the combination of hierarchical_Inheritance and multiple inheritance. So it is not
allowed in java.


                     class A
                 /    
                /     
            class b             class c         

                      class d


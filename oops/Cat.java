class Animal {
    void make_sound(){
        System.out.println("MAke Sound");

    }
}
class  Dog extends Animal {
   void  make_sound(){
        super.make_sound(); 
        System.out.println("Bark");
    }

    
}
public class Cat{
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.make_sound();
    }

    
}
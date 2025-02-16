// Theory :-
// syntax of classes and objects :-

// should be declared inside main fucntion
// class_name object_name = new class_name // creation of an object 

// class class_name{
//     A method should always be declared inside the class 
// }

// constructor name is always equal to class name


// Example 1
class volume{
    int width;
    int height;
    int length;

    void display() {
        int result = width * length * height;
        System.out.println("Volume: " + result);
    }

    void new_display(){
        int result = width + length+ height;
        System.out.println("Result: "+result);
    }
}

public class Main{
    public static void main(String[] args) {
        volume v1 = new volume();
        volume v2 = new volume();

        v1.width=2;
        v1.height=3;
        v1.length=5;

        v2.width=8;
        v2.height=3;
        v2.length=5;

        v1.display();
        v2.display();

        v1.new_display();
        v2.new_display();

        // access the class parameters

    }
}





// Example 2
class car{
    String name;
    int ID;

    void display(){
        System.out.println("You can drive "+name);
    }

    void no(){
        System.out.println("You cant drive "+name+" of model "+ID);
    }
}

public class Main{
    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.name="BMW";
        c1.ID=5;

        c1.display();
        c1.no();

        c2.display();
        c2.no();

        System.out.println(c1.name);
        System.out.println(c2.name);

    }
}




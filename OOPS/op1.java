class pen { // defining blue print of a pen
    // ye ek class h jo hum define kr rhy hein is ky andr hum propeties and method
    // ya function dy rhy hein or phir isko main function m call kryengye as an
    // object

    String color; // properties
    String type; // ball point \gel penn

    // function jo class KY andr define hoty hein ussy method kheth hein
    public void write() {
        System.out.println("Writing something"); // function1
    }

    public void printcolour() { // function2
        System.out.println(this.color); // here the command "this" tells that which function called it
    }
 }

    class Student{
        String name;                                         // properties
        int age;

        public void priInfo() {
            System.out.println(this.name);                  // function
            System.out.println(this.age);

        }

    }


public class op1 {
    // main function humaesha public class ky andr ata h or is ka return type void
    // hota h or stings of argumnents pass hony hein
    public static void main(String args[]) {
        // pen pen1 = new pen();            // phela object kuch is tareqy sy bana ky usky type ka naam uski class h and phir  object ka name 
        // pen1.color = "Blue";             // object 1
        // pen1.type = "gel";               // sari properties are acess by 'dot' like name of obj and . and property

        // pen pen2 = new pen();           // all methods are also acces by using dot after name of object
        // pen2.color = "black";           // object 2
        // pen2.type = "ball point";

        // pen1.printcolour();              // calling 2 functions
        // pen2.printcolour();


        Student S1 = new Student();
        S1.name = "Meesam";                    // obj 1 
        S1.age = 19;
        
        Student S2 = new Student();
        S2.name = "Abbas";                    // obj 2
        S2.age = 23;
        
        S1.priInfo();                         // calling function
        S2.priInfo();
        
    }
}

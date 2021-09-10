public class Person {
    private static String name = "Default";

    public Person(String nameInput) {
        name = nameInput;
    }

    public String getName(){
        return Person.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + this.name);
    }
}

import java.util.Arrays;

public class ArraysExercises {


    public static Person[] addPerson(Person[] original, Person newPerson) {
        Person[] newArr = Arrays.copyOf(original, original.length + 1);
        newArr[original.length] = newPerson;
        return newArr;
    }

    public static void main(String[] args) {

        Person p1 = new Person("Bob");
        Person p2 = new Person("Shannon");
        Person p3 = new Person("Hope");

        Person[] persons = {p1, p2, p3};

        Person[] personsV2 = addPerson(persons, new Person("Naruto"));

        for (int i = 0; i < personsV2.length; i++) {
            System.out.println(personsV2[i].getName());
        }







//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
    }
}

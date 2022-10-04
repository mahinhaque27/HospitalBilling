public class Person {
    String firstName;
    String lastName;

    Person(){

    }

    Person(String f, String l){
        setName(f, l);
    }

    public void setName(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
}

public class Doctor extends Person {
    String specialty;

    Doctor(){

    }

    Doctor(String f, String l, String s){
        setName(f,l);
        setSpecialty(s);
    }

    public void setSpecialty(String s){
        specialty = s;
    }

    public String getSpecialty(){
        return specialty;
    }
}

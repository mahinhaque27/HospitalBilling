public class Patient extends Person {
    int id;
    Date admitDate = new Date(7,25,2022);
    Date dischargeDate = new Date(8,2,2022);
    Date dob = new Date(12,27,2000);

    Patient(){

    }

    Patient(String f, String l, int i){
        setName(f,l);
        setID(i);
    }

    public void setID(int i){
        id = i;
    }

    public int getID(){
        return id;
    }

}

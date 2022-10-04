public class Date {
    int month;
    int day;
    int year;

    Date(){

    }

    Date(int m, int d, int y){
        setDate(m,d,y);
    }

    public void setDate(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public String getDate(){
        return month + "-"+ day + "-" + year;
    }
}

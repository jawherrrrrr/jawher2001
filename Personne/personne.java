public class Personne {

    String name,firstName;
    int dayNaiss ,monthNaiss, yearNaiss;

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDateNaiss(int j,int m, int a){
        dayNaiss=j;
        monthNaiss=m;
        yearNaiss=a;
    }
    public int ageEn2023(){
        return 2023-yearNaiss;
    }
}
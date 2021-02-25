public class Driver {
    private int id;
    private String name;
    private int age;
    private String gender;
    private int experience;
    private Car car;

    public Driver(){

    }
    public Driver(int id, String name, int age, String gender, int experience, Car car){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
        this.car = car;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public int getExperience(){
        return experience;
    }
    public void setIn(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setExperience(int experience){
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", experience=" + experience +
                ", car=" + car +
                '}';
    }
}

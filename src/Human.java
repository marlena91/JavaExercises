public class Human {

    String firstName;
    String lastName;
    Integer age;
    Boolean isAlive;
    Double salary;

    Phone mobile;
    Animal pet;
    Car auto;

    public Double getSalary(){
        System.out.println("The data was checked: " + java.time.LocalDateTime.now());
        return this.salary;
    }

    public void setSalary(Double salary){
        if (salary < 0){
            System.out.println("Nie mona przypisac ujemnej wartosci");
        } else {
            System.out.println("New salary sent");
            System.out.println("Take the annex");
            System.out.println("Don't hide your income");
        }
        this.salary = salary;
    }


}

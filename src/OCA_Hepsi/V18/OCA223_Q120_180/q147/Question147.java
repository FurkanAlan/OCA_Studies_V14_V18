package OCA_Hepsi.V18.OCA223_Q120_180.q147;

public class Question147 {
}

//Burada setter ve getter, this ile ayni isi yapiyor
class Employee {
    private String name;
    private int age;
    private int salary;

//    public Employee() { //main de tanimli olan e1 objesinin constructor u bos oldugu icin burada da bos bir
//        // constructor olmali diger turlu hem Employee de hemde Test class da compile hatasi verir
//    }

    public Employee(String name, int age) {
        setName(name);
//        this.name = name;
        setAge(age);
//        this.age = age;
        setSalary(2000);
//        this.salary = 2000;
    }

    public Employee(String name, int age, int salary) {
        this(name, age);
        setSalary(salary);
//        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //eger burada bu metod olmasaydi biz private olan degere ulasamazdik,
    public void printDetails() {
        System.out.println(name + " : " + age + " : " + salary);
    }
}

class TestT {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
        Employee e2 = new Employee("Jack", 50);
        Employee e3 = new Employee("Chloe", 40, 5000);
//        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
    }
}
//Ans : E
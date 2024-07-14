package Day_11_exercise;

public class Employee {

    private String id;
    private String name;
    private float salary;

    public Employee (String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public float getAnnualSalary() {
        return salary * 12;
    }
    public float raisedSalary (float percent) {
        this.salary = salary*(1+(percent/100));
        return this.salary;
    }
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

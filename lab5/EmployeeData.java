public class EmployeeData {
    private int age;
    private double salary;
    private int id;

    public void setAge(int age) throws NegativeNumberException{
        if (age < 0) {
            throw new NegativeNumberException("Age cannot be negative.");
        }
        this.age = age;
    }

    public void setSalary(double salary) throws NegativeNumberException {
        if (salary < 0) {
            throw new NegativeNumberException("Salary cannot be negative.");
        }
        this.salary = salary;
    }

    public void setId(int id) throws NegativeNumberException {
        if (id < 0) {
            throw new NegativeNumberException("ID cannot be negative.");
        }
        this.id = id;
    }
}


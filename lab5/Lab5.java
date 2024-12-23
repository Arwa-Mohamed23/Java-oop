public class Lab5 {
    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();
        try {
            emp.setAge(25); 
            emp.setSalary(-5000);
            emp.setId(123);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
            System.out.println("Exception caught: " +e.getMessage());
        } finally {
            System.out.println("Execution of try-catch-finally block completed.");
        }
    }
}

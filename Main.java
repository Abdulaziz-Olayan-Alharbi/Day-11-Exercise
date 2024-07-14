package Day_11_exercise;

public class Main {
    public static void main(String[] args){

        System.out.println("************* Account Test *************");
        Account user_001 = new Account("001","Abdulaziz Alharbi",10000);
        Account user_002 = new Account("002","Abdullah Alharbi");
        Account user_003 = new Account("003","Muhammed Alharbi",3000);
        user_002.setBalance(20000);
        System.out.println(user_001.getName()+" Balance "+user_001.getBalance());
        System.out.println(user_001.credit(5000));
        System.out.println(user_002.getName()+" Balance "+user_002.getBalance());
        System.out.println(user_002.debit(5000));
        System.out.println(user_003.getName()+" Balance "+user_003.getBalance());
        user_001.transferTo(user_003,2000);
        System.out.println(user_001.getName()+" Balance "+user_001.getBalance());
        System.out.println(user_003.getName()+" Balance "+user_003.getBalance());
        System.out.println(user_002.toString());
        System.out.println("******************************************");




        System.out.println("************* Employee Test *************");
        Employee emp_001 = new Employee("001","Abdulaziz Alshahri",4000);
        Employee emp_002 = new Employee("002","Abdullah Alshahri",10000);
        Employee emp_003 = new Employee("003","Muhammed Alshahri",9000);
        System.out.println(emp_001.toString());
        System.out.println(emp_001.getName()+" Annual Salary "+emp_001.getAnnualSalary());
        System.out.println(emp_002.toString());
        System.out.println(emp_003.toString());
        System.out.println(emp_003.raisedSalary(50));
        System.out.println(emp_003.toString());








    }

}

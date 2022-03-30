import java.io*;
class Employee
{
    public static void main(String args[])throws Exception;
    {
        int empId;
        String ename,address;
        float salary;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter employee ID, Name, Salary, Address")
        empId = Integer.parseInt(br.readline);
        ename = br.readline;
        salary = Float.parseInt(br.readline);
        address = br.readline;
        System.out.println("Employee Information");
        System.out.println(empId + " "+ename +" "+salary+" "+address);
    }
};



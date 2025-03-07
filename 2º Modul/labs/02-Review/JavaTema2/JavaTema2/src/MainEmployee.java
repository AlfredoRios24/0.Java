
import com.gpv.Employee;
import java.util.Calendar;
import java.util.Date;


public class MainEmployee {

  
    public static void main(String[] args) {
        Calendar c;
        Date d;
        
        Employee emp = new Employee();
        emp.display();
        emp.salary=203.0;
        emp.display();
        emp.setEmpId(0);
        emp.display();
        emp.setName(null);
        emp.setName(" ");
         emp.display();
         emp.setName("Carlos");
         emp.display();
         System.out.println("OTRO EMPLOYEE");
         Employee emp1 = new Employee(10, "Juan carlos", "123456789", 1102.90);
         emp1.display();
    }
    
}

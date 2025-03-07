
import com.gpv.Employee;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pue
 */
public class MainPasoPorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a: " + a + " b: " + b);
        b++;
        System.out.println("a: " + a + " b: " + b);
        
        Employee emp = new Employee();
        Employee emp1 = emp;
        System.out.println("emp id " + emp.getEmpId() + " emp1 id "+ emp1.getEmpId());
        emp1.setEmpId(10);
        System.out.println("emp id " + emp.getEmpId() + " emp1 id "+ emp1.getEmpId());
        
        System.out.println("emp salary " + emp.getSalary());
        changeSalary(emp);
        System.out.println("emp salary " + emp.getSalary());
        emp = null;
        emp1 =null;
        //System.gc();
    }
    public static void changeSalary(Employee emp){
        emp = new Employee();
        emp.salary = 101010;
        
    }
    
}

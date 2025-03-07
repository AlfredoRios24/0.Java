package com.example;
//
//public class Employee {
//
//    private String name;
//    private String role;
//    private String dept;
//    private double salary;
//    private BenefitHelper benefitHelper;
//    
//    public Employee() {
//        super();
//        this.benefitHelper = new BenefitHelper();
//    }
//
//    public Employee(String name, String role, String dept, double salary) {
//        this.name = name;
//        this.role = role;
//        this.dept = dept;
//        this.salary = salary;
//        this.benefitHelper = new BenefitHelper();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRole() {
//        return role;
//    }
//
//    public String getDept() {
//        return dept;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//  
//    
//    private class BenefitHelper{
//        private final double bonusRate = 0.02;
//        private final double withholdingRate = 0.07;
//        
//  
//        public double calcBonus(){
//        return bonusRate * salary; 
//            }
//        
//         public double calcwithholdingRate(){
//        return withholdingRate * salary; 
//            }
//        
//        
//
//        public double getBonus() {
//           return benefitHelper.calcBonus();
//        }
//
//        public double getWithholding() {
//           return benefitHelper.calcwithholdingRate();
//        }
//
//        
//    
//    }
//    
//    
//    
//
//}


public class Employee {
    private String name;
    private String role;
    private String dept;
    private double salary;
    private BenefitHelper benefitHelper;  // Instancia de BenefitHelper
    
    public Employee() {
        super();
        this.benefitHelper = new BenefitHelper();
    }

    public Employee(String name, String role, String dept, double salary) {
        this.name = name;
        this.role = role;
        this.dept = dept;
        this.salary = salary;
        this.benefitHelper = new BenefitHelper();
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return benefitHelper.calcBonus();
    }

    public double getWithholding() {
        return benefitHelper.calcWithholding();
    }

    private class BenefitHelper {
        private final double bonusRate = 0.02;
        private final double withholdingRate = 0.07;

        public double calcBonus() {
            return bonusRate * salary;
        }

        public double calcWithholding() {
            return withholdingRate * salary;
        }

        public double getBonusRate() {
            return bonusRate;
        }

        public double getWithholdingRate() {
            return withholdingRate;
        }
    }
}

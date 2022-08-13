package SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Kemal", 2000, 45, 1985);
        System.out.println(employee.toString());
        double maasArtis = employee.raiseSalary();
        System.out.println("Vergi : " + employee.tax());
        System.out.println("Bonus : " + employee.bonus());
        System.out.println("Maaş artisi : " + maasArtis);
        //System.out.println("Vergi ve Bonuslar ile birlikte maaş "+employee.salary ); 
        System.out.println("Toplam Maas : " + employee.salary);

    
    }
    
}

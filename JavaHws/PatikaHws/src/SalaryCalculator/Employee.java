package SalaryCalculator;

public class Employee {

    String name;

    int salary;

    int workHours;

    int hireYear;

public Employee(String name,int salary,int workHours,int hireYear){
    this.hireYear=hireYear;
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
}


public double tax(){
    double tax = 0;
    if (salary<1000) {
        salary-=tax;
        return tax;
    } else {
        tax = (salary*3)/100;
        salary-=tax;
        return tax;
    }
}


public int bonus(){
    int bonus =0;
    if (workHours>40) {
        bonus = (workHours-40)*30;
        salary+=bonus;
        return bonus;
    }
    else{
        salary+=bonus;
        return bonus;
    }
}
public double raiseSalary(){
    double diff = 0;
    if (2021-hireYear < 10) {
        diff = (salary*5)/100;
        salary+=diff;

    }else if(2021-hireYear>9 && 2021-hireYear<20){
        diff = (salary*20)/100;
        salary+=diff;
    }else{
        diff = (salary*15)/100;
        salary+=diff;
    }

    return diff;
    
}

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Adi : " + name +"\nMaaşi : " + salary +"\nÇalisma Saati : " + workHours + "\nBaslangic Yili : "+hireYear;
}
    
}

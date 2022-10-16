public class Employee {
    String name,surName;
    double salary;
    double workingHours;
    int hireYear;


    Employee (String name, String surName, double salary, double workingHours, int hireYear) {
        this.name= name;
        this.surName= surName;
        this.salary = salary;
        this.workingHours = workingHours;
        this.hireYear = hireYear;
    }

     public double tax () {
        if(this.salary < 1000) {
            return 0;
         }else {
            return this.salary*0.03;
         }
     }
     public double bonus(){
        if(this.workingHours>40){
            return ((this.workingHours-40)*30);
        }else {
            return 0;
        }
     }
     public double salaryRaise(){
        if(2021-this.hireYear<10){
            return this.salary*0.05;
        }
        else if ((2021-this.hireYear>=10)&&(2021-this.hireYear<20)) {
            return this.salary*0.10;
        }
        else if (2021-this.hireYear>=20) {
            return this.salary*0.15;
        }else {
            return 0;
        }
     }
     public String toString(){
        double s1 = this.salary + this.bonus() - this.tax();
        double totalS = this.salary + this.bonus() -this.tax() + this.salaryRaise();

        return ("Adı : " + this.name + " " + this.surName + "\n"
             + "Maaşı : " + this.salary + "\n" + "Haftalık Çalışma Süresi : " + this.workingHours
             + "\n" + "Başlangıç yılı : " + this.hireYear + "\n" + "Vergi : " + this.tax() + "\n" + "Bonus : " + this.bonus() + "\n"
                + "Maaş artışı : " + this.salaryRaise() + "\n" + "Vergi ve Bonuslarla birlikte maaş : " + s1 + "\n"
                +  "Toplam maaş : " + totalS);
     }
}

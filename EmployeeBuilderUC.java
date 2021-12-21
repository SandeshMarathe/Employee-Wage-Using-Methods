package com.bridgelabz.employeewagesmethods;

public class EmployeeBuilderUC  {

    public static final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWagesArray;

    public EmployeeBuilderUC () {
        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage (String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

        companyEmpWagesArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

        numOfCompany++;
    }

    private void computeEmpWage() {

        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagesArray[i]));
            System.out.println(companyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {

        //Variables
        int empHrs=0;
        int totalEmpHrs=0;
        int totalWorkingDays=0;
        int totalEmpWage=0;

        //Computation
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {

            totalWorkingDays++;

            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }

            totalEmpHrs += empHrs;
            System.out.println("Day# :" + totalWorkingDays + "Emp Hrs: " + empHrs);
        }

        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String args[]) {
        EmployeeBuilderUC employeeBuilderUC = new EmployeeBuilderUC();
        employeeBuilderUC.addCompanyEmpWage("DMart", 20, 2, 10);
        employeeBuilderUC.addCompanyEmpWage("Reliance", 10, 4, 20);
        employeeBuilderUC.computeEmpWage();
    }

}

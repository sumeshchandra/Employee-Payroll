package employeePayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        FILE_IO, DB_IO, CONSOLE_IO
    }

    private List<EmployeePayRollData> employeePayrolls;

    public EmployeePayrollService(List<EmployeePayRollData> employeePayrolls) {
        // TODO Auto-generated constructor stub
        this.employeePayrolls = employeePayrolls;
    }

    public static void main(String[] args) {
        List<EmployeePayRollData> employeePayrolls = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrolls);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayroll(consoleInputReader);
        employeePayrollService.writeEmployeePayroll();

    }

    private void writeEmployeePayroll() {
        System.out.println("\n Writing Employee Payroll Data \n" + employeePayrolls);
    }

    private void readEmployeePayroll(Scanner consoleInputReader) {
        System.out.println("Enter employee id : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter employee name : ");
        consoleInputReader.nextLine();
        String name = consoleInputReader.nextLine();
        System.out.println("Enter employee salary : ");
        int salary = consoleInputReader.nextInt();
        employeePayrolls.add(new EmployeePayRollData(id, name, salary));
    }
}

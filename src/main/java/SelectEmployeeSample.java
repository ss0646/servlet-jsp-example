
import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class SelectEmployeeSample {

	public static void main(String[] args) {
		EmployeeDAO empDAO = new EmployeeDAO();
		List<Employee> empList = empDAO.findAll();
		for (Employee emp : empList) {
			System.out.println("ID:" + emp.getId());
			System.out.println("NAME:" + emp.getName());
			System.out.println("AGE:" + emp.getAge());
		}
	}

}

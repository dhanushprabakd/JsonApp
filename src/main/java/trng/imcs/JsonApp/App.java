package trng.imcs.JsonApp;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import trng.imcs.JsonApp.model.Address;
import trng.imcs.JsonApp.model.Department;
import trng.imcs.JsonApp.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	App app = new App();
    	//Department dept = app.createData();
    	//app.createJsonData(dept);
    	app.readJsonData();
    }

	private void readJsonData() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Department dept = mapper.readValue(new File("C:\\IMCS\\workspace-sts-3.8.4.RELEASE\\JsonApp\\src\\main\\resources\\data.json"), Department.class);
			System.out.println(dept);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void createJsonData(Department dept) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writerWithDefaultPrettyPrinter().writeValue(System.out, dept);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private Department createData() {
		
		Address address = new Address("Irving","Texas", "USA");
		Address address1 = new Address("Dallas","Texas", "USA");
		ArrayList<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		addresses.add(address1);
		Employee emp = new Employee(10, "Dhanush", addresses, 25000);
		Employee emp1 = new Employee(20, "Dhanush20", addresses, 45000);
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp);
		employees.add(emp1);
		Department dept = new Department("HR", 15, employees);
		return dept;
		
	}
}

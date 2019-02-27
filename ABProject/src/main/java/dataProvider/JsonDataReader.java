package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import managers.FileReaderManager;
import testDataTypes.Customer;
import testDataTypes.Expense;

public class JsonDataReader {
	private final String customerFilePath = FileReaderManager.getInstance().getPropReader().data("testDataResource")
			+ "Customer.json";
	private final String expenseFilePath = FileReaderManager.getInstance().getPropReader().data("testDataResource")
			+ "Expense_type.json";
	private List<Customer> custList;
	private List<Expense> expList;

	public JsonDataReader() {
		// TODO Auto-generated constructor stub
		custList = getCustomerData(customerFilePath);
	}

	private List<Customer> getCustomerData(String filename) {

		Gson gs = new Gson();
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader(filename));
			Customer[] cust = gs.fromJson(br, Customer[].class);
			// System.out.println(cust[0].MobileNumber);
			return Arrays.asList(cust);
		} catch (FileNotFoundException e) {

			throw new RuntimeException("JSON file not found at" + filename);
		} finally {

			try {

				if (br != null)
					br.close();
			} catch (IOException ignore) {
			}
		}

	}

	public final Customer getCustomerByNumber(String CustNum) {
		for (Customer cust : custList) {
			
			if (cust.MobileNumber.equalsIgnoreCase(CustNum))
				return cust;
			
		}
		return null;
		
	}

	/*
	 * public final Customer getCustomerByName(String customerName){ return
	 * customerList.stream().filter(x ->
	 * x.firstName.equalsIgnoreCase(customerName)).findAny().get(); }
	 */

}

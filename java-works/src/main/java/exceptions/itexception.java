package exceptions;

public class itexception {
	public static void checkname(String name) throws NameTooShortException {
		if (name.length() < 6) {
			throw new NameTooShortException("Name " + name + "is not as per standanrds");

		}
	}

	public static void checkincome(double income,companies company) throws SapientSalaryException, InfosysSalaryException {
		if (income < 30000 && company.equals(companies.SAPIENT)) {
			throw new SapientSalaryException("Income" + income + " for" + company + " is too less ..");
		} else if (income < 10000 && company.equals(companies.INFOSYS)) {
			throw new InfosysSalaryException("Income" + income + " for" + company + " is to less ..");
		}
	}

	public static void payIncomeTax(String name, double income, companies company) throws Exception {

		try {
			checkname(name);
		} catch (NameTooShortException e) {
			e.printStackTrace();
			throw new Exception("Not Processes due to some prob ", e);
		}

		// 1.IF NAMW IS MIN 6 CHARS
		// 2. if comapny is tcs and sal<20000
		try {
			checkincome(income, company);
		} catch (SapientSalaryException e) {
			throw new Exception("Not Processes due to some prob "+ e);
		}catch (InfosysSalaryException e) {
			throw new Exception("Not Processes due to some prob "+ e);
		}

	}

	public static void main(String[] args) throws Exception {
		payIncomeTax("Rahulkaus", 1000, companies.INFOSYS);
	}
}

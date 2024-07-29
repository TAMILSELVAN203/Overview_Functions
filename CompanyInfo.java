package org.company;

public class CompanyInfo {
	public void companyName() {
		System.out.println("This is the not a company");
	}

	public void companyName(String a, String b) {
		System.out.println("this is combine of " + a + " & " + b);
	}

	public void companyName(String a, String b, String c) {
		System.out.println("this is combine of " + a + " & " + b + " & " + c);
	}

	public void companyName(String a) {
		System.out.println("this is the " + a + " Company");
	}

	public static void main(String[] args) {
		CompanyInfo obj = new CompanyInfo();
		obj.companyName();
		obj.companyName("Google");
		obj.companyName("Google", "Facebook");
		obj.companyName("Google", "Facebook", "Instagram");
	}
}

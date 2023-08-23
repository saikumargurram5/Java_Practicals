package Oops;

public class Encapsulation1 {

	private int empno;
	private String mailid;
	private long contactno;
	
	Encapsulation1(){}
	Encapsulation1(int no, String m, long c)
	{
		this.empno = no;
		this.mailid = m;
		this.contactno = c;
		
	}
	




public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	
	
	
	
	public static void main(String[] args) {
		Encapsulation1 obj = new Encapsulation1();
		obj.setEmpno(1);
		obj.setMailid("Kumar@emp.com");
		obj.setContactno(5655552);
		
		System.out.println(obj.getEmpno()+"  " +obj.getMailid()+"  "+ obj.getContactno());
		
		
	}
	
	
	
}

package entity;

public class Student {
	private String Sname;
	private String Sno;
	private String Ssex;
	private String Sdep;
	private String Snav;
	private String Semail;
	private String Sphone;
	public Student(){
		
	}
	
	public Student(String sname, String sno, String ssex, String sdep, String snav, String semail, String sphone) {
		super();
		Sname = sname;
		Sno = sno;
		Ssex = ssex;
		Sdep = sdep;
		Snav = snav;
		Semail = semail;
		Sphone = sphone;
	}

	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSsex() {
		return Ssex;
	}
	public void setSsex(String ssex) {
		Ssex = ssex;
	}
	public String getSdep() {
		return Sdep;
	}
	public void setSdep(String sdep) {
		Sdep = sdep;
	}
	public String getSnav() {
		return Snav;
	}
	public void setSnav(String snav) {
		Snav = snav;
	}
	public String getSemail() {
		return Semail;
	}
	public void setSemail(String semail) {
		Semail = semail;
	}
	public String getSphone() {
		return Sphone;
	}
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	@Override
	public String toString() {
		return "Student [Sname=" + Sname + ", Sno=" + Sno + ", Ssex=" + Ssex + ", Sdep=" + Sdep + ", Snav=" + Snav
				+ ", Semail=" + Semail + ", Sphone=" + Sphone + "]";
	}
	
	
	
}

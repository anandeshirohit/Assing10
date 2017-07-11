import java.io.*;

public class Employee implements Serializable{
		private String ename;
		private int eno;
		private double esalary;
		private String edept;
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public double getEsalary() {
			return esalary;
		}
		public void setEsalary(double esalary) {
			this.esalary = esalary;
		}
		public String getEdept() {
			return edept;
		}
		public void setEdept(String edept) {
			this.edept = edept;
		}
		
}

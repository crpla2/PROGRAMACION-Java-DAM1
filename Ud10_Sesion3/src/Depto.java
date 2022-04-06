

public class Depto { 
	public Depto(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	Integer deptno; String dname;
	String loc;

public  Depto() {
}

public Integer getDeptno() {
	return deptno;
}
public void setDeptno(Integer deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}

@Override
public String toString() {
	return "Depto [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
}

}

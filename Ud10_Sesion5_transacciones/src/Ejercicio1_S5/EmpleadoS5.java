package Ejercicio1_S5;

import java.sql.Date;

public class EmpleadoS5 {
	private int EMPNO;
	private String ENAME;
	private String JOB;
	private int MGR;
	private Date HIREDATE;
	private double SAL;
	private double COMM;
	private int DEPNO;
	
	public EmpleadoS5() {}
		
	public EmpleadoS5(int eMPNO, String eNAME, String jOB, int mGR, Date hIREDATE, double sAL, double cOMM, int dEPNO) {
		EMPNO = eMPNO;
		ENAME = eNAME;
		JOB = jOB;
		MGR = mGR;
		HIREDATE = hIREDATE;
		SAL = sAL;
		COMM = cOMM;
		DEPNO = dEPNO;
	}
	public int getEMPNO() {
		return EMPNO;
	}
	public void setEMPNO(int eMPNO) {
		EMPNO = eMPNO;
	}
	public String getENAME() {
		return ENAME;
	}
	public void setENAME(String eNAME) {
		ENAME = eNAME;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public int getMGR() {
		return MGR;
	}
	public void setMGR(int mGR) {
		MGR = mGR;
	}
	public Date getHIREDATE() {
		return HIREDATE;
	}
	public void setHIREDATE(Date hIREDATE) {
		HIREDATE = hIREDATE;
	}
	public double getSAL() {
		return SAL;
	}
	public void setSAL(double sAL) {
		SAL = sAL;
	}
	public double getCOMM() {
		return COMM;
	}
	public void setCOMM(double cOMM) {
		COMM = cOMM;
	}
	public int getDEPNO() {
		return DEPNO;
	}
	public void setDEPNO(int dEPNO) {
		DEPNO = dEPNO;
	}
	@Override
	public String toString() {
		return "\nEmpleado [EMPNO=" + EMPNO + ", ENAME=" + ENAME + ", JOB=" + JOB + ", MGR=" + MGR + ", HIREDATE="
				+ HIREDATE + ", SAL=" + SAL + ", COMM=" + COMM + ", DEPNO=" + DEPNO + "]";
	}
	
	
	

}

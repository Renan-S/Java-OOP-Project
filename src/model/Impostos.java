package model;

import util.Constante;

public abstract class Impostos {
	
	private double icms = Constante.icms;
	private double iss = Constante.iss;
	private double ipi = Constante.ipi;
	
	public Impostos() {
		
	}
	
	public Impostos(double icms, double iss, double ipi) {
		super();
		this.icms = icms;
		this.iss = iss;
		this.ipi = ipi;
	}
	
	public double getIcms() {
		return icms;
	}
	public void setIcms(double icms) {
		this.icms = icms;
	}
	public double getIss() {
		return iss;
	}
	public void setIss(double iss) {
		this.iss = iss;
	}
	public double getIpi() {
		return ipi;
	}
	public void setIpi(double ipi) {
		this.ipi = ipi;
	}

}

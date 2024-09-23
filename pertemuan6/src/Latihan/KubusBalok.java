package Latihan;

public class KubusBalok {
	double s,p,l,t;
	
	public KubusBalok(double p, double l, double t) {
		this.p = p;
		this.l = l;
		this.t = t;
	}
	
	public KubusBalok(double s) {
		this.s = s;
	}
	
	public double volumekbs() {
		return s * s * s;
	}
	
	public double volumeblk() {
		return p * l * t;
	}
	
	public double lpkbs() {
		return 6 * (s * s);
	}
	
	public double lpblk() {
		return 2 * ((p * 1) + (p * l) + (l * t));
	}
}

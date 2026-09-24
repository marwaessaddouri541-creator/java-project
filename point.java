package com.geometrie.base;

public class point {
	public double abs;
	public double ord;
	public String couleur;
	
	public point () {
		this.abs = 0.0;
		this.ord = 0.0;
		this.couleur ="noir";
	}
	public point(double abs,double ord) {
		this.abs = abs;
		this.ord = ord;
	}
	public void mon_etat() {
        System.out.println("(" + abs + "," + ord + ") " + couleur);
    }
	  public double distance(point p) {
		  return Math.sqrt(this.abs - p.abs)(this.abs - p.abs)+(this.ord - p.ord)(this.ord - p.ord);
	    }
}

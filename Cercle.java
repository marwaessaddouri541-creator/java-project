package com.geometrie.formes;
import com.geometrie.base.point;

public class Cercle {
	public point centre;
	public double rayon;
	public String couleur;
	public static int nbCercles = 0;
	public Cercle() {
		centre = new point();
		rayon = 1;
		couleur = "noir";
		nbCercles++;
	}
	public Cercle(point centre, double rayon) {
		this.centre=centre;
		this.rayon=rayon;
		nbCercles++;
	}
	public Cercle(double x, double y, double rayon, String couleur) {
		this.centre=new point(x,y);
		this.rayon=rayon;
		this.couleur=couleur;
		nbCercles++;
	}
	public void mon_etat(){
		System.out.println("Cercle[centre=("+centre.abs+","+centre.ord+"),rayon="+rayon+",couleur="+couleur+"]");
	}
	public double getPerimetre() {
		return 2*Math.PI*rayon;
	}
	public double getSurface() {
		return Math.PI*rayon*rayon;
	}
	public void deplacer(double dx, double dy) {
		centre.abs=centre.abs+dx;
		centre.ord=centre.ord+dy;
	}
	public void deplacer(point nouveauCentre) {
		centre=nouveauCentre;
	}
	public boolean contient(point p) {
		return centre.distance(p)<=rayon;	
	}
	public boolean estPlusGrandQue(Cercle autre) {
		return this.rayon>autre.rayon;
	}
	public static int getNbCercles() {
		return nbCercles;
	}
	
}

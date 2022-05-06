package ma.ensaf.fitnessapp;

import java.util.Date;

public class User {
    String fullname,email,password,Uimage;
    double poids,taille;
    String date_naiss;
    public User(){

    }
    public  User(String fullname,String email,String password){
        this.fullname=fullname;
        this.email=email;
        this.password=password;
    }

    public User(String fullname, String email, String password, double poids, double taille, String date_naiss) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.poids = poids;
        this.taille = taille;
        this.date_naiss = date_naiss;
    }
    public User(String fullname, String email, String password, String uimage, double poids, double taille, String date_naiss) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        Uimage = uimage;
        this.poids = poids;
        this.taille = taille;
        this.date_naiss = date_naiss;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getDate_naiss() {
        return date_naiss;
    }
    public void setUimage(String uimage) {
        Uimage = uimage;
    }
    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }
}

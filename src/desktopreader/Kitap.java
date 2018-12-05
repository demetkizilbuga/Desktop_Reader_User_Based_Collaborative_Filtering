/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopreader;

/**
 *
 * @author uset
 */
public class Kitap {
    
    public String ISBN;
    public String Title;
    public String Author;
    public int Year;
    public String Yayın;
    public String ImageS;
    public String ImageM;
    public String ImageL;

    public Kitap(String ISBN, String Title, String Author,int year,String Yayın,String ImageS,String ImageM,String ImageL){
        this.ISBN=ISBN;
        this.Title=Title;
        this.Author=Author;
        this.Year=year;
        this.Yayın=Yayın;
        this.ImageS=ImageS;
        this.ImageM=ImageM;
        this.ImageL=ImageL;
    }
    
    
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getYayın() {
        return Yayın;
    }

    public void setYayın(String Yayın) {
        this.Yayın = Yayın;
    }

    public String getImageS() {
        return ImageS;
    }

    public void setImageS(String ImageS) {
        this.ImageS = ImageS;
    }

    public String getImageM() {
        return ImageM;
    }

    public void setImageM(String ImageM) {
        this.ImageM = ImageM;
    }

    public String getImageL() {
        return ImageL;
    }

    public void setImageL(String ImageL) {
        this.ImageL = ImageL;
    }
    
    
    
}

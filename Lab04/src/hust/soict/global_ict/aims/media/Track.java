/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.global_ict.aims.media;

/**
 *
 * @author truon
 */
public class Track implements Playable {
    private String title;
    private int length;
    
    public String getTitle(){
        return title;
    }
    public int getLength(){
    return length;
    }
    
    public void play(){
        System.out.println("Playing DVD: "+ this.getTitle());
        System.out.println("DVD length: " + this.getLength());
        
    }
    
    public boolean equals(Object obj){
        if(obj == this )return true;
        
        Track other = (Track) obj;
        return title.equals(other.getTitle()) && length == other.getLength();
    }
    
}

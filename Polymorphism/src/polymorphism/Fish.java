/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author user
 */
public class Fish extends Pool {
    private String color,size;
    public Fish (){
        color ="red";
        size ="small";
    }
    public Fish(String color, String size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public void type() {
        System.out.println("koi"); //To change body of generated methods, choose Tools | Templates.
    }
    

    
    @Override
    public String toString() {
        return "Fish(" + "color=" + color + ", size=" + size + ')';
    }
}

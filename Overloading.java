/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author Smart Computers
 */
class random{
    void fn(int a){
        System.out.println("fn with 1 args");
    }
    void fn(int a,int b){
        System.out.println("fn with 2 args");
    }
}
class Overloading {
    
    public static void main(String[] args) {
        // TODO code application logic here
        random r=new random();
        r.fn(2);
    }
}

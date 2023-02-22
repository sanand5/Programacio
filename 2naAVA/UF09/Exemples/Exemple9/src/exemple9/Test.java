/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemple9;

/**
 *
 * @author sanand
 */
public class Test<T,U> {
    T obj1;
    T obj2;

    public Test(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }
    
    
}

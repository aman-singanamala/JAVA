package com.company.Stack;
 // https://takeuforward.org/data-structure/implement-stack-using-array/
public class _4_implement_using_array {
     public static void main(String[] args) {
         stack s= new stack();
         s.push(5);
         s.push(15);
         s.push(20);
         System.out.println("Top of the stack is : "+ s.top());
         System.out.println("Size of the stack before deleting : "+s.size());
         System.out.println("The element deleted is : "+ s.pop());
         System.out.println("Size of the stack after deleting an element " + s.size());
         System.out.println("Top of the stack after deleting an element " + s.top());
     }
}
class stack{
    int size= 100;
    int[] array = new int[size];
    int top=-1;
    void push(int x){
        top++;
        array[top]= x;
    }
    int pop(){
        int x= array[top];
        top--;
        return x;
    }
    int top(){
        return array[top];
    }
    int size(){
        return top+1;
    }
}

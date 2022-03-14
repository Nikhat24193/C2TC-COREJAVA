class C {  
  
    public String msg="Try to access a public variable outside the class";  
     String info;  
     public void display()  
     {  
         System.out.println("Try to access a public method outside the class");  
         System.out.println(info);  
     }  
       
     public C(String info)  
     {  
         this.info=info;  
     }  
       
}  
public class Publickeyword {  
    public static void main(String[] args) {  
        C a=new C("Try to create the instance of public constructor outside the class");  
       System.out.println(a.msg);  
       a.display();  
          
    }  
}  
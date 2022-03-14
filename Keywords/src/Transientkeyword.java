import java.io.*;      
public class Transientkeyword implements Serializable{    
 int id;    
 String name;    
 	transient int age;//Now it will not be serialized    
 	public TransientKeyword(int id, String name,int age) {    
 		this.id = id;    
 		this.name = name;    
 		this.age=age;    
 	}    
}    
	class PersistExample{    
		public static void main(String args[])throws Exception{    
			Transientkeyword s1 =new Transientkeyword();//creating object    
				//writing object into file    
			FileOutputStream f=new FileOutputStream("f.txt");    
			ObjectOutputStream out=new ObjectOutputStream(f);    
			out.writeObject(s1);  
			out.flush();    
			out.close();    
			f.close();    
			System.out.println("success");    
		}    
}    

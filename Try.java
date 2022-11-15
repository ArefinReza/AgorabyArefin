import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Try {
  public static void appendtext() {
    File files = new File("E:/_____All Semester Class & Assignment/6th Semester/Objet Oriented Programming/New folder/Person/");
    try {
      FileWriter fw = new FileWriter(files,true);
      fw.write("program.txt");
      fw.close();
    } catch (Exception e) {
      System.out.println(e);
      // TODO: handle exception
    }
    System.out.println("File contant saved ");

  }
    
    public static void main(String[] args)  {
      
      appendtext();

      // try {
      //   Formatter fileformat = new Formatter("E:/_____All Semester Class & Assignment/6th Semester/Objet Oriented Programming/New folder/Person/Arefin.txt");

      //   String name;
      //   int id;
      //   Scanner sc = new Scanner(System.in);
      //   System.out.println("Enter how much Add Product !");
      //   int input = sc.nextInt();
      //   Scanner cs = new Scanner(System.in);

      //   for(int i =0;i<input;i++){
      //     System.out.println("Enter Name and ID ");
      //     name  = cs.next();
      //     id = cs.nextInt();
      //     fileformat.format("%s %d\r\n",name, id);
      //   }
      //   fileformat.close();
      // } catch (Exception e) {
      //   // TODO: handle exception
      //   System.out.println(e);
      // }
      // try {
        // File files = new File("E:/_____All Semester Class & Assignment/6th Semester/Objet Oriented Programming/New folder/Person/Arefin.txt");
        // Scanner sc = new Scanner(files);
      //   while (sc.hasNext()) {
      //     String name = sc.next();
      //     int id = sc.nextInt();
      //     System.out.println("Name : "+name+ "Id : "+id);
      //   }
      // } catch (Exception e) {
      //   // TODO: handle exception
      //   System.out.println(e);
      // }

        

      
    }  
    
}
class Readfile  {
  void read(){
    
  }
}
class ar{
  void arr(){
    int n;
      System.out.println("Enter Array Size : ");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();  
      String [] name = new String[n];
      Scanner x = new Scanner(System.in);
      for ( int i=0;i<n;i++){
        name[i]= x.nextLine();
        
        

      } 
      for ( int i =0;i<n;i++){
        System.out.println(name[i]);
      }
  }
  void filecreat(){
    File direc = new File("Person");
      direc.mkdir();
      String path = direc.getAbsolutePath();// get path of file
      File file1 = new File(path+"/Student.txt");
      
      File file2 = new File(path+"/pagolt.txt");


      try {
        file1.createNewFile();
        file2.createNewFile();
        System.out.println("The folder hasbeen created ");
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
      }
      file2.delete();
      // direc.delete();

      if(file2.exists()){
        System.out.println("File are Exists");
      }
      else{
        System.out.println("File are not exist");
      }
  }
}

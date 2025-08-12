
class Person
{
     void detailsOfPersons(int id,String name,int age,String gender)
        {
    	 System.out.println("It is a person class ");
              System.out.println("Enter person id :"+id);
             System.out.println("Enter name of the person :"+name);
             System.out.println("Enter person age :"+age);
             System.out.println("Enter gender:"+gender);
        }
}
class Student extends Person
{
    void detailOfStudents(int studentId,String name,int age,String gender,String collegeName,int collegeCode)
    
    {
    	System.out.println("It is a Student class ");
             System.out.println("Enter person id :"+studentId);
             System.out.println("Enter name of the person :"+name);
             System.out.println("Enter person age :"+age);
             System.out.println("Enter gender:"+gender);
             System.out.println("Enter person college name  :"+collegeName);
             System.out.println("Enter person college name  :"+collegeCode);
        
    }
}
class CollegeStudent extends Student
{
     void detailOfCollegeStudents(int studentId,String name,int age,String gender,String collegeName,int collegeCode)
    {
    	 System.out.println("It is a College of Student class");
        
             System.out.println("Enter person id :"+studentId);
             System.out.println("Enter name of the person :"+name);
             System.out.println("Enter person age :"+age);
             System.out.println("Enter gender:"+gender);
             System.out.println("Enter person college name  :"+collegeName);
             System.out.println("Enter person college code :"+collegeCode);
        
    }
}
 public class Details2
{
    public static void main(String []args)
    {
        CollegeStudent c1=new CollegeStudent();
        CollegeStudent c2=new CollegeStudent();
        
        c1.detailsOfPersons(5,"swaroop",18,"male");
        c1.detailOfStudents(22,"sai",33,"male","svce",55);
        c1.detailOfCollegeStudents(33, "Ajay", 190, "female","RGM", 854);
    }
}


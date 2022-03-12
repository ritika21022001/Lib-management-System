import java.util.Scanner;

public class Mainnn {


   


    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        int choice=0;
        

        while(choice !=3){
            System.out.println("Enter1- for module1 for student's data \n Enter2- for module2 for the available books in the library \n Or enter 3 to exit to log out from the management system");
            choice =obj.nextInt();

            if(choice==1){
            module1 obj1=new module1();
            System.out.println("Enter the student's name");
            obj1.name=obj.nextLine();obj1.name=obj.nextLine();
            System.out.println("Enter the father's name");
            obj1.fname=obj.nextLine();
            System.out.println("Enter university id");
            obj1.uni_id=obj.nextLine();
            System.out.println("Enter the user id");
            obj1.uid=obj.nextLine();
            System.out.println("In which semester do you study:");
            obj1.sem=obj.nextInt();


            obj1.getdata(obj1.name,obj1.fname,obj1.uid,obj1.uni_id,obj1.sem);
            obj1.setdata();
            }
            else if(choice==2){
                module2 obj2=new module2();

                obj2.chemistry();
                obj2.physics();
                obj2.biology();

            }

        }
        obj.close();
    }

    }



package email.Package;
import java.util.List;
import java.util.Scanner;

public class Email {
    String fName;
    String lName;
    private String Department;
    private String Password;
    private String Email;
    private int mailBoxCapacity = 500 ;
    private String altEmail;
    private String password;

    public Email(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        System.out.println("HELLO"+ " "+ fName +" "+""+ lName);

        this.Department = setDepartment();
        System.out.println("DEPARTMENT: " + this.Department);

        Email = fName.toLowerCase()+ "." + lName + "@" + this.Department + "." + "mycode.com";
        System.out.println("EMAIL: "+ Email);

        this.Password = randomPw(8);
        System.out.println("PASSWORD: " + this.Password);

        System.out.println("MAIL BOX CAPACITY: " + this.mailBoxCapacity + "MB");

    }
    private String setDepartment(){
        System.out.print("DEPARTMENT CODE:\n 1 = HR\n 2 = DEVELOPER\n 3 = SALES\n 4 = MARKETING");
        Scanner sc = new Scanner(System.in);
        int Code = sc.nextInt();
        if (Code == 1){return "HR";}
        else if(Code == 2){return "DEVELOPER";}
        else if (Code == 3){return "SALES";}
        else if (Code == 4){return "MARKETING";}
        else
            return null;
    }
    private String randomPw (int length){
        String pw = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890@#$%&*";
        char password [] = new char[length];
        for (int i = 0; i < length; i++){
            int random = (int) (Math.random() * pw.length());
            password[i] = pw.charAt(random);

        }

            return new String(password);
    }

    public void setAltEmail (String altEmail){
        this.altEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;

    }

    public void setMailBoxCapacity (int mailBoxCapacity){
        this.mailBoxCapacity = mailBoxCapacity;
    }

    public String getPassword() {return password; }
    public int getmailCapacity (){return mailBoxCapacity;}
    public String getAltEmail(){return altEmail;}


}




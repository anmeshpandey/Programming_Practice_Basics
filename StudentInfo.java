package training;
class StudentInfo{
    String Name, middlename, surname, birthdate, Address ;
    int Rollnumber;
    
    void setData(){
        Name = "Neha";
        middlename = "Saurabh";
        surname = "Pandey";
        birthdate = "10th Aug 1998";
        Address = "G-809, Heaven Apartment, Baner, Pune";
        Rollnumber = 34;
    }
    
    void studentName(){
        System.out.println(Name);
        System.out.println(middlename);
        System.out.println(surname);
    }
    
    void studentOtherDetails(){
        System.out.println(birthdate);
        System.out.println(Address);
        System.out.println(Rollnumber);
    }

    public static void main(String[] args){
        StudentInfo studentinfo = new StudentInfo();
        studentinfo.setData();
        studentinfo.studentName();
        studentinfo.studentOtherDetails();
        
    }

}
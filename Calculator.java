package training;
class Calculator{
    int number1=4;
    int number2=5;
void add(){
    int ans=number1+number2;
    System.out.println(ans);
}
void sub(){
    int ans=number1-number2;
    System.out.println(ans);
}    
void multiplication(){
    int ans=number1*number2;
    System.out.println(ans);
}    
void division(){
    int ans=number1/number2;
    System.out.println(ans);
}    
public static void main(String[] args){
    Calculator cal= new Calculator();
    cal.add();
    cal.sub();
    cal.multiplication();
    cal.division();
}    
}
package training;
class CalculatorWithParam {
     
    void add(int num1,int num2){ 
     int ans = num1+num2;
     System.out.println(ans);
     }
     
     public static void main(String [] args){
     CalculatorWithParam calculatorWithParam = new CalculatorWithParam();
     calculatorWithParam.add(10,12);
     calculatorWithParam.add(11,10);
     calculatorWithParam.add(50,30);
     calculatorWithParam.add(30,70);     
     }
    

}
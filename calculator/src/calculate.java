import javax.swing.*;

public class calculate {
    public  int add(int num1,int num2){
        return num1+num2 ;
    }
    public  int mines(int num1,int num2){
        return num1-num2 ;
    }
    public  float divided(float num1,float num2){
        if(num2!=0){
            return num1/num2 ;
        }
        else{
            JOptionPane.showMessageDialog(null,"You can't divide a number to Zero");
            return 0;
        }
    }
    public  int multiply(int num1,int num2){
        return num1*num2 ;
    }
}

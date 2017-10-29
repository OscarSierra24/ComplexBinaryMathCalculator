/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexmathbinarycalculator;

/**
 *
 * @author oscar
 */
public class Calculator {
    private float real1,
                  real2,
                  imaginary1,
                  imaginary2,
                  resReal,
                  resImaginary;
    private boolean done;
    public Calculator(){
        this.done=false;
        this.real1=0;
        this.real2=0;
        this.imaginary1=0;
        this.imaginary2=0;
        this.resReal=0;
        this.resImaginary=0;
    }
    public boolean isDone(){
        return this.done;
    }
    public void setReal1(float real1){
        this.real1=real1;
    }
    public void setReal2(float real2){
        this.real2=real2;
    }
    public void setImaginary1(float imaginary1){
        this.imaginary1=imaginary1;
    }
    public void setImaginary2(float imaginary2){
        this.imaginary2=imaginary2;
    }
    public float getResultOfReals(){
        return this.resReal;
    }
    public float getResultOfImaginaries(){
        return this.resImaginary;
    }
    public float getReal1(){
        return this.real1;
    }
    public float getImaginary1(){
        return this.imaginary1;
    }
    public float getReal2(){
        return this.real2;
    }
    public float getImaginary2(){
        return this.imaginary2;
    }
    public void resetAll(){
        this.real1=0;
        this.real2=0;
        this.imaginary1=0;
        this.imaginary2=0;
        this.resReal=0;
        this.resImaginary=0;
        this.done=false;
    }
    
    public void selectOperation(String operator){
        if(operator.equals("+")){
            calcSum();
            this.done=true;
        }
        else if(operator.equals("-")){
            calcRes();
            this.done=true;
        }
        else if(operator.equals("/")){
            calcDiv();
            this.done=true;
        }
        else if(operator.equals("*")){
            calcMult();
            this.done=true;
        }
    }
//    public static void main(String[] args){
//        Calculator calculator=new Calculator();
//        calculator.setReal1(2);
//        calculator.setImaginary1(-3);
//       
//        calculator.setReal2(4);
//        calculator.setImaginary2(-5);
//        calculator.calcDiv();
//        System.out.println(calculator.getResult());
//                
//    }
    
    private void calcSum(){
        this.resReal=this.real1+this.real2;
        this.resImaginary=this.imaginary1+this.imaginary2;
    }
    
    private void calcRes(){
        this.resReal=this.real1-this.real2;
        this.resImaginary=this.imaginary1-this.imaginary2;
    }
    
    private void calcMult(){
        this.resReal=(this.real1*this.real2)+(this.imaginary1*this.imaginary2)*(-1);
        this.resImaginary=(this.real1*this.imaginary2)+(this.imaginary1*this.real2);
    }
    
    private void calcDiv(){
        this.imaginary2=Math.abs(this.imaginary2);
        
        float numeratorReal=(this.real1*this.real2)+(this.imaginary1*this.imaginary2)*(-1);
        float numeratorImaginary=(this.real1*this.imaginary2)+(this.imaginary1*this.real2);
        
        float denominator =(this.real2*this.real2) + (this.imaginary2*this.imaginary2);
        
        this.resReal=numeratorReal/denominator;
        this.resImaginary=numeratorImaginary/denominator;
    }
    
    public String getResult(){
        return (this.getResultOfReals()+ " + " + this.getResultOfImaginaries() + "i");        
    }
}

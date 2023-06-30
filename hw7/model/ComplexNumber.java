package hw7.model;

public class ComplexNumber {
    private double real;
    private double im;

    public ComplexNumber(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public ComplexNumber() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public void printNumber(){
        if(this.im > 0){
            System.out.println(this.real + " + " + this.im + "i");
        } else if (this.im < 0) {
            System.out.println(this.real + " " + this.im + "i");
        } else{
            System.out.println(this.real);
        }
    }
}

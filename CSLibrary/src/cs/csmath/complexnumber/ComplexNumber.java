package cs.csmath.complexnumber;

public class ComplexNumber {

    private double realPart;
    private double imagPart;

    public ComplexNumber(double real, double imag)
    {
        this.setRealPart(real);
        this.setImagPart(imag);
    }

    public double getRealPart()
    {
        return realPart;
    }

    public void setRealPart(double realPart)
    {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart)
    {
        this.imagPart = imagPart;
    }

    public void add(ComplexNumber otherCN)
    {
        double newRealPart = this.getRealPart() + otherCN.getRealPart();
        double newImagPart = this.getImagPart() + otherCN.getImagPart();
        this.setImagPart(newImagPart);
        this.setRealPart(newRealPart);
    }

    public void sub(ComplexNumber otherCN)
    {
        double newRealPart = this.getRealPart() - otherCN.getRealPart();
        double newImagPart = this.getImagPart() - otherCN.getImagPart();
        this.setImagPart(newImagPart);
        this.setRealPart(newRealPart);
    }

    public void mult(ComplexNumber otherCN)
    {
        double newRealPart = this.getRealPart() * otherCN.getRealPart()
                - this.getImagPart() * otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart()
                + this.getRealPart() * otherCN.getImagPart();
        this.setImagPart(newImagPart);
        this.setRealPart(newRealPart);
    }

    public void div(ComplexNumber otherCN) throws ArithmeticException
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        double denominator = c * c + d * d;
        if (java.lang.Math.abs(denominator) < 0.0000000001)
        {
            throw new ArithmeticException();
        }

        double newRealPart = (a*c + b*d)/denominator;
        double newImagPart= (b*c - a*d)/denominator;

        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public void conj()
    {
        double newImagPart = this.getImagPart() * -1.00;
        this.setImagPart(newImagPart);
    }

    public double abs()
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double abs = java.lang.Math.sqrt(a*a + b*b);
        return abs;
    }

    @Override
    public String toString() { return getRealPart() + "+" + getImagPart() + "i";}


    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        firstCN.add(secondCN);

        return firstCN;
    }


    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        firstCN.sub(secondCN);

        return firstCN;
    }


    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        firstCN.mult(secondCN);

        return firstCN;
    }


    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN)
    {
        firstCN.div(secondCN);

        return firstCN;
    }


    public static void main(String[] args)
    {
        ComplexNumber cn1 = new ComplexNumber(1.0, 1.0);
        System.out.println("CN1 real: " + cn1.getRealPart() + "Imag" + cn1.getImagPart());
        ComplexNumber cn2 = new ComplexNumber(0.0, 0.0);
        System.out.println("CN1 real: " + cn1.getRealPart() + "Imag" + cn1.getImagPart());
        cn1.mult(cn2);
    }


}

public class Calculator {

    private double amount1;
    private double amount2;

    public Calculator (double amount1, double amount2) {
        this.amount1 = amount1;
        this.amount2 = amount2;
    }

    public double add(){
        return this.amount1 + this.amount2;
    }

    public double subtract(){
        return this.amount1 - this.amount2;
    }

    public double multiply(){
        return this.amount1 * this.amount2;
    }

    public double divide(){
        return this.amount1 / this.amount2;
    }
}

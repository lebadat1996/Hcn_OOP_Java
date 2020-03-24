package oopHcn;

import java.util.Scanner;

public class HCN {
    private double width;
    private double height;

    public HCN() {

    }

    public HCN(double width, double height) {
        this.width = width;
        this.height = height;
    }

    void enterWidthHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter Width: ");
        this.width = scanner.nextDouble();
        System.out.print("enter Height: ");
        this.height = scanner.nextDouble();
    }

    double Area() {
        return this.width * this.height;
    }

    double ChuVi() {
        return (this.width + this.height) * 2;
    }
}

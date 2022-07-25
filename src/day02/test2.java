package day02;

import java.util.Scanner;

/**
 * @author Luck_Cheng
 * @user 23953
 * @date 2022/7/17 14:17
 * @project_name TestAll
 */

/*
 * 键盘输入的两套体系
 * 第一套体系：
 * nextInt();接收整数
 * nextDouble();接收小数
 * next();接收字符串
 * 特点：遇到空格、制表符、回车就停止接收。这些符号后面的就不会接受了。
 *
 * 第二套体系：
 * nextLine();接收字符串
 *
 * 总结：键盘录入的两套体系不能混用。
 * 弊端：先用nextInt,再用nextLine会导致下面的nextLine接收不到数据。
 * */
public class test2 {
    public static void main(String[] args) {
        car[] cars = new car[3];//定义对象数组
        Scanner scanner = new Scanner(System.in);


        double total = 0;
        double average = 0;

        for (int i = 0; i < cars.length; i++) {//键盘录入汽车信息

            System.out.println("请输入第:" + (i + 1) + " 辆车的信息！");
            System.out.println("品牌:");
            String brand = scanner.next();
            System.out.println("价格:");
            double price = scanner.nextDouble();
            System.out.println("颜色:");
            String color = scanner.next();

            day02.car car1 = new car(brand, price, color);//创建对象
            cars[i] = car1;//将对象添加到对象数组中
        }

        for (int i = 0; i < cars.length; i++) {//遍历查看
            System.out.println("品牌:" + cars[i].getBrand() + " 价格:" + cars[i].getPrice() + " 颜色:" + cars[i].getColor());

        }

        for (int i = 0; i < cars.length; i++) {//计算汽车的平均价格
            total += cars[i].getPrice();
        }
        System.out.println(cars.length + " 部汽车的平均价格为:" + (total / cars.length));
    }
}

class car {
    private String brand;
    private double price;
    private String color;

    public car() {
    }

    public car(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

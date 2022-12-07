package com.epam.rd.autotasks.pizzasplit;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        int numberOfPiece = scanner.nextInt();

        int tmp = Math.max(numberOfPeople,numberOfPiece);

        while (tmp%numberOfPeople!=0 || tmp%numberOfPiece!=0)
            tmp+=numberOfPiece;

        System.out.println(tmp/numberOfPiece);
    }
}

package com.codegym.display;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. In hinh chu nhat");
        System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
        System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left ");
        System.out.println("4. In hình tam giác cân.");
        System.out.println("0. Thoat");
        System.out.println(" Nhap vao su lua chon cua ban: ");
        while (true) {
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int a = 1; a <= 5; a++) {
                        for (int b = a; b > 1; b--) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    int number = 5;
                    while (number >= 1) {
                        for (int i = number; i > 1; i--) {
                            System.out.print("x ");
                        }
                        System.out.println();
                        number--;
                    }
                    break;
                case 4:
                    for (int x = 0; x < 5; x++) {
                        for (int y = 1; y <= 10; y++) {
                            if (y > (5 -1- x) && y < (5 + 1 + x)) {
                                System.out.print(" o ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();

                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("khong co su lua chon nao");
            }
        }
    }
}

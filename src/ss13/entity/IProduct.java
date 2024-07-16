package src.ss13.entity;

import java.util.Scanner;

public interface IProduct {
    void inputData(Scanner scanner, Product[] arrProduct, int index, Categories[] arrCategories);
    void displayData();
}

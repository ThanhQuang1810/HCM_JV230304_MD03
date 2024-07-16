package ss13.entity;

import java.util.Scanner;

public class Categories implements ICategories{
    private static int autoId = 0;

    private int catalogId;
    private String catalogName;
    private boolean catalogStatus;
    private String descriptions;

    public Categories() {
        this.catalogId=++autoId;
    }

    public Categories(int catalogId, String catalogName, String descriptions, boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }



    public static void setAutoId(int autoId) {
        Categories.autoId = autoId;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public boolean setCatalogName(String catalogName, Categories[] arrCategories) {
        this.catalogName = catalogName;
        return false;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String description) {
        this.descriptions = description;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

  // @Override
//    public String toString() {
//        return "Categories{" +
//                "catalogId=" + catalogId +
//                ", catalogName='" + catalogName + '\'' +
//                ", description='" + description + '\'' +
//                ", catalogStatus=" + catalogStatus +
//                '}';
//    }
  Scanner scanner = new Scanner(System.in);


    @Override
    public void inputData(Scanner scanner, Categories[] arrCategories, int index) {
        while (true) {
            System.out.print("Enter catalog name (max 50 characters, unique): ");
            String inputName = scanner.nextLine();
            if (setCatalogName(inputName, arrCategories)) {
                if (inputName.length() <= 50) {
                    this.catalogName = inputName;
                    break;
                } else {
                    System.out.println("Invalid catalog name or name already exists. Please try again.");
                }
            } else {
                System.out.println("Invalid catalog name or name already exists. Please try again.");
            }
        }

        System.out.print("Enter descriptions: ");
        this.descriptions = scanner.nextLine();

        while (true) {
            System.out.print("Enter catalog status (true/false): ");
            String inputStatus = scanner.nextLine();
            if (inputStatus.equalsIgnoreCase("true")) {
                this.catalogStatus = true;
                break;
            } else if (inputStatus.equalsIgnoreCase("false")) {
                this.catalogStatus = false;
                break;
            } else {
                System.out.println("Invalid catalog status. Please enter true or false.");
            }
        }
    }



    @Override
    public void displayData() {
            System.out.printf("| Id: %-4s | Name: %-15s | Status : %10s |\n",catalogId,catalogName,catalogStatus);

    }
}

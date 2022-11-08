package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empID = in.nextInt();
        String department = in.next();


        //old way
//        switch (empID) {
//            case 1:
//                System.out.println("Neco Ross");
//                break;
//            case 2:
//                System.out.println("Brian McConney");
//                break;
//            case 3:
//                System.out.println("Employee 3");
//                switch(department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management department");
//                        break;
//                    case "Legal":
//                        System.out.println("Legal department");
//                        break;
//                    default:
//                        System.out.println("Bad department");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("Enter something sensible");
//
//        }

        //new way
        switch (empID) {
            case 1 -> System.out.println("Neco Ross");
            case 2 -> System.out.println("Brian McConney");
            case 3 -> {
                System.out.println("Employee 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management department");
                    case "Legal" -> System.out.println("Legal department");
                    default -> System.out.println("Bad department");
                }
            }
            default -> System.out.println("Enter something sensible");
        }

    }
}


// Anthony Veigas VU2120023


import java.util.Stack;
import java.util.Scanner;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("User-Friendly Stack Program");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter an element to push onto the stack: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println(element + " has been pushed onto the stack.");
                }

                case 2 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty. Cannot pop.");
                    } else {
                        int poppedElement = stack.pop();
                        System.out.println("Popped element: " + poppedElement);
                    }
                }

                case 3 -> {
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Current stack contents: " + stack);
                    }
                }

                case 4 -> {
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
 }
}
}
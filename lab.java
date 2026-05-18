import java.util.Scanner;

class Student {
    int roll;
    String name;

    Student() {
        roll = 0;
        name = null;
    }

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n = sc.nextLine();

        Student s1 = new Student(r, n);
        s1.display();

    }
}
//  class Student {

//     int rollno;
//     String name;
//     int marks;

// }

// public class objarr {

//     public static void main(String[] args) 
//     {
//         S1.rollno = 6;
//         S1.name = "Kaif";
//         S1.marks = 96;

//           S2.rollno = 1;
//         S2.name = "Ayasha";
//         S2.marks = 99;

//           S3.rollno = 6;
//         S3.name = "Zardani";
//         S3.marks = 69;

//         Student students [] = new Student[3];
//         students [0]= S1;
//         students[1]= S2;
//         students[2]= S3;

//         for (i=0; i<students.length; i++) {

//          System.out.println(students[i].rollno + " " + students[i].marks + " " + students[i].name);        
    
//     }

    
// }
// }

class student {
    int rollno;
    String name;
    int marks;
}

public class objarr {
    public static void main(String[] args) {
        // 1. Create the objects first (using lowercase 'student')
        student S1 = new student();
        S1.rollno = 6;
        S1.name = "Kaif";
        S1.marks = 96;

        student S2 = new student();
        S2.rollno = 1;
        S2.name = "Ayesha";
        S2.marks = 90;

        student S3 = new student();
        S3.rollno = 6;
        S3.name = "Zaidan";
        S3.marks = 60;

        // 2. Create the array using the matching lowercase class name
        student students[] = new student[3];
        students[0] = S1;
        students[1] = S2;
        students[2] = S3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollno + " : " + students[i].marks + " : " + students[i].name);
        }
    }
}
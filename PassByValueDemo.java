class PassByValueDemo {

    static void changeNumber(int x) {
        System.out.println("  Inside changeNumber, before: x = " + x);
        x = 99;
        System.out.println("  Inside changeNumber, after:  x = " + x);
    }

    static void changeStudent(Student st) {
        System.out.println("  Inside changeStudent, before: " + st.completedCredits);
        st.completedCredits = 99;
        System.out.println("  Inside changeStudent, after:  " + st.completedCredits);
    }

    static void replaceStudent(Student st) {
        System.out.println("  Inside replaceStudent, before: " + st.name);
        st = new Student();
        st.name = "Temporary";
        System.out.println("  Inside replaceStudent, after:  " + st.name);
    }

    public static void main(String[] args) {

        int callerNumber = 10;
        System.out.println("Experiment A - Before: callerNumber = " + callerNumber);
        changeNumber(callerNumber);
        System.out.println("Experiment A - After:  callerNumber = " + callerNumber);

        System.out.println();

        Student st1 = new Student();
        st1.studentId = "BAI-201";
        st1.name = "Ali Ishtiaq";
        st1.completedCredits = 20;

        System.out.println("Experiment B - Before: " + st1.completedCredits);
        changeStudent(st1);
        System.out.println("Experiment B - After:  " + st1.completedCredits);

        System.out.println();

        Student st2 = new Student();
        st2.studentId = "BAI-202";
        st2.name = "Abdul Rehman Azam";
        st2.completedCredits = 25;

        System.out.println("Experiment C - Before: " + st2.name);
        replaceStudent(st2);
        System.out.println("Experiment C - After:  " + st2.name);
    }
}

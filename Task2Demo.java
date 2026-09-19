class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.studentId = "BAI-101";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "BAI-102";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        s1.addCredits(9);
        s2.addCredits(3);

        System.out.println(s1.summary());
        System.out.println(s2.summary());

        int degreeCredits = 130;
        int s1Remaining = s1.remainingCredits(degreeCredits);
        int s2Remaining = s2.remainingCredits(degreeCredits);

        System.out.println(s1.name + " remaining credits: " + s1Remaining);
        System.out.println(s2.name + " remaining credits: " + s2Remaining);
    }
}

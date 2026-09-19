class Task1Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "BAI-101";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        s2.studentId = "BAI-102";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

        s3.studentId = "BAI-103";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 60;

        System.out.println("--- Before change ---");
        System.out.println(s1.name + " -> " + s1.completedCredits);
        System.out.println(s2.name + " -> " + s2.completedCredits);
        System.out.println(s3.name + " -> " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 6;

        System.out.println("--- After change (only s2 modified) ---");
        System.out.println(s1.name + " -> " + s1.completedCredits);
        System.out.println(s2.name + " -> " + s2.completedCredits);
        System.out.println(s3.name + " -> " + s3.completedCredits);
    }
}

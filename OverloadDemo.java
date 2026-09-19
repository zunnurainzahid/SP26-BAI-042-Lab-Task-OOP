class OverloadDemo {

    void enroll(String courseCode) {
        System.out.println("Enrolled by course code: " + courseCode);
    }

    void enroll(String courseCode, int section) {
        System.out.println("Enrolled: " + courseCode + ", section " + section);
    }

    void enroll(int numericCourseCode) {
        System.out.println("Enrolled by numeric code: " + numericCourseCode);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.enroll("CSC241");
        demo.enroll("CSC241", 2);
        demo.enroll(241);
    }
}

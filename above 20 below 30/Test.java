//30
interface Exam {
    void setExam(String division, int mark);
    void showExam();
}

class Test implements Exam {
    private String division;
    private int mark;

    @Override
    public void setExam(String division, int mark) {
        this.division = division;
        this.mark = mark;
    }

    @Override
    public void showExam() {
        System.out.println("Division: " + division + ", Mark: " + mark);
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        test1.setExam("A", 85);
        test1.showExam();
        
        Test test2 = new Test();
        test2.setExam("B", 90);
        test2.showExam();
    }
}

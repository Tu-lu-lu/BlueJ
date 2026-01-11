package Week10;


/**
 * Write a description of class ScienceStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ScienceStudent extends Student {
    public ScienceStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }
    
    @Override
    public String calculateResult() {
        System.out.println("Science Student Result:");
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        setMarks(getMarks() + graceMarks);
        return calculateResult();
    }
}
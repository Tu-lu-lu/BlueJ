package Week10;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ManagementStudent extends Student {

    public ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }
    @Override
    public String calculateResult() {
        System.out.println("Management Student Result:");
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        setMarks(getMarks() + graceMarks);
        return calculateResult();
    }
}

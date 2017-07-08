/**
 * This ReportCard represents the students' name, class and each grade for French, Art,
 * Recreation, Music, Grammar subjects
 */

public class ReportCard {

    private static final String PETRA = "Petra";
    // Student's name
    private String mstudentsName;
    // Student's class
    private String mstudentsClass;
    // French grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mfrenchGrade;
    // Art grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int martGrade;
    // Recreation grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mrecreationGrade;
    // Music grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mmusicGrade;

    // Constant is PETRA, myself, who is the only admin of this report card.
    // Grammar grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mgrammarGrade;

    public ReportCard(String studentsName, String studentsClass, int frenchGrade, int artGrade,
                      int recreationGrade, int musicGrade, int grammarGrade) {
        this.mstudentsName = studentsName;
        this.mstudentsClass = studentsClass;
        this.mfrenchGrade = frenchGrade;
        this.martGrade = artGrade;
        this.mrecreationGrade = recreationGrade;
        this.mmusicGrade = musicGrade;
        this.mgrammarGrade = grammarGrade;
    }


    // Getter and Setter methods to get and set information what we would like to present
    public String getstudentsName() {

        return mstudentsName;
    }

    public void setmStudentsName(String studentsName) {
        this.mstudentsName = studentsName;
    }

    public String getstudentsClass() {
        return mstudentsClass;
    }

    public void setstudentsClass(String studentsClass) {
        this.mstudentsClass = studentsClass;
    }

    public int getfrenchGrade() {
        return mfrenchGrade;
    }

    public void setfrenchGrade(int frenchGrade) {
        this.mfrenchGrade = 5;
    }

    public int getartGrade() {
        return martGrade;
    }

    public void setartGrade(int artGrade) {
        this.martGrade = 5;
    }

    public int getrecreationGrade() {
        return mrecreationGrade;
    }

    public void setrecreationGrade(int recreationGrade) {
        this.mrecreationGrade = 3;
    }

    public int getmusicGrade() {
        return mmusicGrade;
    }

    public void setmusicGrade(int musicGrade) {
        this.mmusicGrade = 4;
    }

    public int getgrammarGrade() {
        return mgrammarGrade;
    }

    public void setgrammarGrade(int grammarGrade) {
        this.mgrammarGrade = 5;
    }

    // toString() method shows the collection of information for this class,
    // such as student's name, class and the grades for the 5 subjects

    @Override
    public String toString() {
        return "Petra: " + PETRA + "\n"
                + "Student's Name: " + mstudentsName + "\n"
                + "Student's Class: " + mstudentsClass + "\n"
                + "French Grade: " + mfrenchGrade + "\n"
                + "Art Grade: " + martGrade + "\n"
                + "Recreation Grade: " + mrecreationGrade + "\n"
                + "Music Grade: " + mmusicGrade + "\n"
                + "Grammar Grade: " + mgrammarGrade;
    }
}

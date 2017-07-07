/**
 * This ReportCard represents the students' name, class and each grade for French, Art,
 * Recreation, Music, Grammar subjects
 */

public class ReportCard {

    private static final String PETRA = "Petra";
    // Student's name
    private String mStudentsName;
    // Student's class
    private String mStudentsClass;
    // French grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mFrenchGrade;
    // Art grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mArtGrade;
    // Recreation grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mRecreationGrade;
    // Music grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mMusicGrade;

    // Constant is PETRA, myself, who is the only admin of this report card.
    // Grammar grade, int 1-5 (1 = fail, 5 = excellent) following Hungarian grading system
    private int mGrammarGrade;

    public ReportCard(String studentsName, String studentsClass, int frenchGrade, int artGrade,
                      int recreationGrade, int musicGrade, int grammarGrade) {
        this.mStudentsName = studentsName;
        this.mStudentsClass = studentsClass;
        this.mFrenchGrade = frenchGrade;
        this.mArtGrade = artGrade;
        this.mRecreationGrade = recreationGrade;
        this.mMusicGrade = musicGrade;
        this.mGrammarGrade = grammarGrade;
    }


    // Getter and Setter methods to get and set information what we would like to present
    public String getmStudentsName() {

        return mStudentsName;
    }

    public void setmStudentsName(String StudentsName) {
        this.mStudentsName = StudentsName;
    }

    public String getmStudentsClass() {
        return mStudentsClass;
    }

    public void setmStudentsClass(String StudentsClass) {
        this.mStudentsClass = StudentsClass;
    }

    public int getmFrenchGrade() {
        return mFrenchGrade;
    }

    public void setmFrenchGrade(int FrenchGrade) {
        this.mFrenchGrade = FrenchGrade;
    }

    public int getmArtGrade() {
        return mArtGrade;
    }

    public void setmArtGrade(int ArtGrade) {
        this.mArtGrade = ArtGrade;
    }

    public int getmRecreationGrade() {
        return mRecreationGrade;
    }

    public void setmRecreationGrade(int RecreationGrade) {
        this.mRecreationGrade = RecreationGrade;
    }

    public int getmMusicGrade() {
        return mMusicGrade;
    }

    public void setmMusicGrade(int MusicGrade) {
        this.mMusicGrade = MusicGrade;
    }

    public int getmGrammarGrade() {
        return mGrammarGrade;
    }

    public void setmGrammarGrade(int GrammarGrade) {
        this.mGrammarGrade = GrammarGrade;
    }

    // toString() method shows the collection of information for this class,
    // such as student's name, class and the grades for the 5 subjects

    @Override
    public String toString() {
        return "Petra: " + PETRA + "\n"
                + "Student's Name: " + mStudentsName + "\n"
                + "Student's Class: " + mStudentsClass + "\n"
                + "French Grade: " + mFrenchGrade + "\n"
                + "Art Grade: " + mArtGrade + "\n"
                + "Recreation Grade: " + mRecreationGrade + "\n"
                + "Music Grade: " + mMusicGrade + "\n"
                + "Grammar Grade: " + mGrammarGrade;
    }
}

package lambda_functional_programming;

public class Courses {

    private String Season;
    private String courseName;
    private int averageScore;
    private int numberOfStudents;


    public Courses() { // default constructor'�n yerine olu�turdu�umuz parametresiz constructor
                       // parametresiz obje olu�turdu�umuzda hata almamak i�in bu constructor'� olu�turuyoruz.
        // Parametresiz constructor lardan olu�an objelerde variable'lara default de�er atan�r.

    }


    public Courses(String season, String courseName, int averageScore, int numberOfStudents) {// parametreli constructor
        Season = season;
        this.courseName = courseName;
        this.averageScore = averageScore;
        this.numberOfStudents = numberOfStudents;
    }



    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }


    @Override
    public String toString() {
        return "Course: Season=" + Season + ", courseName=" + courseName + ", averageScore=" + averageScore
                + ", numberOfStudents=" + numberOfStudents;
    }
}

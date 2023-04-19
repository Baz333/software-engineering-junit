public class Account {

    private int studentNo;
    private String password;
    private boolean studentUnionMember;
    private int year;
    private String campus;
    private String school;
    private String course;

    public Account(int studentNo, String password, boolean studentUnionMember, int year, String campus, String school, String course) {
        setStudentNo(studentNo);
        setPassword(password);
        setStudentUnionMember(studentUnionMember);
        setYear(year);
        setCampus(campus);
        setSchool(school);
        setCourse(course);
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        String str = "" + studentNo;
        if(str.length() == 8 && str.substring(0, 3).equals("200")) {
            this.studentNo = studentNo;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStudentUnionMember() {
        return studentUnionMember;
    }

    public void setStudentUnionMember(boolean studentUnionMember) {
        this.studentUnionMember = studentUnionMember;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year >= 0 && year <= 8) {
            this.year = year;
        }
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        if(campus.equals("Waterford - Cork Road") || campus.equals("Waterford - College Street") || campus.equals("Waterford - The Granary") || campus.equals("Carlow") || campus.equals("Wexford") || campus.equals("All campuses")) {
            this.campus = campus;
        } else {
            this.campus = "All campuses";
        }
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        if(school.equals("Adult Education") || school.equals("Business") || school.equals("Engineering") || school.equals("Health Sciences") || school.equals("Humanities") || school.equals("Science and Computing")) {
            this.school = school;
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

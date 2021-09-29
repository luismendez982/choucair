package co.com.choucair.certification.proyectobase.model;

public class AcademyChoucairData {
    private String strUser;
    private String strPassword;
    private String strCourse;

    public static AcademyChoucairData get(int i) {
        return null;
    }

    public String getStrUser() {
        return strUser;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrCourse() {
        return strCourse;
    }

    public void setStrCourse(String strCourse) {
        this.strCourse = strCourse;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }
}

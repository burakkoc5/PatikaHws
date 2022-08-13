package StudentGradeSystem;

public class Course {

    String name;

    String code;

    String prefix;

    int note;

    Teacher courseTeacher;

    int verbalNote;

    public Course(String name,String code,String prefix){
        this.code = code;
        this.name = name;
        this.prefix = prefix;
        this.note = 0;
        verbalNote=0;

    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }


    
}

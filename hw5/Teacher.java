package hw5;

public class Teacher {
    private Integer id;
    private String name;
    private String surname;
    private String subject;

    public Teacher() {
    }

    public Teacher(Integer id, String name, String surname, String subject) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.subject = subject;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

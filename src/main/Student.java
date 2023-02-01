package main;

public class Student {
    private final String name;
    private final Grade grade;
    private Integer group;
    private String secretNickName;

    public Student(String name, Grade grade, Integer group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = secretNickName;
    }

    public void upgrade() {
        this.grade.upgrade();
    }

    public void downgrade() {
        this.grade.downgrade();
    }
}

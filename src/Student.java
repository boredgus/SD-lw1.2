import java.util.Objects;

public final class Student {
    private final int id;
    private final String name;

    public Student(int _id, String _name) {
        this.id = _id;
        this.name = _name;
    }

    public int getId() { return this.id; }
    public String getName(){
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(id, name);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                name.equals(student.name);
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Student clone() {
        Student newStudent = new Student(0,"");
        newStudent = this;
        return newStudent;
    }
}
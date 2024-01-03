public class Student {
    private String id;
    private String name;
    private String dateOfBirth;
    private String classList;

    public Student(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    /*
    Annotation are a type of metadata.
    Metadata is a way of formally describing additional information about our code
    Annotation are more structured, and have more meaning than comment
    This is because they can be used by the compiler, or other types of pre-processing functions, to get
    information about the code


    Overriden method is a special method in Java, that other classes can implement, if they use a specified method
    signature
     */
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}

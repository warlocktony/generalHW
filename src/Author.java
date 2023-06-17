import java.util.Objects;

public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    @Override
    public String toString() {
        return "Author - " + this.firstName + "" + this.secondName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        if (this.getClass() != o.getClass()) {
            return false;
        }
        Author author = (Author) o;

        return firstName.equals(author.getSecondName()) && secondName.equals(author.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName);
    }
}

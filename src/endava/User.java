package endava;

import java.time.LocalDateTime;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String mail;
    private Status status;
    private LocalDateTime localDateTime;

    public User(String firstName, String lastName, int age, String mail, Status status, LocalDateTime localDateTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mail = mail;
        this.status = status;
        this.localDateTime = localDateTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return String.format("User firstname=%s lastname=%s age=%d mail=%s status=%s timestamp=%s",
                firstName, lastName, age, mail, status.toString(), localDateTime.toString());
    }
}

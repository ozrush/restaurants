package ru.bokhan.education.model;

public class User extends AbstractNamedEntity {

    private String email;
    private String password;
    private Role role;
    private Vote vote;

    public User() {
    }

    public User(String name, String email, String password, Role role, Vote vote) {
        this(null, name, email, password, role, vote);
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.getRole(), u.getVote());
    }

    public User(Integer id, String name, String email, String password, Role role, Vote vote) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.role = role;
        this.vote = vote;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Vote getVote() {
        return vote;
    }

    public void setVote(Vote vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email=" + email +
                ", name=" + name +
                ", role=" + role +
                ", vote=" + vote +
                '}';
    }
}

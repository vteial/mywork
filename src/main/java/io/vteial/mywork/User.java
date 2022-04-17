package io.vteial.mywork;

import lombok.Data;

@Data
public class User {

    long id;

    String name;

    public User() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(User.class.getSimpleName());
        sb.append("[ id : ");
        sb.append(this.id);
        sb.append(", name : ");
        if(this.name != null) {
            sb.append(this.name);
        } else {
            sb.append("NULL");
        }
        sb.append(" ]");
        return sb.toString();
    }
}

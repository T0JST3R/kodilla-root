package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselid;

    public LibraryUser(String firstname, String lastname, String peselid) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselid = peselid;
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselid='" + peselid + '\'' +
                '}';
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselid, that.peselid);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselid.hashCode();
        return result;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselid() {
        return peselid;
    }
}

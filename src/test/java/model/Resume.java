package model;

import java.util.Objects;

public class Resume {
    protected String gender;
    private int age;
    private String address;
    private boolean readyToRelocate;

    public Resume(String gender, int age, String address, boolean readyToRelocate) {
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.readyToRelocate = readyToRelocate;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean isReadyToRelocate() {
        return readyToRelocate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resume resume = (Resume) o;
        return age == resume.age && readyToRelocate == resume.readyToRelocate && Objects.equals(gender, resume.gender) && Objects.equals(address, resume.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, age, address, readyToRelocate);
    }
}

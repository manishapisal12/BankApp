package com.mastek.core.model;

public class Person {
    private int pid;
    private String first_name;
    private String last_name;
    private Address address;
    private Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    private Person(int pid, String first_name, String last_name, Address address) {
        super();
        this.pid = pid;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (pid != other.pid)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", first_name=" + first_name + ", last_name=" + last_name + ", address=" + address
                + "]";
    }
    
}



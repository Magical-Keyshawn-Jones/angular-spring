package com.kiwi.angularbackend;

public class User {
    public String firstName;
    public String lastName;
    public String username;
    public String password;
    public String email;
    public String gender;
    public int age;
    public boolean admin;
    public String fullName = this.firstName + " " + this.lastName;

    // // Constructor
    // public User(String firstName, String lastName, int age ) {
    //     this.firstName = firstName;
    //     this.lastName = lastName;
    //     this.age = age;
    // }


    // Getters
    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getUsername() { return username;}

    public String getPassword() { return password; }

    public String getEmail() { return email; }

    public String getGender() { return gender; }

    public int getAge() { return age; }

    public boolean getAdmin() { return admin;}

    // Setters
    public void setFirstName( String firstName ) { this.firstName = firstName; }

    public void setLastName( String lastName ) { this.lastName = lastName; }

    public void setUsername( String username ) { this.username = username; }

    public void setPassword( String password ) { this.password = password; }

    public void setEmail( String email ) { this.email = password; }

    public void setGender( String gender) { this.gender = gender; }

    public void setAge( int age ) { this.age = age; } 

    // Methods
    // public User[] addUser( User newUser ) {
    //     return 
    // }
}

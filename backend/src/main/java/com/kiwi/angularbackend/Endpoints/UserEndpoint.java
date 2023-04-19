package com.kiwi.angularbackend.Endpoints;

import java.util.Arrays;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiwi.angularbackend.User;

@RestController
@RequestMapping("/users")
public class UserEndpoint {

    // Database
    User user1 = new User();
    User user2 = new User();
    User user3 = new User();
    User user4 = new User();

    { user1.setFirstName("Kiwi"); }
    { user2.setFirstName("Bellventus"); }
    { user3.setFirstName("Kriegster"); }
    { user4.setFirstName("Butt"); }

    User[] data = { user1, user2, user3 };

    private void addToDatabase( Object newObject) {   
        // Copying old data and adding an extra slot
        User[] updatedData = Arrays.copyOf(data, data.length + 1);

        // Adding the new data to the array
        updatedData[updatedData.length - 1] = user4;

        // updating the old data
        data = updatedData;
    }
    
    @GetMapping
    public User[] getUsers() {
        return data;
    }

    // Return a String with a response
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User newUser) {
        addToDatabase(newUser); 
        return ResponseEntity.ok(newUser);
    }
}

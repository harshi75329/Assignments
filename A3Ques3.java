package Assignment3;

import java.util.Optional;

//UserService interface
interface UserService {

 // Default method to return a welcome message
 default String getWelcomeMessage() {
     return "Welcome, Guest!";
 }

 // Abstract method to get a user's name
 Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

 @Override
 public Optional<String> getUser(String name) {
     
     return Optional.ofNullable(name);
 }

 // Method to get the final welcome message
 public String getFinalMessage(String name) {
     return getUser(name)
             .map(userName -> "Welcome, " + userName + "!")
             .orElse(getWelcomeMessage()); // Use default method if no name is present
 }
}

//Step 4: Test the implementation
public class A3Ques3 {
 public static void main(String[] args) {
     UserServiceImpl userService = new UserServiceImpl();

     // if User provides a name
     System.out.println(userService.getFinalMessage("Alice"));

     // if User provides null
     System.out.println(userService.getFinalMessage(null));
 }
}

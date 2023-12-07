package labs.W8;
@UserPermission("USER")
public class User {
    String username;

    public void User(String u){
        username = u;
    }

    public String getUsername(){
        return this.username;
    }
}

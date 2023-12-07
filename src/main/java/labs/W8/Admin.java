package labs.W8;

@UserPermission("ADMIN")
public class Admin {
    String username;

    public void User(String u){
        username = u;
    }

    public String getUsername(){
        return this.username;
    }
}

package labs.W8;

public class MessagingSystem {

    @RequiresPermission
    public void sendMessage(User user, String msg){
        System.out.println("You are not allowed to send message");
    }


    @RequiresPermission("ADMIN")
    @CanSendMessage
    public void sendMessage(Admin admin, String msg){
        System.out.println(msg);
    }
    public static void main(String[] args){

    }
}

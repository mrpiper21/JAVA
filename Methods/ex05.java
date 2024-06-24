package Methods;
import java.util.*;

public class ex05 {
    private String CarNo, Name, Address;
    private LinkedList<String> UserInfo = new LinkedList<>();
    private int age;

    public List<String> getUserInfo (){
        return this.UserInfo;
    }
    public void SetUserDetails(String CardNumber, String Name, String Address, String age){
        this.UserInfo.add(CardNumber);
        this.UserInfo.add(Name);
        this.UserInfo.add(Address);
        this.UserInfo.add(age);
    }

    public static void main(String args[]){
        ex05 B = new ex05();
        B.SetUserDetails("208jduJg", "Bernard", "Po box-3", "23");
        if(B.getUserInfo().isEmpty()){
            System.out.println("Empty");
        } else {
            Iterator<String> b = B.getUserInfo().iterator();
            while (b.hasNext()){
                System.out.println(b.next());
        }

        }

    }
}
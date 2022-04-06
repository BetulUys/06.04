package encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
*/
public class UserMain {
    public static void main(String[] args) {
        List<User> UserList = new ArrayList<>();
        User user1 = new User();
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı adı giriniz");
        user1.setUsername(scan.nextLine());
        boolean deger = true;
        while (deger) {
            System.out.println("Şifre giriniz");
            user1.setPassword(scan.nextLine());
            if (user1.getPassword().length() >= 6) {
                UserList.add(user1);
                deger = false;
                break;
            } else {
                System.out.println("şifre uzunluğu en az 6 karakter olmalıdır");
            }
        }

        User user2 = new User();
        System.out.println("Kullanıcı adı giriniz");
        user2.setUsername(scan.nextLine());
        deger = true;
        while (deger) {
            System.out.println("Şifre giriniz");
            user2.setPassword(scan.nextLine());
            if (user2.getPassword().length() >= 6) {
                UserList.add(user2);
                deger = false;
                System.out.println(deger);
                System.out.println(UserList);
                break;
            } else {
                System.out.println("şifre uzunluğu en az 6 karakter olmalıdır");
            }
        }
        System.out.println(UserList);
    }
















  /*      public static Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            List<User> listOfUsers = new ArrayList<User>();

            User user1 = new User();
            System.out.println(user1);
            System.out.println("Adinizi giriniz");
            user1.setUsername(scanner.next());
            String password = "";
            boolean bl = true;
            while(bl ){
                System.out.println("Sifrenizi giriniz");
                password = scanner.next();

                if(password.length()< 6){

                    System.out.println("hatali veri girdiniz. 6 veya daha fazla karakter giriniz");

                }else{
                    bl= true;
                    break;
                }
            }

            user1.setPassword(password);



            listOfUsers.add(user1);
            System.out.println(listOfUsers.get(0));
            System.out.println("=========================");
            User user2 = new User();


            System.out.println("User2 icin adinizi giriniz");
            user2.setUsername(scanner.next());

            String pwd = "";
            bl = true;
            while(bl){

                System.out.println("Lutfen sifrenizi giriniz");
                pwd = scanner.next();
                if(pwd.length()<6){
                    System.out.println("hatali veri girdiniz. 6 veya daha fazla karakter giriniz");
                }else{
                    bl=false;
                }
            }

            user2.setPassword(pwd);
            listOfUsers.add(user2);

            System.out.println(listOfUsers.get(1));


        }*/
}


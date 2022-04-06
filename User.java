package encapsulation;
//import static encapsulation.UserMain.scanner;

public class User {

   private String id="3456";
   private  String username;
   private  String password;
   private  boolean active=true;
   private  boolean signedIn=true;


   public User(){}
    public User(String id, String username, String password, boolean active, boolean signedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
    /*  private String id = "65431";
        private String username;
        private String password;
        private boolean active = true;
        private boolean signedIn = true;

        public User(String id, String username, String password, boolean active, boolean signedIn){
            this.id = id;
            this.username = username;
            this.password = password;
            this.active = active;
            this.signedIn = signedIn;
        }

        public User() {

        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public boolean isSignedIn() {
            return signedIn;
        }

        public void setSignedIn(boolean signedIn) {
            this.signedIn = signedIn;
        }


        @Override
        public String toString() {
            return "User{" +
                    "id='" + id + '\'' +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", active=" + active +
                    ", signedIn=" + signedIn +
                    '}';
        }*/
    }


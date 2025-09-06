public class User {

    private String name;
    private String email;
    private int id;


    public User(int id,String email,String name){
        this.id=id;
        this.name=name;
        this.email=email;
    }

    // Geters and Setters

    public String getName(){
        return this.name;
    }
    public String setName(String name){
        return this.name=name;
    }

    public String getEmail(){
        return this.email;
    }
    public String setEmail(String email){
        return this.email=email;
    }
}

class perent{
    public void pprint(){
        System.out.println("this is perent class ");
    }
}
class child extends perent{
    public void cprint(){
        System.out.println("this is child class");
    }
}
public class pr17 {
    public static void main(String[] args) {
        perent a=new perent();
        child aa=new child();
        a.pprint();
        aa.pprint();
    }
}

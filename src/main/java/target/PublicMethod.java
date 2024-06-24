package target;

public class PublicMethod {

    public String hasReturn() {
        System.out.println("PublicMethod -> hasReturn");
        return "PublicMethod -> hasReturn";
    }

    public void hasNotReturn() {
        System.out.println("PublicMethod -> hasNotReturn");
    }
}

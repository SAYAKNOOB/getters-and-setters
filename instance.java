import java.persistence
    
class instance {


    Float a;

    void setval(float a)
    {
        this.a = a;
    }

    void getter() {
        System.out.println(a);
    }

    void square() {

        System.out.println(a);
    }

    public static void main(String args[]) {
        instance m =new instance();
        instance n =new instance();

        m.getter();

        n.getter();

        m.setval(10);

        n.setval(12);

        m.getter();

        n.getter();

    }
}

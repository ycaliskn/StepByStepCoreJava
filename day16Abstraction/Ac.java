package day16Abstraction;

public interface Ac {
    public abstract void digital();
    void klima();

    default void ufleme(){
        System.out.println("Ac hava ufler");
    }

    static void acmaKapama(){
        System.out.println("Ac yi acip kapatabiliriz");
    }


}

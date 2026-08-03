interface Animal {

    void sound();
}

public class InterfaceExample implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog Bark");
    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.sound();
    }
}

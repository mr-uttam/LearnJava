public class InstanceInitializerBlock {

    {
        System.out.println("Instance Initializer Block");
    }

    InstanceInitializerBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InstanceInitializerBlock();
    }
}

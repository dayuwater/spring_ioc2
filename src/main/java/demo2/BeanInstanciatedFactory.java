package demo2;

public class BeanInstanciatedFactory {
    public BeanInstanciatedFactory() {
        System.out.println("Factory Created");
    }

    public BeanInstanciated newBean(){
        return new BeanInstanciated();
    }
}

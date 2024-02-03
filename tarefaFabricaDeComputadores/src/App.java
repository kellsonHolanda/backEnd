public class App{
    

    public static void main(String[] args) throws Exception {
        Customer cliente = new Customer("C", true);
        Factory factory = getFactory(cliente);
        PC pc = factory.create(cliente.getGradeRequest());
        pc.description();
    }

    private static Factory getFactory(Customer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new SemContractFactory();
        }
    }
}
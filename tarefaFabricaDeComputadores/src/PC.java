public abstract class PC {
    
        private int tag;
        private String model;
        private double price;
        
        public PC(int tag, String model, double price) {
            this.tag = tag;
            this.model = model;
            this.price = price;
        }

        public void description(){
            System.out.println("De acordo com o vínculo indicado (com contrato ou sem ontrato), computador escolhido tem a seguinte descição: ");
            System.out.println("Numeração " + tag);
            System.out.println("Modelo " + model);
            System.out.println("Preço " + price);
        }

        




}

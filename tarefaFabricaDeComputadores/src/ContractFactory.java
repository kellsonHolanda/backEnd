public class ContractFactory extends Factory {
    @Override
    PC retrievePC(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Lenovo(9876500, "cheio", 8.88);
        } else if ("B".equals(requestedGrade)) {
            return new Dell(120, "Inspiron3", 4498.00);
        }  else if ("C".equals(requestedGrade)) {
            return new HP(440, "UltraBook 500", 1900.90);
        }
        else {
            return null;
        }
    }
}
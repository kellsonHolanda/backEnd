public class SemContractFactory extends Factory{
    @Override
    PC retrievePC(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Dell(100, "Inspiron", 5498.00);
        }  else if ("B".equals(requestedGrade)) {
            return new HP(400, "UltraBook 440", 2149.90);
        }
        else {
            return null;
        }
    }
}

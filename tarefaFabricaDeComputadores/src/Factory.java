public abstract class Factory {

    public PC create(String requestedGrade) {
        PC pc = retrievePC(requestedGrade);
        
        return pc;
    }

    abstract PC retrievePC(String requestedGrade);
    
}
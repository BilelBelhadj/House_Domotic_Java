public final class Garden {

    //attributs
    private boolean irrigation;

        
    //methodes
    //getters
    public boolean getIrrigation() {
        return this.irrigation;
    }

    //setters
    public void setIrrigation(boolean irrigation) {
        this.irrigation = irrigation;
    }

    public String toString(){
        return "|Irrigation : " + getIrrigation();
    }
    
    Garden(boolean irrigation){
        this.irrigation = irrigation;
    }
    
}

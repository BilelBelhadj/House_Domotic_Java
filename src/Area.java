public abstract class Area {

    //attributs
    private String  name = "";
    private boolean window;
    private boolean door;
    private boolean light;

    
    public Area(String  name, boolean window, boolean door, boolean light){
        this.name = name;
        this.window = window;
        this.door = door;
        this.light = light;
    }


    //methodes
    //getters pour retourner les valeurs des attributs privet
    public String getName() {
        return this.name;
    }

    public boolean getWindow() {
        return this.window;
    }

    public boolean getDoor() {
        return this.door;
    }

    public boolean getLight() {
        return this.light;
    }

    //setters pour changer lesvaleurs des attributs privet
    public void setName(String name) {
        this.name = name;
    }

    public void setWindow(boolean window) {
        this.window = window;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public String toString(){
        return "|Nom : " + getName() + "|Window statu : " + getWindow() + "|Door statu" + getDoor();
    }

    //affichaer des informations additionelle sur la grandeur de  la piece
    public void description(String desc){
        System.out.println(desc);
    }
}

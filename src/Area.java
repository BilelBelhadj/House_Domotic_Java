public abstract class Area {

    //attributs
    private String  name = "";
    private boolean window;
    private boolean door;

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

    public String toString(){
        return "|Nom : " + getName() + "|Window statu : " + getWindow() + "|Door statu" + getDoor();
    }
}

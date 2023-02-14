public class Room extends Area{

    public Room(String  name, boolean window, boolean door, boolean light){
        super(name);
        super(window);
        super(door);
        super(light);
    }
    //affichaer des informations additionelle sur la grandeur de  la chambre
    public void description(String desc){
        System.out.println(desc);
    }
}

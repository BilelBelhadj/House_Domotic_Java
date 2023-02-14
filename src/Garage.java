public class Garage extends Area{

    public Garage(String  name, boolean window, boolean door, boolean light){
        super(name);
        super(window);
        super(door);
        super(light);
    }
    
    
    //affichaer des informations additionelle sur la grandeur de  la piece
    public void description(String desc){
        System.out.println(desc);
    }

}

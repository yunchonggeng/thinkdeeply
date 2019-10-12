package gof.prototype;

/**
 * @program: main
 * @description:
 * @author: william
 * @create: 2019-09-04 22:22
 **/
class Prototype implements Cloneable {
    @Override
    public Prototype clone(){
        Prototype prototype = null;
        try{
            prototype = (Prototype)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototype;
    }
}

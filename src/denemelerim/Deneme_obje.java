package denemelerim;

public class Deneme_obje {
    static int count=0;
    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Deneme_obje obj1=new Deneme_obje();
        Deneme_obje obj2=new Deneme_obje();
        System.out.println("obje 1 count : "+obj1.count);
        System.out.println("obje 2 count : "+obj2.count);

        obj1.increment();
        System.out.println("obje 1 count : "+obj1.count);
        System.out.println("obje 2 count : "+obj2.count);
        obj2.increment();
        System.out.println("obje 1 count : "+obj1.count);
        System.out.println("obje 2 count : "+obj2.count);





    }
    public static void maas(){

    }
}

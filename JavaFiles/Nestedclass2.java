class Outer{
    int outer_x=100;
    class Inner{
        void display(){
            System.out.println("display:outer_x ="+outer_x);
        }
    }
}
class Nestedclass{
 public static void main(String[] args) {
     Outer outer=new Outer();
     Outer.Inner obj=outer.new Inner();
     obj.display();
    }
}
public class InterfacesInJava {
    public static void main(String[] args){
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}


class Queen implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal in all four direction");
    }
}
class Rook implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, Left, Right");
    }
}
class King implements ChessPlayer{
   public void moves(){
        System.out.println("Up, Down, Left, Right, Diagonal by 1 step only.");
    }
}
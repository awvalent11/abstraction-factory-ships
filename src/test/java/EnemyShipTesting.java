import org.example.EnemyShip;
import org.example.EnemyShipBuilding;
import org.example.UFOEnemyShipBuilding;

public class EnemyShipTesting {
    public static void main(String[] args) {
        // EnemyShipBuilding handles orders for new EnemyShips
        // You send it a code using the orderTheShip method &
        // it sends the order to the right factory for creation
        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderThisShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderThisShip("UFO Boss");
        System.out.println(theBoss + "\n");
    }
}

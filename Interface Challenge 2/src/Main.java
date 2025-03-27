import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Hero", 100, 50);
        System.out.println("Initial player state: " + player);

        List<String> savedData = player.write();
        player.setHitPoints(80);
        player.setWeapon("Axe");
        System.out.println("Modified player state: " + player);

        player.read(savedData);
        System.out.println("Restored player state: " + player);

        Monster monster = new Monster("Dragon", 200, 80);
        System.out.println("Initial monster state: " + monster);

        List<String> monsterData = monster.write();
        monster.read(monsterData);
        System.out.println("Restored monster state: " + monster);
    }
}

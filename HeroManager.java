import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;

    public HeroManager() {
        heroes = new ArrayList<>();
    }

    
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    
    public boolean removeHero(String name) {
        return heroes.removeIf(hero -> hero.getName().equalsIgnoreCase(name));
    }

    
    public void bubbleSortByPower() {
        for (int i = 0; i < heroes.size() - 1; i++) {
            for (int j = 0; j < heroes.size() - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    
    public void insertionSortByPower() {
        for (int i = 1; i < heroes.size(); i++) {
            Hero key = heroes.get(i);
            int j = i - 1;
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j--;
            }
            heroes.set(j + 1, key);
        }
    }

    
    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    
    public void displayHeroesAs2DArray() {
        String[][] heroArray = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            Hero h = heroes.get(i);
            heroArray[i][0] = h.getName();
            heroArray[i][1] = String.valueOf(h.getPowerLevel());
            heroArray[i][2] = h.getAffiliation().toString();
        }

        System.out.println("\n2D Array Format:");
        System.out.println(Arrays.deepToString(heroArray));
    }
}

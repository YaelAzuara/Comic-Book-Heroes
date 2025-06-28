public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        
        System.out.println("Original Hero List:");
        manager.displayHeroes();

        
        manager.bubbleSortByPower();
        System.out.println("\nAfter Bubble Sort by Power Level:");
        manager.displayHeroes();

        
        manager.insertionSortByPower();
        System.out.println("\nAfter Insertion Sort by Power Level:");
        manager.displayHeroes();

        
        System.out.println("\nRemoving Batman...");
        manager.removeHero("Batman");
        manager.displayHeroes();

        
        System.out.println("\nAdding new hero: Iron Man...");
        manager.addHero(new Hero("Iron Man", 88, Affiliation.AVENGERS));
        manager.displayHeroes();

        
        manager.displayHeroesAs2DArray();
    }
}

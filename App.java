public class App {
    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.move();  
        hero.move("maju");  
        
        Enemy enemy = new Enemy();
        enemy.move(); 
        enemy.move(1000);  

        Character c1 = new Hero();
        c1.move();  
        
        Character c2 = new Enemy();
        c2.move(); 
        
        Character c3 = new Witch();
        c3.move(); 
        
        Character c4 = new Witch();
        Fighter fighter = (Fighter)c4;
        fighter.move(); 
    }
}
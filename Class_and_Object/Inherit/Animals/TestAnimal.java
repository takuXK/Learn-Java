package Class_and_Object.Inherit.Animals;

public class TestAnimal {
    public static void main(String[] args) {
        // Ragdoll cat
        RagdollCat rd = new RagdollCat();
        rd.Eat();
        rd.Drink();
        rd.CatchMouse();
        // Husky dog
        HuskyDog hk = new HuskyDog();
        hk.WatchHouse();
        hk.MakeTrouble();
        // Teddy dog
        TeddyDog td = new TeddyDog();
        td.ChasePlate();
    }
}

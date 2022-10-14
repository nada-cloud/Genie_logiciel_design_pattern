package person;


public class Main {
    public static void main(String[] args) {

        Person tom = new Teacher("Tom") ;

        Person tomG = new GlassesDecorator(tom);
        System.out.println("My name is "+tom.getName()+", I am a/an "+ tom.getTitle()+", I wear "+ tomG.getClothes() );
        Person tomGT = new WhiteShirtDecorator(tomG);

    }
}

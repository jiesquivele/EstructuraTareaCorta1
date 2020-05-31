package cr.ac.ulead;

public abstract class Main {

    public static void main(String[] args) {

        System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("*** WELCOME TO THE UNDERWATER REALM ***");
        System.out.println("----------------------------------------");
        System.out.println("You'll now learn about 7 different animals of the following 4 types:");
        System.out.println("\n");
        System.out.println("- Fish");
        System.out.println("- Mammals");
        System.out.println("- Echinoderms");
        System.out.println("- Arthropods");
        System.out.println("\n");

        Fish fish = new Fish();
        fish.setSex(Sex.BOTH);
        fish.setFins(4);
        fish.setTailSize(TailSize.SMALL);
        System.out.println("This fish has " + fish.getSex() + " sexes... it's a hermaphrodite.");
        System.out.println("This fish has " + fish.getFins() + " fins.");
        System.out.println("This fish has a " + fish.getTailSize() + " size tail.");
        fish.swim(fish.getFins());
        fish.blowBubbles();

        System.out.println("\n");

        Fish shark = new Fish();
        shark.setSex(Sex.MALE);
        shark.setFins(5);
        shark.setTailSize(TailSize.MEDIUM);
        shark.setTeethType(TeethType.SHARP);
        System.out.println("This shark is a " + shark.getSex() + ".");
        System.out.println("This shark has " + shark.getFins() + " fins.");
        System.out.println("This shark has a " + shark.getTailSize() + " size tail.");
        shark.startFeedingFrenzy();
        shark.eat(shark.getTeethType());

        System.out.println("\n");

        Fish mantaRay = new Fish();
        mantaRay.setSex(Sex.FEMALE);
        mantaRay.setFins(4);
        mantaRay.setTailSize(TailSize.LONG);
        mantaRay.setTeethType(TeethType.FLAT);
        System.out.println("This manta ray is a " + mantaRay.getSex() + ".");
        System.out.println("This manta ray has " + mantaRay.getFins() + " fins.");
        System.out.println("This manta ray has a " + mantaRay.getTailSize() + " tail.");
        mantaRay.eat(mantaRay.getTeethType());

        System.out.println("\n");

        Mammal orca = new Mammal();
        orca.setSex(Sex.FEMALE);
        orca.setFins(3);
        orca.setTailSize(TailSize.LARGE);
        orca.setTeethType(TeethType.SHARP);
        System.out.println("This orca is a " + orca.getSex() + ".");
        System.out.println("This orca has " + orca.getFins() + " fins.");
        System.out.println("This orca has a " + orca.getTailSize() + " size tail.");
        orca.eat(orca.getTeethType());
        orca.burstWater();

        System.out.println("\n");

        Mammal blueWhale = new Mammal();
        blueWhale.setSex(Sex.MALE);
        blueWhale.setFins(3);
        blueWhale.setTailSize(TailSize.LARGE);
        blueWhale.setTeethType(TeethType.NONE);
        System.out.println("This bluewhale is a " + blueWhale.getSex() + ".");
        System.out.println("This bluewhale has " + blueWhale.getFins() + " fins.");
        System.out.println("This bluewhale has a " + blueWhale.getTailSize() + " size tail.");
        blueWhale.eat(blueWhale.getTeethType());
        blueWhale.burstWater();

        System.out.println("\n");

        Echinoderm starFish = new Echinoderm();
        starFish.setSex(Sex.FEMALE);
        starFish.setTeethType(TeethType.SHARP);
        System.out.println("This starfish is a " + starFish.getSex() + ".");
        starFish.eat(starFish.getTeethType());
        starFish.shedArm();

        System.out.println("\n");

        Arthropod lobster = new Arthropod();
        lobster.setSex(Sex.MALE);
        lobster.setTailSize(TailSize.MEDIUM);
        lobster.setTeethType(TeethType.SHARP);
        System.out.println("This lobster is a " + lobster.getSex() + ".");
        System.out.println("This lobster has a " + lobster.getTailSize() + " size tail.");
        lobster.eat(lobster.getTeethType());
        lobster.findCover();

        System.out.println("\n");

        System.out.println("----------------------------------------");
        System.out.println("----- *** THANKS FOR VISITING *** ------");
        System.out.println("----------------------------------------");
    }

}

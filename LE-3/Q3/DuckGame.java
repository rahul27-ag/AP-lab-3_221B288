
interface FlyBehavior {
    void fly();
}


interface QuackBehavior {
    void quack();
}


class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("Flying high in the sky!");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}

class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("..."); // Mute duck
    }
}


abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(FlyBehavior fb, QuackBehavior qb) {
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }
    
    void swim() {
        System.out.println("All ducks can swim!");
    }
    
    void performFly() {
        flyBehavior.fly();
    }
    
    void performQuack() {
        quackBehavior.quack();
    }
}


class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFly(), new Squeak());
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new NoFly(), new Mute());
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new FlyWithWings(), new Quack());
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        super(new FlyWithWings(), new Quack());
    }
}


public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();
        
        System.out.println("Rubber Duck:");
        rd.performQuack();
        rd.performFly();
        rd.swim();
        
        System.out.println("\nWooden Duck:");
        wd.performQuack();
        wd.performFly();
        wd.swim();
        
        System.out.println("\nRed Head Duck:");
        rhd.performQuack();
        rhd.performFly();
        rhd.swim();
        
        System.out.println("\nLake Duck:");
        ld.performQuack();
        ld.performFly();
        ld.swim();
    }
}

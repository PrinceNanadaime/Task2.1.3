package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private final Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, @Qualifier("timer") Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }


    private final Animal animal;

    public void whatAnimalSay() {
        System.out.println("\nSay:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime() + "\n");
    }

    public Timer getTimer() {
        return timer;
    }
}
package run;

import core.*;

public class Story {
    public static void main(String[] args) {
        SunnyCityResidents sunnyCityResidents = new SunnyCityResidents();
        System.out.println( sunnyCityResidents.toKnow() );
        FlowersCityResidents flowersCityResidents = new FlowersCityResidents();
        System.out.println(flowersCityResidents.build());
        System.out.println(sunnyCityResidents.help());
        System.out.println(sunnyCityResidents.build());
        InjenerKlepka injenerKlepka = new InjenerKlepka();
        System.out.println(injenerKlepka.developProject());
        OdejnayaFabrica odejnayaFabrica = new OdejnayaFabrica();
        System.out.println(odejnayaFabrica.produceClothes(new Clothes(), new Clothes("лифчиков","резиновых"), new Clothes("шубами","зимними", "из синтетического волокна")));
        Machine machine = new Machine();
        System.out.println( machine.automation(new FlowersCityResidents()) );
        FactoryWorkers factoryWorkers = new FactoryWorkers();
        System.out.println( factoryWorkers.invent(new ClothingStyles()) );
        System.out.println( factoryWorkers.track(new Nothing(), new Audience()) );
        Ponchik ponchik = new Ponchik();
        System.out.println(ponchik.ponyat(new Clothes()));
        System.out.println(ponchik.nedoumevat(new NewSuits("куча костюмов"), new House()));
        OldSuits oldSuits = new OldSuits();
        System.out.println(oldSuits.relevance());
        System.out.println( ponchik.vuibrat(new Night()));
        System.out.println(ponchik.zavyazat(new Knot()));
        System.out.println(oldSuits.getName());
        System.out.println(ponchik.vuinesti(new House()));
        System.out.println(ponchik.utopit());
        System.out.println(ponchik.natascat());
        NewSuits newSuits = new NewSuits();
        System.out.println(newSuits.getName());
        Room room = new Room();
        System.out.println(room.turnInto(new Depot()));
        System.out.println(newSuits.location(new Closed(),new Table(),new BookShelf(),new Wall(),new ChairBacks(),new Ceiling(),new Ropes()));
        System.out.println(ponchik.effect.faint());

    }
}

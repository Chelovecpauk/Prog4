package run;

import core.*;
import util.LinkingWordEnum;
import util.PronounEnum;
import util.RocketReadinessException;

public class Story {
    public static void main(String[] args) {
        FlowersCityResidents flowersCityResidents = new FlowersCityResidents();
        System.out.println(flowersCityResidents.buildRocket());
        System.out.println(flowersCityResidents.goOnSpaceTrip(new Moon()));
        Adventure adventure = new Adventure();
        System.out.println(adventure.happen(LinkingWordEnum.WHERE, PronounEnum.THEM));
        Children children = new Children();
        System.out.println(children.makeSentence(LinkingWordEnum.FOR));
        Neznaika neznaika = new Neznaika();
        System.out.println(neznaika.commit(adventure));
        Time time = new Time();
        System.out.println(time.pass());
        People people = new People();
        System.out.println(people.expressAttitude(LinkingWordEnum.ALTHOUGH,LinkingWordEnum.FOR));
        System.out.println(flowersCityResidents.expressAttitude(LinkingWordEnum.BUT,LinkingWordEnum.FOR,time));
        Knopochka knopochka = new Knopochka();
        Pachkulia pachkulia = new Pachkulia();
        Town town = new Town();
        System.out.println(flowersCityResidents.hearEnough(neznaika,knopochka,pachkulia,town));
        System.out.println(flowersCityResidents.returnBack(LinkingWordEnum.WHEN));
        System.out.println(flowersCityResidents.decide(PronounEnum.MYSELF,PronounEnum.SOME));
        Town cvetochniy = new Town("Цветочный");
        System.out.println(cvetochniy.change());
        System.out.println(cvetochniy.appear());
        Architect vertibutilkin = new Architect();
        System.out.println(vertibutilkin.buildProject());
        FirstBuilding firstBuilding = new FirstBuilding();
        FirstBuilding.Descent descent = firstBuilding.new Descent();
        FirstBuilding.Pool pool = firstBuilding.new Pool();
        System.out.println(descent.designateBuilding());
        System.out.println(pool.declarePool());
        System.out.println(descent.goingDown());
        System.out.println(pool.dive(LinkingWordEnum.ITCOULDBE,LinkingWordEnum.STRAIGHT,new Water()));
        SecondBuilding secondBuilding = new SecondBuilding();
        SecondBuilding.Balcon balcon = secondBuilding.new Balcon();
        SecondBuilding.Tower tower = secondBuilding.new Tower();
        SecondBuilding.Wheel wheel = secondBuilding.new Wheel();
        System.out.println(balcon.designateBuilding());
        System.out.println(tower.declareTower());
        System.out.println(wheel.declareWheel());
        Automobile automobile = new Automobile();
        System.out.println(automobile.appear());
        PrinterTypesOfAutomobile printer = new PrinterTypesOfAutomobile();
        printer.printTypes();


// stopNoticing - исключение обработать
// trevele - исключение обработать


        SunnyCityResidents sunnyCityResidents = new SunnyCityResidents();
        System.out.println( sunnyCityResidents.toKnow() );

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


        Mole mole = new Mole();
        System.out.println(mole.divorce());
        System.out.println(mole.doNotGnaw());
        Ponchik ponchik2 = new Ponchik("Пончику");
        System.out.println(ponchik2.hadToPoison());
        Smell smell = new Smell();
        System.out.println(smell.stood());
        Shorty shorty = new Shorty();
        System.out.println(shorty.fell());
        System.out.println(ponchik.reek());
        System.out.println(ponchik.getUsedTo());
        System.out.println(ponchik.stopNoticing());
        Other other = new Other();
        System.out.println(other.printSentence());
        System.out.println(smell.wasNoticeble());
        System.out.println(ponchik.comeToVisit());
        Owner owner = new Owner();
        Owner.Head head = owner.new Head("голова");
        System.out.println(head.dizzy());
        System.out.println(ponchik.effectDriveAway());
        System.out.println(ponchik.effectOpen());
        System.out.println(ponchik.effectFaint());
        System.out.println(ponchik.effectGoCrazy());
        System.out.println(ponchik.beUnableTo());
        Nobody nobody = new Nobody();
        System.out.println(nobody.doNotWant());
        System.out.println(ponchik.feelOffended());
        System.out.println(ponchik.hadTo());
        Point point = new Point();
        System.out.println(point.be());
        Znaika znaika = new Znaika();
        System.out.println(znaika.visit());
        System.out.println(znaika.met());
        System.out.println(znaika.gotIntoWork());
        Rocket rocket = new Rocket();
        System.out.println(rocket.beReady());
        try {
            System.out.println(znaika.travele(rocket));
        }catch(RocketReadinessException e){
            System.out.println(e.getMessage());
        }
        Travelers travelers = new Travelers();
        System.out.println(travelers.arrive());
        System.out.println(travelers.survey());
        System.out.println(travelers.visitCave());
        Cave cave = new Cave();
        System.out.println(cave.be());
        System.out.println(travelers.makeObservations());
        Gravity gravity = new Gravity();
        System.out.println(gravity.compareGravities());
        System.out.println(gravity.countForMuch());
        System.out.println(znaika.havingBeenOnTheMoon());
        System.out.println(znaika.beForced());
        AirReserves airReserves = new AirReserves("запасов воздуха");
        System.out.println(airReserves.beRunningOut());
        System.out.println(airReserves.otToExist());
        System.out.println(nobody.doNotSuffocate());
        System.out.println(nobody.takeWithYou(airReserves));
        System.out.println(airReserves.getCharacteristic());
        System.out.println(znaika.comeBackHome());
        System.out.println(znaika.tellALot());
        Stories stories = new Stories();
        Astronomer astronomer = new Astronomer();
        System.out.println(stories.interest(astronomer));
        System.out.println(astronomer.observe());
        System.out.println(astronomer.managedToSee());
        Moon moon = new Moon();
        System.out.println(moon.describeSurface());
        System.out.println(moon.describeMountains());
        Scientists scientists = new Scientists();
        Mountains mountains = new Mountains();
        System.out.println(scientists.callMountains(mountains));
        System.out.println(nobody.imagine());
        Crater crater = new Crater();
        System.out.println(crater.issueQuantity());
        System.out.println(crater.bringOutVariety());
        System.out.println(scientists.beInterersted());
        System.out.println(astronomer.quarrel());
        OneHalf oneHalf = new OneHalf();
        System.out.println(oneHalf.approve());
        OtherHalf otherHalf = new OtherHalf();
        System.out.println(otherHalf.approve());
        System.out.println(nobody.call());
        System.out.println(znaika.didNotAgree());
        System.out.println(znaika.createTheory());
        System.out.println(znaika.observe());
        System.out.println(moon.compareSurface());
        System.out.println(znaika.lookOn());
        Pancakes pancakes = new Pancakes();
        System.out.println(pancakes.bake());
        Pancakes pancake = new Pancakes();
        Pancakes.Surface surface = new Pancakes.Surface();
        System.out.println(surface.returnCondition());
        System.out.println(pancake.warmUp(LinkingWordEnum.BUT,LinkingWordEnum.AS));
        Pancakes.Bubbles bubbles = pancake.new Bubbles();
        System.out.println(bubbles.startToAppear("поверхности"));
        System.out.println(bubbles.breakSurface());
        System.out.println(bubbles.burst());
        Holes holes = new Holes();
        System.out.println(holes.appear());
        System.out.println(holes.stay());
        Dough dough = new Dough();
        System.out.println(dough.bake(LinkingWordEnum.WHEN));
        System.out.println(dough.loseViscosity());



    }

}

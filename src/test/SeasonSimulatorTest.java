package test;

import entity.animals.Human;
import entity.baseEntity.animal.Animal;
import entity.baseEntity.food.Food;
import entity.baseEntity.season.Season;
import entity.seasons.SpringSeason;
import enumTypes.AnimalGenus;
import enumTypes.Environment;
import enumTypes.InputType;
import enumTypes.SeasonType;
import enumTypes.validation.ValidationStatus;
import operations.Validation;
import services.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeasonSimulatorTest {
    public static String menuItemTemplate = "%s canli%s %s icin %d'%s,\n";

    public static String menu = "Canli turlerini listelemek icin 1'i,\n" +
                                "Canlilara ait bilgileri listelemek icin 2'yi,\n" +
                                "Canli bilgilerini guncellemek icin 3'u,\n" +
                                "Canli eklemek icin 4'u,\n" +
                                "Canli silmek icin 5'u,\n" +
                                "Mevsimleri listelemek icin 6'i,\n" +
                                "Mevsim bilgilerini guncellemek icin 7'yi,\n" +
                                "Similasyonu baslatmak icin 8'yi,\n" +
                                "Cikis islemi icin 9'i tuslayin: ";

    public static String menuRange3 = "[1-3]";
    public static String menuRange4 = "[1-4]";
    public static String menuRange5 = "[1-5]";
    public static String menuRange9 = "[1-9]";

    public static String subMenu_2_3 = getSubMenuItem(Environment.LAND.getEnvironment(), "lari", "", 1, "i") +
                                       getSubMenuItem(Environment.SEA.getEnvironment(), "lari", "", 2, "yi") +
                                       getSubMenuItem(Environment.SKY.getEnvironment(), "lari", "", 3, "u") +
                                       getSubMenuItem("Tum", "lar", "", 4, "u") +
                                       "Islemi iptal etmek icin 5'i tuslayin: ";

    public static String landAnimals_Add_Delete_Update = AnimalGenus.HUMAN.getAnimalGenus() + " icin 1'i,\n" +
                                                         AnimalGenus.WOLF.getAnimalGenus() + " icin 2'yi,\n" +
                                                         "Iptal icin 3'u tuslayin: ";

    public static String seaAnimals_Add_Delete_Update = AnimalGenus.WHALE.getAnimalGenus() + " icin 1'i,\n" +
                                                        AnimalGenus.SHARK.getAnimalGenus() + " icin 2'yi,\n" +
                                                        "Iptal icin 3'u tuslayin : ";

    public static String skyAnimals_Add_Delete_Update = AnimalGenus.HUMMINGBIRD.getAnimalGenus() + " icin 1'i,\n" +
                                                        AnimalGenus.EAGLE.getAnimalGenus() + " icin 2'yi,\n" +
                                                        "Iptal icin 3'u tuslayin : ";

    public static String landAnimals_ListInfo = AnimalGenus.HUMAN.getAnimalGenus() + " icin 1'i,\n" +
                                                AnimalGenus.WOLF.getAnimalGenus() + " iciin 2'yi,\n" +
                                                "Her ikisi icin 3'u,\n" +
                                                "Iptal icin 4'u tuslayin : ";

    public static String seaAnimals_ListInfo = AnimalGenus.WHALE.getAnimalGenus() + " icin 1'i,\n" +
                                               AnimalGenus.SHARK.getAnimalGenus() + " icin 2'yi,\n" +
                                               "Her ikisi icin 3'u,\n" +
                                               "Iptal icin 4'u tuslayin : ";

    public static String skyAnimals_ListInfo = AnimalGenus.HUMMINGBIRD.getAnimalGenus() + " icin 1'i,\n" +
                                               AnimalGenus.EAGLE.getAnimalGenus() + " icin 2'yi,\n" +
                                               "Her ikisi icin 3'u,\n" +
                                               "Iptal icin 4'u tuslayin : ";

    public static String subMenu_4 = getSubMenuItem(Environment.LAND.getEnvironment(), "si", "eklemek", 1, "i") +
                                     getSubMenuItem(Environment.SEA.getEnvironment(), "si", "eklemek", 2, "yi") +
                                     getSubMenuItem(Environment.SKY.getEnvironment(), "si", "eklemek", 3, "u") +
                                     "Islemi iptal etmek icin 4'u tuslayin: ";

    public static String subMenu_5 = getSubMenuItem(Environment.LAND.getEnvironment(), "si", "silmek", 1, "i") +
                                     getSubMenuItem(Environment.SEA.getEnvironment(), "si", "silmek", 2, "yi") +
                                     getSubMenuItem(Environment.SKY.getEnvironment(), "si", "silmek", 3, "u") +
                                     "Islemi iptal etmek icin 4'u tuslayin: ";

    public static String subMenu_7 = SeasonType.SPRING.getSeason() + " icin 1'i,\n" +
                                     SeasonType.SUMMER.getSeason() + " icin 2'yi,\n" +
                                     SeasonType.AUTUMN.getSeason() + " icin 3'u,\n" +
                                     SeasonType.WINTER.getSeason() + " icin 4'u,\n" +
                                     "Islemi iptal etmek icin 5'i tuslayin: ";


    public static String getSubMenuItem(String animalType, String suffix, String verb, int index, String indexSuffix) {
        return String.format(menuItemTemplate, animalType, suffix, verb, index, indexSuffix);
    }

    public static void printAsUnderLined(String charSet) {
        System.out.println("\033[0;4m" + charSet);
        System.out.print("\033[0;0m");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        List<Season> seasons = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        Human human = new Human();
        animals.add(human);

        SpringSeason springSeason = new SpringSeason();
        seasons.add(springSeason);

        printAsUnderLined("MEVSIM SIMILATOR");
        int chosen = -1;
        String userInput = "";

        while (chosen != 9) {
            System.out.println();
            System.out.print(menu);
            userInput = scanner.next();
            ValidationStatus validationStatus = Validation.validateUserInputType(userInput, InputType.INTEGER);
            if (validationStatus == ValidationStatus.CORRECT) {
                chosen = Integer.parseInt(userInput);

                switch (chosen) {
                    case 1:
                        break;
                    case 2:
                        System.out.println();
                        System.out.print(subMenu_2_3);
                        userInput = scanner.next();
                        validationStatus = Validation.validateUserInputType(userInput, InputType.INTEGER);
                        if (validationStatus == ValidationStatus.CORRECT) {
                            chosen = Integer.parseInt(userInput);
                            switch (chosen) {
                                case 1:
                                    System.out.println();
                                    System.out.print(landAnimals_ListInfo);
                                    userInput = scanner.next();
                                    validationStatus = Validation.validateUserInputType(userInput, InputType.INTEGER);
                                    if (validationStatus == ValidationStatus.CORRECT) {
                                        chosen = Integer.parseInt(userInput);
                                        switch (chosen) {
                                            case 1:
                                                Utility.printAnimalInfoTitle();
                                                for (int i = 0; i < animals.size(); i++) {
                                                    if (animals.get(i) instanceof Human) {
                                                        animals.get(i).printInfo((i + 1));
                                                    }
                                                }
                                                break;
                                            case 2:
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                case 5:
                                    break;
                            }
                        }
                        break;
                    case 3:
                        System.out.println();
                        System.out.print(subMenu_2_3);
                        userInput = scanner.next();
                        break;
                    case 4:
                        break;
                    case 5:
                        System.out.println();
                        System.out.print(subMenu_5);
                        break;
                    case 6:
                        System.out.println();
                        Utility.printSeasonInfoTitle();
                        springSeason.printInfo();

                        break;
                    case 7:
                        System.out.println();
                        System.out.print(subMenu_7);
                        break;
                    case 8:
                        List<AnimalGenus> requiredAnimalGenus = checkAnimals(animals);
                        warnUserForAnimalRequirement(requiredAnimalGenus);
                        List<SeasonType> requiredSeasonTypes = checkSeasons(seasons);
                        warnUserForSeasonRequirement(requiredSeasonTypes);
                        if (Validation.isNull(requiredAnimalGenus)) {
                            System.out.println("Simülasyon Baslatiliyor...");
                            for(Season season : seasons){
                                season.simulateSeason(animals, foods);
                            }
                        }
                        break;
                    case 9:
                        System.out.println("Cikis islemi gerceklestirildi!");
                        chosen = 9;
                        break;
                }
            } else {
                warnUser(validationStatus, menuRange9, InputType.INTEGER);
            }
        }
    }

    public static List<AnimalGenus> checkAnimals(List<Animal> animals) {
        // Listede tum canlı türlerden en az bir nesne olmalı
        // Listede olmayan canlı turleri bir liste halinde geri dondurulmeli
        // Tüm canlı ornekleri mevcut ise null dondurulmeli
        return null;
    }

    public static List<SeasonType> checkSeasons(List<Season> seasons) {
        // Listedeki tum mevsimlerin mevsim normal sicakliklari
        // eksiksiz sekilde girilmis ise null degil ise
        // eksik olan mevsimlerin tipleri dondurulmeli
        return null;
    }

    public static void warnUserForAnimalRequirement(List<AnimalGenus> animalGenusList) {
        if (Validation.isNull(animalGenusList)) return;
        String warnText = "";
        for (AnimalGenus animalGenus : animalGenusList) {
            switch (animalGenus) {
                case WOLF:
                    break;
                case EAGLE:
                    break;
                case HUMAN:
                    break;
                case SHARK:
                    break;
                case WHALE:
                    break;
                case HUMMINGBIRD:
                    break;
            }
        }
    }

    public static void warnUserForSeasonRequirement(List<SeasonType> seasonTypes) {
        if (Validation.isNull(seasonTypes)) return;
        String warnText = "";
        for (SeasonType seasonType : seasonTypes) {
            switch (seasonType){
                case AUTUMN:
                    break;
                case SPRING:
                    break;
                case SUMMER:
                    break;
                case WINTER:
                    break;
            }
        }
    }

    public static void warnUser(ValidationStatus userInputValidationType, String range, InputType inputType){
        if(!Validation.isNull(userInputValidationType)){
            switch (userInputValidationType){
                case INCORRECT_OPERATION_REQUEST:
                    System.out.println("\nGecersiz menu secimi!!!");
                    if(Validation.isNull(range)){
                        System.out.println("Lütfen pozitif tam sayi girisi yapiniz!");
                    }
                    else{
                        System.out.println("Lütfen " + range + " araliginda menu secimi yapiniz!");
                    }
                    break;
                case INCORRECT_INPUT_LENGTH:
                    break;
                case NULL_INPUT:
                    break;
                case EMPTY_INPUT:
                    break;
                case INCORRECT_INPUT_TYPE:
                    System.out.println("\nGecersiz giris!!!");
                    switch (inputType){
                        case INTEGER:
                            if(Validation.isNull(range)){
                                System.out.println("Lütfen pozitif tam sayi girisi yapiniz!");
                            }
                            else{
                                System.out.println("Lütfen " + range + " araliginda pozitif tam sayi girisi yapiniz!");
                            }
                            break;
                        case DOUBLE:
                        case FLOAT:
                            if(Validation.isNull(range)){
                                System.out.println("\nLütfen ondalikli tam sayi girisi yapiniz!");
                            }
                            else{
                                System.out.println("\nLütfen " + range + " araliginda ondalikli tam sayi girisi yapiniz!");
                            }
                            break;
                        case CHAR:
                            if(Validation.isNull(range)){
                                System.out.println("\nLütfen sadece bir adet karakter girisi yapiniz!");
                            }
                            else{
                                System.out.println("\nLütfen " + range + " araliginda sadece bir adet karakter girisi yapiniz!");
                            }
                            break;
                        case STRING:
                            if(Validation.isNull(range)){
                                System.out.println("\nLütfen karakter dizisi girisi yapiniz!");
                            }
                            else{
                                System.out.println("\nLütfen " + range + " araliginda karakter dizisi girisi yapiniz!");
                            }
                            break;
                    }
                    break;
                case UNKNOWN_INPUT_TYPE:
                    break;
                case INCORRECT_INPUT_RANGE:
                    break;
            }
        }
    }
}

package enumTypes;

public enum AnimalGenus {
    HUMAN("İNSAN"),
    WOLF("KURT"),
    WHALE("BALİNA"),
    SHARK("KÖPEKBALIĞI"),
    HUMMINGBIRD("SİNEKKUŞU"),
    EAGLE("KARTAL");

    private String animal;
    AnimalGenus(String animal){
        this.animal = animal;
    }

    public String getAnimalGenus(){
        return this.animal;
    }
}

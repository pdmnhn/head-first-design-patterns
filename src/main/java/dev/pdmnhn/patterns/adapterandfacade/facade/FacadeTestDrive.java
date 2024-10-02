package dev.pdmnhn.patterns.adapterandfacade.facade;

public class FacadeTestDrive {
    public static void main(String[] args) {
        Projector projector = new Projector();
        Player player = new Player();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, player);
        homeTheaterFacade.startMovie("Spider Man Across the Spider-Verse");
        homeTheaterFacade.endMovie();
    }
}

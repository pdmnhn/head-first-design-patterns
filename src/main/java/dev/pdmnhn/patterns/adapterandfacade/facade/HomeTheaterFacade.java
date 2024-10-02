package dev.pdmnhn.patterns.adapterandfacade.facade;

public class HomeTheaterFacade {
    private final Projector projector;
    private final Player player;

    public HomeTheaterFacade(Projector projector, Player player) {
        this.projector = projector;
        this.player = player;
    }

    public void startMovie(String movie) {
        projector.turnOn();
        player.turnOn();
        projector.openScreen();
        player.play(movie);
    }

    public void endMovie() {
        projector.closeScreen();
        player.turnOff();
        projector.turnOff();
    }
}


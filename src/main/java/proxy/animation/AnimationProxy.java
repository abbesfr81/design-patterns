package proxy.animation;

public class AnimationProxy implements Animation {

    protected Film film = null;

    @Override
    public void clic() {
        if (film == null) {
            film = new Film();
            film.charge();
        }
        film.joue();
    }

    @Override
    public void dessine() {
        if (film != null) {
            film.dessine();
        } else {
            System.out.println("affichage de la photo");
        }
    }
}

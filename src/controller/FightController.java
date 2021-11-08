package controller;

public interface FightController {
    boolean isFightEnd();

    void start();

    void round();

    void fightStart();

    void fightEnd();

    void showLog();

    boolean isHeroWin();
}

package state;

public class FightState extends BaseState {
    @Override
    public void doAction(Context context, String action) {
        action = action.toUpperCase();

    }

    @Override
    public void showPrompt(Context context) {

    }
}

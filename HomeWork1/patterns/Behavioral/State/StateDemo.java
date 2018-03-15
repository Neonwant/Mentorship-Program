package pattern.State;

import pattern.State.context.TransformerContext;
import pattern.State.state.FireState;
import pattern.State.state.MoveState;
import pattern.State.state.TransformerState;

public class StateDemo {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();
        TransformerState fireState = new FireState();
        TransformerState moveState = new MoveState();

        context.setState(fireState);
        context.action();

        context.setState(moveState);
        context.action();

    }
}

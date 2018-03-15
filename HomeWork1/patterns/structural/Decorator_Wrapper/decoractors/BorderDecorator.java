package pattern.Decorator_Wrapper.decoractors;

import pattern.Decorator_Wrapper.objects.Component;

public class BorderDecorator extends Decorator {

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...... add border");
    }
}

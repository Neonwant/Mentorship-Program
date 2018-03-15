package pattern.Decorator_Wrapper.decoractors;

import pattern.Decorator_Wrapper.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...... add color");
    }
}

package pattern.Decorator_Wrapper;

import pattern.Decorator_Wrapper.decoractors.BorderDecorator;
import pattern.Decorator_Wrapper.decoractors.ColorDecorator;
import pattern.Decorator_Wrapper.decoractors.Decorator;
import pattern.Decorator_Wrapper.objects.Component;
import pattern.Decorator_Wrapper.objects.TextView;
import pattern.Decorator_Wrapper.objects.Window;

public class DecoratorDemo {
    public static void main(String[] args) {
        // Component with border
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        // Component with border and color (decorator nested into another decorator)
        Component textViewWithBorderAndColor = new ColorDecorator(new BorderDecorator(new TextView()));
        textViewWithBorderAndColor.draw();
    }
}

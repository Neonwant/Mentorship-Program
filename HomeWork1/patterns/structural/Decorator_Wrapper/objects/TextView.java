package pattern.Decorator_Wrapper.objects;

public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("Draw TextView");
    }
}

package taxi.lib;

public final class InjectorUtils {
    private static final Injector TAXI_INSTANCE = Injector.getInstance("taxi");

    private InjectorUtils() {

    }

    public static Injector taxiInstance() {
        return TAXI_INSTANCE;
    }
}

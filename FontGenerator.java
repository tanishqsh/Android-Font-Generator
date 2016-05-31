import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Tanishq on 31-05-2016.
 */
public class FontGenerator {

    Context context;
    Typeface fontGenerated;

    private static final String ATELIEROMEGA = "AtelierOmega.ttf";
    private static final String EARTH_ORBITER = "earthorbiter.ttf";
    private static final String CRONUS = "cronus.otf";
    private static final String ROBOTO_REGULAR = "roboto.ttf";


    public FontGenerator(Context context)
    {
        this.context = context;

    }

    public Typeface getAtelierOmega()
    {
        fontGenerated = Typeface.createFromAsset(context.getAssets(), ATELIEROMEGA);
        return fontGenerated;
    }

    public Typeface getEarthOrbiter()
    {
        fontGenerated = Typeface.createFromAsset(context.getAssets(), EARTH_ORBITER);
        return fontGenerated;
    }

    public Typeface getCronus()
    {
        fontGenerated = Typeface.createFromAsset(context.getAssets(), CRONUS);
        return fontGenerated;
    }

    public Typeface getRobotoRegular()
    {
        fontGenerated = Typeface.createFromAsset(context.getAssets(), ROBOTO_REGULAR);
        return fontGenerated;
    }

}

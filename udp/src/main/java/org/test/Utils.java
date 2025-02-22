package org.test;

public class Utils {

	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Utils.class);

	public static java.util.List<Pixel> getFadeDown( Pixel color, int steps )
        {
                java.util.List<Pixel> pixels = new java.util.ArrayList<>();

                Float brightness = 1.0f;
                Float delta = 1.0f / steps ;
        
                for( int step = 0; step < steps; step++ )
                {
                        brightness = brightness - delta;
                        
                        Pixel pixel = new Pixel( color );
                        pixel.setBrightness( brightness );
                        pixels.add( pixel );
                       
                }

                return pixels;
        }

	public static java.util.List<Pixel> getFadeUp( Pixel color, int steps )
        {
                java.util.List<Pixel> pixels = new java.util.ArrayList<>();

                Float brightness = 0.0f;
                Float delta = 1.0f / steps ;

                for( int step = 0; step < steps; step++ )
                {
                        brightness = brightness + delta;

                        Pixel pixel = new Pixel( color );
                        pixel.setBrightness( brightness );
                        pixels.add( pixel );
                        
                }

                return pixels;
        }
}

package org.aapsasha.abstractFactory.Platforms;

import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersionDirector;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersionDirector;
import org.aapsasha.abstractFactory.Platforms.IParts.IVERSION;
import org.aapsasha.abstractFactory.Platforms.IParts.IVersionDirector;

public class PlatformDirector {
    public static IVersionDirector createPlatform(PLATFORM platform){
        return switch (platform){
            case ANDROID -> new AndroidVersionDirector();
            case IOS -> new IOSVersionDirector();
        };
    }
}

package org.aapsasha.abstractFactory;

import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.ANDROIDVERSION;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVERSION;
import org.aapsasha.abstractFactory.Platforms.PLATFORM;
import org.aapsasha.abstractFactory.Platforms.PlatformDirector;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(PlatformDirector.createPlatform(PLATFORM.IOS).chooseVersion(IOSVERSION.IOS1p0).createAction());
        System.out.println(PlatformDirector.createPlatform(PLATFORM.ANDROID).chooseVersion(ANDROIDVERSION.ANDROID2p0).createSuperAction());
    }
}
package org.aapsasha.abstractFactory.Platforms.IOSPlatforms;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion1p0.IOSVersion1p0Factory;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion2p0.IOSVersion2p0Factory;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion3p0.IOSVersion3p0Factory;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion4p0.IOSVersion4p0Factory;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;
import org.aapsasha.abstractFactory.Platforms.IParts.IVERSION;
import org.aapsasha.abstractFactory.Platforms.IParts.IVersionDirector;

import static org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVERSION.*;

public class IOSVersionDirector extends IVersionDirector {
    @Override
    public IPlatformFactory chooseVersion(IVERSION iosversion) throws Exception {
        return switch ((IOSVERSION)iosversion){

            case IOS1p0 -> new IOSVersion1p0Factory();
            case IOS2p0 -> new IOSVersion2p0Factory();
            case IOS3p0 -> new IOSVersion3p0Factory();
            case IOS4p0 -> new IOSVersion4p0Factory();
            default -> throw new Exception();
        };
    }
}

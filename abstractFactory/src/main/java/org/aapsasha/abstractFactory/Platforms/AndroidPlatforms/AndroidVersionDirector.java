package org.aapsasha.abstractFactory.Platforms.AndroidPlatforms;

import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion1p0.AndroidVersion1p0Factory;
import org.aapsasha.abstractFactory.Platforms.AndroidPlatforms.AndroidVersion2p0.AndroidVersion2p0Factory;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;
import org.aapsasha.abstractFactory.Platforms.IParts.IVERSION;
import org.aapsasha.abstractFactory.Platforms.IParts.IVersionDirector;

public class AndroidVersionDirector extends IVersionDirector {
    @Override
    public IPlatformFactory chooseVersion(IVERSION androidVersion) throws Exception {
        return switch((ANDROIDVERSION)androidVersion){

            case ANDROID1p0 -> new AndroidVersion1p0Factory();
            case ANDROID2p0 -> new AndroidVersion2p0Factory();
            default -> throw new Exception();
        };
    }
}

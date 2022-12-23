package org.aapsasha.abstractFactory.Platforms.IParts;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVERSION;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;
import org.aapsasha.abstractFactory.Platforms.IParts.IVERSION;

public abstract class IVersionDirector {
    public abstract IPlatformFactory chooseVersion(IVERSION version) throws Exception;
}
package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion1p0;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion1p0.IOSVersion1p0Actions.IOSVersion1p0Action;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion1p0.IOSVersion1p0Actions.IOSVersion1p0Option;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion1p0.IOSVersion1p0Actions.IOSVersion1p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class IOSVersion1p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new IOSVersion1p0Action();
    }

    @Override
    public IOption createOption() {
        return new IOSVersion1p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new IOSVersion1p0SuperAction();
    }
}

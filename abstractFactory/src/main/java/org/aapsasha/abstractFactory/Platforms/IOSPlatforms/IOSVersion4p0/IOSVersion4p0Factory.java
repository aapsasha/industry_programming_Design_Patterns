package org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion4p0;

import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion4p0.IOSVersion4p0Actions.IOSVersion4p0Action;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion4p0.IOSVersion4p0Actions.IOSVersion4p0Option;
import org.aapsasha.abstractFactory.Platforms.IOSPlatforms.IOSVersion4p0.IOSVersion4p0Actions.IOSVersion4p0SuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IAction;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.IOption;
import org.aapsasha.abstractFactory.Platforms.IParts.Actions.ISuperAction;
import org.aapsasha.abstractFactory.Platforms.IParts.IPlatformFactory;

public class IOSVersion4p0Factory extends IPlatformFactory {
    @Override
    public IAction createAction() {
        return new IOSVersion4p0Action();
    }

    @Override
    public IOption createOption() {
        return new IOSVersion4p0Option();
    }

    @Override
    public ISuperAction createSuperAction() {
        return new IOSVersion4p0SuperAction();
    }
}
